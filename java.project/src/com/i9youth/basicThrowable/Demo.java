package com.i9youth.basicThrowable;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws MemoryException {

        int[] arr = new int[1024 * 1024];

        System.out.println(arr.length);

        test(11);


        System.out.println("=====end=====");

        //装箱
        Integer i = new Integer(10);
        Integer i2 = Integer.valueOf("20");

        System.out.println(i);
        System.out.println(i2);
        //拆箱
        int num = i.intValue();
        System.out.println(num);
        //自动拆/装箱
        Integer i3 = 100;
        i3 = i3 + 20;
        System.out.println(i3);
        System.out.println("=====基本数据类型和字符串的转换=====");
        int a = 3467;
        String s = a + "";
        int a1 = Integer.parseInt(s);
        float a2 = Float.parseFloat(s);
        System.out.println(s);
        System.out.println(a1);
        System.out.println(a2);

    }

    public static void test(int age) throws MemoryException {
        if (age > 100) {
            throw new MemoryException("年龄太大了");
        }
    }
}


class MemoryException extends Exception {
    public MemoryException(String msg) {

    }
}