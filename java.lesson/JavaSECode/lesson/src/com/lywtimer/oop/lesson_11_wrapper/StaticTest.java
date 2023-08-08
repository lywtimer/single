package com.lywtimer.oop.lesson_11_wrapper;

import org.junit.Test;

/**
 * ClassName: StaticTest
 * Package: com.lywtimer.oop.lesson_11_wrapper
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 12:20
 */
public class StaticTest {
    @Test
    public void test1(){
        Person p = new Student();
        p.eat();
        Student s = new Student();
        s.eat();
        Student.eat();
    }
}

class Person{
    public static void eat(){
        System.out.println("人吃饭");
    }
}
class Student extends Person{
    public static void eat(){
        System.out.println("学生吃饭");
    }
}
