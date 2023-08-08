package com.lywtimer.oop.lesson_10_annotation;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JUnitTest
 * Package: com.lywtimer.oop.lesson_10_annotation
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 7:14
 */
public class JUnitTest {
    @Test
    public void test_use(){
        System.out.println("使用JUnit测试运行");
    }
    @Test
    public void test_use_scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int inputNum = scanner.nextInt();
        System.out.println(inputNum);
        scanner.close();
    }

}
