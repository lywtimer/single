package com.lywtimer.chapter_11_string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Package: com.lywtimer.chapter_11_string
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 21:37
 */
public class StringMethodTest {
    @Test
    public void test1(){
        //String的构造器
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);
    }

    /**
     * String 与常见其它结构之间的转换
     *
    * */
    @Test
    public void test2(){
        int num = 10;
        //基本数据类型 ---> String
        //方式一
        String s1 = num + "";
        //方式二
        String s2 = String.valueOf(num);

        //String ---> 基本数据类型
        int i3 = Integer.parseInt("123");
    }


    @Test
    public void test3() throws UnsupportedEncodingException {
        //String ---> char[]
        String str = "hello,你好";
        final char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //String ---> byte[]
        final byte[] bytes = str.getBytes();//使用默认字符集
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //编码
        final byte[] bytes2 = str.getBytes("gbk");//使用指定字符集
        for (byte b : bytes2) {
            System.out.println(b);
        }
        //解码
        System.out.println(new String(bytes2));
        System.out.println(new String(bytes2, "gbk"));
    }
    
    @Test
    public void test4(){
        String s1 = "abc";
        String s2 = new String();
        String s3 = new String("");
        String s4 = null;
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        System.out.println(s3.length());
        System.out.println(s1.equalsIgnoreCase("ABC"));
//        System.out.println(s4.isEmpty()); //NullPointerException
        String s5 = "中";
        String s6 = "国";
        System.out.println(s5.compareTo(s6));
    }
}
