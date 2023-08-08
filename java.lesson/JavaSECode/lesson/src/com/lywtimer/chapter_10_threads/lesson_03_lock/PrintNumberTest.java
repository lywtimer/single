package com.lywtimer.chapter_10_threads.lesson_03_lock;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * ClassName: PrintNumberTest
 * Package: com.lywtimer.chapter_10_threads.lesson_03_lock
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 14:41
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        //3.创建callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.
        FutureTask futureTask = new FutureTask(numThread);

        Thread t = new Thread(futureTask);
        t.start();
        try {
            //6.获取callable中call方法的返回值
            Object sum = futureTask.get();
            System.out.println("总和为:" + sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class NumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
            Thread.sleep(100);
        }
        return sum;
    }
}