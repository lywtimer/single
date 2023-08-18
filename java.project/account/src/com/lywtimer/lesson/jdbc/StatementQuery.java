package com.lywtimer.lesson.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Arrays;
import java.util.Properties;

/**
 * ClassName: StatementQuery
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 7:42
 */
public class StatementQuery {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //通过ClassLoader加载指定的配置文件
        Properties p = new Properties();
        InputStream f = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        p.load(f);
        final String host = p.getProperty("host", "127.0.0.1");
        final String user = p.getProperty("user", "root");
        final String pwd = p.getProperty("password", "root");
        String driver = "com.mysql.cj.jdbc.Driver";
        final Class<Driver> clazz = (Class<Driver>) Class.forName(driver);
        final Constructor<Driver> constructor = clazz.getDeclaredConstructor();
        //1.注册驱动 8+ com.mysql.cj.jdbc.Driver
        DriverManager.registerDriver(constructor.newInstance());

        //2.获取连接
        final Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + "/test", user, pwd);

        //3.创建 statement
        final Statement statement = connection.createStatement();

        //4.发送 sql 语句,并获取返回结果
        String sql = "select * from t_user;";
        final ResultSet resultSet = statement.executeQuery(sql);

        //5.进行结果解析
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String account = resultSet.getString("account");
            String password = resultSet.getString("PASSWORD");
            String nick = resultSet.getString("nickname");
            System.out.println(Arrays.asList(id, account, password, nick));
        }

        //6.关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
