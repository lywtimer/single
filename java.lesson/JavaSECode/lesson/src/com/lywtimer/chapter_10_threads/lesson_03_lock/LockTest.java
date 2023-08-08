package com.lywtimer.chapter_10_threads.lesson_03_lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: LockTest
 * Package: com.lywtimer.chapter_10_threads.lesson_03_lock
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 13:41
 */
public class LockTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 = new Thread(p, "线程 A");
        Thread t2 = new Thread(p, "线程 B");
        Thread t3 = new Thread(p, "线程 C");
        t1.start();
        t2.start();
        t3.start();
//
//        Window w1 = new Window();
//        Window w2 = new Window();
//
//        w1.setName("窗口 A");
//        w2.setName("窗口 B");
//
//        w1.start();
//        w2.start();
    }
}

class Window extends Thread{
    private static int ticket = 10;

    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            try {
//                lock.lock();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + " 售票号:" + (ticket--));
            } finally {
//                lock.unlock();
            }
        }
    }
}

class PrintNumber implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if (number <= 20) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
