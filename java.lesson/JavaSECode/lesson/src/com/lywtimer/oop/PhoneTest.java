package com.lywtimer.oop;

/**
 * ClassName: PhoneTest
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/27 0:00
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.call();
        p2.sendMessage("你是谁?");
    }
}
