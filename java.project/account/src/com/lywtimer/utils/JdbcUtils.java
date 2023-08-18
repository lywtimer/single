package com.lywtimer.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName: JdbcUtils
 * Package: com.lywtimer.utils
 * Description:
 * v1.0版本工具类
 *  内容包含一个连接池对象,并且提供获取连接和回收连接的方法
 *  工具类的方法推荐是静态方法
 * v2.0
 *  利用线程本地变量保存连接池对象
 *  确保线程的多个方法可以获取同一个连接对象
 * @Author lywtimer
 * @Create 2023/8/17 7:00
 */
public class JdbcUtils {
    private static DataSource dataSource;
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    static {

        try {
            //1.读取配置文件
            Properties properties = new Properties();

            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(in);

            //2.使用连接池的工具类的工程模式,创建连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection() throws SQLException {
        //3.获取连接
        Connection connection = threadLocal.get();
        if (connection == null) {
            System.out.println("------- 创建一个线程本地变量 -------");
            connection = dataSource.getConnection();
            threadLocal.set(connection);
        }
        return connection;
    }

    public static void recycle(Connection connection) throws SQLException {
        //4.回收连接
        connection.close();
    }

    public static void recycle() throws SQLException {
        Connection connection = threadLocal.get();
        if (connection == null) {
            return;
        }
        System.out.println("------- 清空线程本地变量 -------");
        //清空线程本地变量
        threadLocal.remove();
        //设置自动提交
        connection.setAutoCommit(true);
        //回收连接
        connection.close();
    }
}
