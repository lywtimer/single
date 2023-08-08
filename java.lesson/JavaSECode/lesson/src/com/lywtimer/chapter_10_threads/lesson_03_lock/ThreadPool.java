package com.lywtimer.chapter_10_threads.lesson_03_lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName: ThreadPool
 * Package: com.lywtimer.chapter_10_threads.lesson_03_lock
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 14:59
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        final ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        //设置线程池的属性
        service.setMaximumPoolSize(50);

        PrintOddNumber cmd1 = new PrintOddNumber();
        PrintEvenNumber cmd2 = new PrintEvenNumber();
        //2.执行指定的线程的操作
        service.execute(cmd1);
        service.execute(cmd2);

        //3.关闭连接池
        service.shutdown();
    }
}


class PrintEvenNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("**" + Thread.currentThread().getName()+ "**" + i);
            }
        }
    }
}

class PrintOddNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0){
                System.out.println("**" + Thread.currentThread().getName()+ "**" + i);
            }
        }
    }
}