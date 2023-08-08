package com.lywtimer.chapter_10_threads.lesson_03_lock;

/**
 * ClassName: DeadLockTest
 * Package: com.lywtimer.chapter_10_threads
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 12:12
 */
public class DeadLockTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}

class Bank{
    private Bank(){

    }
    private static volatile Bank instance = null;

    public static synchronized Bank getInstance(){
        if (instance == null) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new Bank();
        }
        return instance;
    }

    public static Bank getInstance2(){
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
