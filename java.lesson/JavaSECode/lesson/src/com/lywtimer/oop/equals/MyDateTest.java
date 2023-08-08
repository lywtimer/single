package com.lywtimer.oop.equals;

/**
 * ClassName: MyDateTest
 * Package: com.lywtimer.oop.equals
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 12:36
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(7, 7, 2023);
        MyDate d2 = new MyDate(7, 7, 2023);

        System.out.println("d1 == d2 :" + (d1 == d2));
        System.out.println("d1.equals(d2) :" + d1.equals(d2));
        System.out.println(d1);
        MyDate.callBack();
        d1.callBack();
        d1 = null;
        d1.callBack();
        System.out.println(d1.birthday);
    }
}
