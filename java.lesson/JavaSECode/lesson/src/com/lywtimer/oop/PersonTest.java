package com.lywtimer.oop;

/**
 * ClassName: PersonTest
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/27 23:08
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.phone = new Phone();
        p.name = "小天";
        p.phone.price = 2888.8;
        p.setAge(28);
        p.setGender('男');
        System.out.println(p.name);
        p.showPersonInfo(3);
    }
}
