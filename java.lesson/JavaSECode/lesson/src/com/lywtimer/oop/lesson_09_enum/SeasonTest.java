package com.lywtimer.oop.lesson_09_enum;

import com.lywtimer.oop.lesson_09_enum.apply.Employee;
import com.lywtimer.oop.lesson_09_enum.apply.Status;

/**
 * ClassName: SeasonTest
 * Package: com.lywtimer.oop.lesson_09_enum
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 16:32
 */
public class SeasonTest {
    public static void main(String[] args) {

        //简化写法
        Employee e = new Employee("James", 39, Status.BUSY);
        System.out.println(e);
        //枚举类的使用和常用方法
        System.out.println(Season.spring.getSeasonName());
        System.out.println(Season2.SUMMER.getSeasonName());
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.SUMMER.toString());
    }
}
