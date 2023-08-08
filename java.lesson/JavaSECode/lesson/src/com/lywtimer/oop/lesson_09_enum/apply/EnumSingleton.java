package com.lywtimer.oop.lesson_09_enum.apply;

/**
 * ClassName: EnumSingleton
 * Package: com.lywtimer.oop.lesson_09_enum.apply
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 6:33
 */
public class EnumSingleton {

}

//jdk5.0之前使用枚举类定义单例模式
class Bank{
    private Bank(){}
    public static final Bank instance = new Bank();
}

//5.0之后枚举类定义单例模式
enum School{
    THU;
}

enum GirlFriend{
    HERBEN(20);
    private final int age;

    private GirlFriend(int age) {
        this.age = age;
    }
}

