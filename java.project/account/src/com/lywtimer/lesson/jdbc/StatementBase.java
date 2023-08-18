package com.lywtimer.lesson.jdbc;

import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: StatementBase
 * Package: com.lywtimer.lesson.jdbc
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 17:07
 */
public class StatementBase {
    public static final Properties PROPERTIES;

    static {
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.读取配置
            PROPERTIES = new Properties();
            PROPERTIES.load(ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties"));
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
