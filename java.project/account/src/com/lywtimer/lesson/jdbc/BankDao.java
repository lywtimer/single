package com.lywtimer.lesson.jdbc;

import com.lywtimer.utils.JdbcUtils;

import java.sql.*;

/**
 * ClassName: BankDao
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 19:58
 */
public class BankDao extends StatementBase{

    private Connection connection;

    public BankDao() throws SQLException {
        this.connection = JdbcUtils.getConnection();
    }

    public BankDao(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void add(String account, int money) {
        String sql = "UPDATE `t_bank` SET `money` = `money` + ? WHERE `account` = ?";
        try (
             PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, money);
            statement.setString(2, account);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sub(String account, int money) {
        String sql = "UPDATE `t_bank` SET `money` = `money` - ? WHERE `account` = ? and `money` > ?";

        try (
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, money);
            statement.setString(2, account);
            statement.setInt(3, money);
            final int i = statement.executeUpdate();
            if (i == 0) {
                throw new RuntimeException("余额不足");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
