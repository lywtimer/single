package com.lywtimer.chapter_10_threads.lesson_02_sequence;

/**
 * ClassName: ThreadSequenceTest
 * Package: com.lywtimer.chapter_10_threads.lesson_02_sequence
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 8:37
 */
public class ThreadSequenceTest {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        B b = new B(a);
        b.start();
        //子类调用
//        A t = new B();
//        t.start(); //run B
    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("run A");
    }
}

class B extends Thread{
    private A a;
    @Override
    public void run() {
        System.out.println("run B");
    }

    public B(A a) {
        super(a);
    }
}
class C implements Runnable {

    @Override
    public void run() {
        System.out.println("run C");
    }
}
