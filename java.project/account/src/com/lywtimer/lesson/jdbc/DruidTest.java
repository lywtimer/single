package com.lywtimer.lesson.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.lywtimer.utils.JdbcUtils;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ClassName: DruidTest
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 21:20
 */
public class DruidTest {
    /**
     * 直接使用代码设置连接池连接参数方式
     * 1.创建连接池对象
     * 2.设置连接池连接参数
     * 3.获取连接[通用方法,所有连接池都一样]
     * 4.回收连接[通用方法,所有连接池都一样]
     */
    @Test
    public void test1() throws SQLException {
        String url = String.format("jdbc:mysql://%s/test", StatementBase.PROPERTIES.getProperty("host"));
        DruidDataSource dataSource = new DruidDataSource();
        //必须参数
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(StatementBase.PROPERTIES.getProperty("username"));
        dataSource.setPassword(StatementBase.PROPERTIES.getProperty("password"));
        //非必须参数
        dataSource.setInitialSize(5);
        dataSource.setMinIdle(5);
        dataSource.setMaxActive(20);
        dataSource.setMaxWait(60000);
        //获取连接
        DruidPooledConnection connection = dataSource.getConnection();

        //连接操作
        PreparedStatement statement = connection.prepareStatement("select * from t_bank where money > ?");
        statement.setInt(1, 500);
        final ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                System.out.println(resultSet.getMetaData().getColumnLabel(i) + ":" + resultSet.getObject(i));
            }
        }
        statement.close();
        //回收连接
        connection.close();

    }

    /**
     * 通过读取配置文件获取连接池连接参数方式
     * 1.读取外部配置文件 Properties
     * 2.使用连接池的工具类的工程模式,创建连接池对象
     */
    @Test
    public void test2() throws Exception {
        //读取外部配置文件
        Properties properties = new Properties();
        InputStream inputStream = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(inputStream);

        //2.使用连接池的工具类的工程模式,创建连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //3.获取连接
        Connection connection = dataSource.getConnection();


        PreparedStatement statement = connection.prepareStatement("select * from t_bank where money > ?");
        statement.setInt(1, 500);
        final ResultSet resultSet = statement.executeQuery();
        ArrayList<String> list = new ArrayList<>();
        while (resultSet.next()) {
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                list.add(resultSet.getMetaData().getColumnLabel(i) + ":" + resultSet.getObject(i));
            }
        }
        System.out.println(list);
        statement.close();

        //4.回收连接
        connection.close();

    }

    /**
     * 基于Druid工具类的连接池
     * */
    @Test
    public void test3(){
        try {
            //获取连接
            Connection connection = JdbcUtils.getConnection();

            //连接后的CURD
            PreparedStatement statement = connection.prepareStatement("select * from t_bank where money >?");
            statement.setInt(1, 500);
            final ResultSet resultSet = statement.executeQuery();
            ArrayList<Map<String,Object>> list = new ArrayList<>();
            while (resultSet.next()) {
                Map<String,Object> map = new HashMap<>();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    map.put(resultSet.getMetaData().getColumnLabel(i), resultSet.getObject(i));
                }
                list.add(map);
            }
            System.out.println(list);
            statement.close();

            //回收连接
            JdbcUtils.recycle(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() throws SQLException {
        final UserDao dao = new UserDao();
        dao.executeUpdate("update t_user set PASSWORD = ? WHERE id >= ? AND id <=?", "random123456", 10, 20);

        dao.executeUpdate("update t_user set PASSWORD = ? WHERE id >= ? AND id <=?", "random7890", 100, 200);
    }
}
