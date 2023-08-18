package com.lywtimer.lesson.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ClassName: StatementTransaction
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 17:17
 */
public class StatementTransactionTest extends StatementBase {

    @Test
    public void test1(){
//        System.out.println(PROPERTIES.getProperty("host", "localhost:3306"));
//        BankDao dao = new BankDao();
//        dao.add("lywtimer", 100);

        BankService.transfer("zhuangzhou", "zhuge", 300);
        BankService.transferV2("lywtimer", "zhuangzhou", 3000);

    }
}
