package com.lywtimer.chapter_10_threads.lesson_02_sequence;

/**
 * ClassName: ThreadLifecycleTest
 * Package: com.lywtimer.chapter_10_threads
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 10:40
 */
public class ThreadLifecycleTest {
    public static void main(String[] args) {
        SaleTicket seller = new SaleTicket();
        Thread t1 = new Thread(seller);
        Thread t2 = new Thread(seller);
        Thread t3 = new Thread(seller);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口-1");
        w2.setName("窗口-2");
        w3.setName("窗口-3");

        w1.start();
        w2.start();
        w3.start();
    }
}
class SaleTicket implements Runnable{
    private int money = 5;
    final Object obj = new Object();
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this) {
                if (money <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + " 售票号:" + (money--));
            }
        }
    }
}
class Window extends Thread{
    private static int money = 15;
    final Object obj = new Object();
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Window.class) {
                if (money <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + " 售票号:" + (money--));
            }
        }
    }
}



