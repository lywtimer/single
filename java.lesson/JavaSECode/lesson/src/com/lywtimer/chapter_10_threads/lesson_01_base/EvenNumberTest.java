package com.lywtimer.chapter_10_threads.lesson_01_base;

import org.junit.Test;

/**
 * ClassName: EvenNumberTest
 * Package: com.lywtimer.chapter_10_threads.lesson_01_base
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 7:38
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        //实现接口写法
        Person p = new Person();
        new Thread(p).start();
        new Thread(p).start();
        //标准写法
        PrintNumber p1 = new PrintNumber();
        PrintOddNumber p2 = new PrintOddNumber();
        p1.start();
        p2.start();
        //匿名写法
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0){
                        System.out.println("**" + Thread.currentThread().getName()+ "**" + i);
                    }
                }
            }
        }.start();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("**" + Thread.currentThread().getName()+ "**" + i);
            }
        }
    }
    @Test
    public void test1(){
        Person p = new Person();
        new Thread(p).start();
        new Thread(p).start();
    }
}
class PrintNumber extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("**" + Thread.currentThread().getName()+ "**" + i);
            }
        }
    }
}

class PrintOddNumber extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0){
                System.out.println("**" + Thread.currentThread().getName()+ "**" + i);
            }
        }
    }
}

class Person implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("**" + Thread.currentThread().getName()+ "** work:" + i);
        }
    }
}
