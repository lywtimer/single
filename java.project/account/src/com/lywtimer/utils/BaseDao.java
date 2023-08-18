package com.lywtimer.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: BaseDao
 * Package: com.lywtimer.utils
 * Description:
 *  封装数据库操作的基类
 *
 * @Author lywtimer
 * @Create 2023/8/17 9:43
 */
public abstract class BaseDao<E> {

    protected Connection connection;

    {
        //获取链接
        try {
            connection = JdbcUtils.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 执行sql语句
     * */
    public int executeUpdate(String sql, Object... params) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        int i = 1;
        for (Object param : params) {
            statement.setObject(i++, param);
        }
        final int rows = statement.executeUpdate();
        statement.close();
        //如果没有开启事务,回收连接
        if (connection.getAutoCommit()) {
            JdbcUtils.recycle();
        }
        return rows;
    }

    /**
     * 查询语句
     * @return List<T>
     * */
    public <T> List<T> executeQuery(Class<T> clazz, String sql, Object... params) throws SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        PreparedStatement statement = connection.prepareStatement(sql);
        int i = 1;
        for (Object param : params) {
            statement.setObject(i++, param);
        }
        final ResultSet resultSet = statement.executeQuery();
        List<T> list = new ArrayList<>();

        while (resultSet.next()) {
            final Constructor<T> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            T t = constructor.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    field.set(t, resultSet.getObject(field.getName()));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            list.add(t);
        }

        resultSet.close();
        statement.close();

        //如果没有开启事务,回收连接
        if (connection.getAutoCommit()) {
            JdbcUtils.recycle();
        }
        return list;
    }
}
