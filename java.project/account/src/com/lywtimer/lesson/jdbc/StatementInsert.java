package com.lywtimer.lesson.jdbc;

import org.junit.Test;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * ClassName: StatmentInsert
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 13:14
 */
public class StatementInsert {

    @Test
    public void testLastInsertId(){
        try {
            //1.驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.连接数据库
            //2.1 读取配置
            Properties properties = new Properties();
            properties.load(StatementInsert.class.getClassLoader().getResourceAsStream("info.properties"));
            //2.2 连接数据库
            String url = String.format("jdbc:mysql://%s/test", properties.getProperty("host"));
            System.out.println(url);
            Connection connection = DriverManager.getConnection(url, properties);
            //3.创建语句
            String sql = "INSERT INTO t_user(`account`,`PASSWORD`,`nickname`) VALUES (?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //记录时间
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                statement.setObject(1, "lywtimer" + String.valueOf(Math.random()).substring(10));
                statement.setObject(2, "5678");
                statement.setObject(3, "天罡正气");
                //4.执行sql语句
                int success = statement.executeUpdate();
                if (success > 0) {
                    final ResultSet resultSet = statement.getGeneratedKeys();
                    resultSet.next();
                    System.out.println("插入数据成功,即将获取id:" + resultSet.getInt(1));
                } else {
                    System.out.println("插入数据失败");
                }
            }
            System.out.println("耗时:" + (System.currentTimeMillis() - start) + "毫秒");


            //5.关闭资源
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void testBatchInsert(){
        try {
            //1.驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.连接数据库
            //2.1 读取配置
            Properties properties = new Properties();
            properties.load(StatementInsert.class.getClassLoader().getResourceAsStream("info.properties"));
            //2.2 连接数据库
            String url = String.format("jdbc:mysql://%s/test?rewriteBatchedStatements=true", properties.getProperty(
                    "host"));
            System.out.println(url);
            Connection connection = DriverManager.getConnection(url, properties);
            //3.创建语句
            String sql = "INSERT INTO t_user(`account`,`PASSWORD`,`nickname`) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            //记录时间
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                String account = "java" + Integer.toHexString(i);
                statement.setObject(1, account);
                statement.setObject(2, "995841");
                statement.setObject(3, "java程序员" + i);
                //4.执行sql语句
                statement.addBatch();
            }
            statement.executeBatch();
            System.out.println("耗时:" + (System.currentTimeMillis() - start) + "毫秒");


            //5.关闭资源
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test3(){
        System.out.println(String.valueOf(System.currentTimeMillis()).substring(0, 10));
        System.out.println(String.valueOf(Math.random()).substring(10));
    }

}
