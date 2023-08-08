package com.lywtimer.chapter_09_throwable.lesson_01_error;

import org.junit.Test;

/**
 * ClassName: ErrorTest
 * Package: com.lywtimer.chapter_09_throwable.lsson_01_error
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 12:45
 */
public class ErrorTest {

    @Test
    public void test1(){
        //1.StackOverflowError（栈内存溢出）
//        loop();
        //2.OutOfMemoryError（堆内存溢出，简称OOM）
//        byte[] arr = new byte[1024*1024*100];
    }

    public static void loop(){
        loop();
    }
}
