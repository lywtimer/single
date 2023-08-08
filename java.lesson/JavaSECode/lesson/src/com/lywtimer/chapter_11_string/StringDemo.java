package com.lywtimer.chapter_11_string;

import org.junit.Test;

/**
 * ClassName: StringDemo
 * Package: com.lywtimer.chapter_11_string
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 19:16
 */
public class StringDemo {
    @Test
    public void test1() {
        String s1 = "hello";//字面量定义方式,存储在字符串常量池中,基于GC的考虑
        String s2 = "hello";
        String s3 = new String("hello");//创建对象的方式
        String s4 = new String("hello");
        System.out.println(s1 == s2); //true
        System.out.println(s3 == s4); //false
        System.out.println(s1 == s3); //false
    }

    @Test
    public void test2() {
        int i = 0xfff;
        System.out.println(i);
        String str = Integer.toString(i);
        String newStr = str.replace('0', '零');
        System.out.println(newStr);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4); //true
        System.out.println(s3 == s5); //false
        System.out.println(s3 == s6); //false
        System.out.println(s3 == s7); //false
        String s8 = s5.intern();
        System.out.println(s3 == s8); //true

    }
    
    @Test
    public void test4(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s5 == s4);
    }
}
