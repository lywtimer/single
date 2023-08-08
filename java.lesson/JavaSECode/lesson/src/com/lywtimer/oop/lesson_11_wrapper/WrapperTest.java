package com.lywtimer.oop.lesson_11_wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: com.lywtimer.oop.lesson_11_wrapper
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 7:36
 */
public class WrapperTest {

    private boolean isFlag1;
    private Boolean isFlag2;

    /**
     * Description:
     * 基本数据类型转为字符串 String.valueOf
     *
     * */
    @Test
    public void test5(){
        int a = 10;
        String str = String.valueOf(a);
        System.out.println(str);
        String str2 = "123.5";
        final float v = Float.parseFloat(str2);
        System.out.println(v);
    }
    /**
     * Description:
     * JDK5.0开始自动装箱与拆箱
     * */
    @Test
    public void test4(){
        Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
        i = i + 5;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
        //加法运算完成后，再次装箱，把基本数值转成对象。
        System.out.println(i);
    }
    /**
     * Description:
     * 基本数值、包装对象 默认值的区别
     * */
    @Test
    public void test3(){
        System.out.println(isFlag1);
        System.out.println(isFlag2);
    }
    /**
     * Description:拆箱
     * 包装对象---->基本数值
     * */
    @Test
    public void test2(){
        Float f1 = Float.valueOf(23.5f);
        System.out.println(f1.floatValue() + 1);
    }
    /**
     * Description:装箱
     * 基本数值---->包装对象
     * */
    @Test
    public void test1(){
        int i1 = 999;
        Integer ii1 = new Integer(i1);//'Integer(int)' is deprecated and marked for removal
        System.out.println(ii1.toString());
        //推荐使用
        int i2 = 999;
        Integer ii2 = Integer.valueOf(i2);
        System.out.println(ii2);
    }
}
