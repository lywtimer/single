package com.lywtimer.lesson.jdbc;

import com.lywtimer.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ClassName: BankService
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 20:23
 */
public class BankService {
    public static void transfer(String from, String to, int amount) {
        String url = String.format("jdbc:mysql://%s/test", StatementBase.PROPERTIES.getProperty("host"));
        try (Connection connection = DriverManager.getConnection(url, StatementBase.PROPERTIES)){
            //开启事务
            connection.setAutoCommit(false);
            BankDao dao = new BankDao(connection);
            System.out.println("---------------执行转入-----------------");
            dao.add(to, amount);
            System.out.println("---------------执行转出-----------------");
            dao.sub(from, amount);
            System.out.println("---------------执行完成,提交事务-----------------");
            connection.commit();
        } catch (Exception e) {
            System.out.println("---------------执行异常,数据回滚-----------------");
            e.printStackTrace();
        }

    }
    public static void transferV2(String from, String to, int amount) {

        try {
            Connection connection = JdbcUtils.getConnection();
            //开启事务
            connection.setAutoCommit(false);
            BankDao dao = new BankDao();
            System.out.println("---------------执行转入-----------------");
            dao.add(to, amount);
            System.out.println("---------------执行转出-----------------");
            dao.sub(from, amount);
            System.out.println("---------------执行完成,提交事务-----------------");
            connection.commit();
        } catch (Exception e) {
            System.out.println("---------------执行异常,数据回滚-----------------");
            e.printStackTrace();
        } finally {
            try {
                JdbcUtils.recycle();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
