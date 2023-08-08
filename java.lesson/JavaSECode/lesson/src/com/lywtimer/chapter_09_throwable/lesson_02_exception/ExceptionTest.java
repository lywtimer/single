package com.lywtimer.chapter_09_throwable.lesson_02_exception;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Package: com.lywtimer.chapter_09_throwable.lsson_02_exception
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 12:56
 */
public class ExceptionTest {
    @Test
    public void test2(){

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println("输入的数字是:" + num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("未知的异常:" + e.getMessage());
        } finally {
            System.out.println("无论如何都会执行");
            assert scanner != null;
            scanner.close();
        }

    }
    @Test
    public void test1(){
        //ArrayIndexOutOfBoundsException
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(10/0);
    }
}
