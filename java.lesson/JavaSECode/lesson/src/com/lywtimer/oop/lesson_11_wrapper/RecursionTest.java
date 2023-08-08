package com.lywtimer.oop.lesson_11_wrapper;

import org.junit.Test;

/**
 * ClassName: RecursionTest
 * Package: com.lywtimer.oop.lesson_11_wrapper
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 8:51
 */
public class RecursionTest {
    final Integer i = 0;

    @Test
    public void test2(){
        //public static final double PI = 3.14159265358979323846;
        System.out.println(Math.PI);
        System.out.println(i);
    }
    @Test
    public void test(){
//        recursion(0);//3
//        recursion(1);//7
    }

    private static int count = 0;
    public static int recursion(int k) {
        count++;
        System.out.println("count:" + count + " k:" + k);
        if (k < 0) {
            return 0;
        }
        return recursion(k - 1) + recursion(k - 2);//15
    }
}
