package com.lywtimer.lesson.jdbc;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * ClassName: StatementLogin
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 8:30
 */
public class StatementLogin {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        final String account = scanner.nextLine();
        System.out.println("请输入密码");
        final String pwd = scanner.nextLine();


        //注册驱动类
        //通过ClassLoader加载指定的配置文件
        Properties p = new Properties();
        InputStream f = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        p.load(f);
        final String host = p.getProperty("host", "127.0.0.1");
        //1.注册数据库驱动
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        //2.连接数据库
        final Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + "/test", p);

        //4.发送 sql 语句
        String sql = "SELECT * FROM t_user WHERE account= ? AND PASSWORD = ?";

        //3.创建 statement 对象
        // createStatement 执行静态语句
        final PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, account);
        statement.setObject(2, pwd);

        //4.2 获取执行结果
        final ResultSet resultSet = statement.executeQuery();

        //5.解析结果
        int id = 0;
        if (resultSet.next()) {
            id = resultSet.getInt("id");
            System.out.println("找到了用户 [" + id + "]");
        } else {
            System.out.println("用户名或密码不正确");
        }


        resultSet.close();
        statement.close();
        connection.close();
        scanner.close();
    }
    @Test
    public void testInsert() throws Exception {

        //注册驱动类
        //通过ClassLoader加载指定的配置文件
        Properties p = new Properties();
        InputStream f = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        p.load(f);
        final String host = p.getProperty("host", "127.0.0.1");
        //1.注册数据库驱动
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        //2.连接数据库
        final Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + "/test", p);

        //4.发送 sql 语句
        String sql = "INSERT INTO t_user(account,PASSWORD,nickname) VALUES (?,?,?)";

        //3.创建 statement 对象
        // createStatement 执行静态语句
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, "mayun" + (int)(Math.random() * 1000));
        statement.setObject(2, "123456");
        statement.setObject(3, "李雷");


        //4.2 获取执行结果
        final int resultSet = statement.executeUpdate();

        //5.解析结果
        System.out.println("执行结果,影响行数:" + resultSet);

        statement.close();
        connection.close();
    }
    
    /**
     * 查询所有用户数据,并且封装到一个List<Map>中
     * */
    @Test
    public void testSelect(){
        try {
            //1.驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.连接
            //2.1读取配置文件
            Properties props = new Properties();
            props.load(ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties"));
            String url = String.format("jdbc:mysql://%s/test", props.getProperty("host"));
            System.out.println(url);
            Connection connection = DriverManager.getConnection(url, props.getProperty("user"), props.getProperty(
                    "password"));
            //3.创建statement
            Statement stmt = connection.createStatement();
            //4.执行sql
            String sql = "SELECT id,nickname as nick,PASSWORD as pwd,account FROM t_user";
            ResultSet rs = stmt.executeQuery(sql);
            //5.解析结果
            List<Map<String, Object>> list = new ArrayList<>();
            while (rs.next()) {
                Map<String, Object> map = new HashMap<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    map.put(rs.getMetaData().getColumnLabel(i), rs.getObject(i));
                }
                list.add(map);
            }
            System.out.println(list);

        } catch (ClassNotFoundException | SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
