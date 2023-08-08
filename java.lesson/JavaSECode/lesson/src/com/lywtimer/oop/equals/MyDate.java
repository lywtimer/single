package com.lywtimer.oop.equals;

/**
* ClassName: My
* Package: com.lywtimer.oop.equals
* Description:
* @Author lywtimer
* @Create 2023/8/5 12:25
*/public class MyDate extends MyCoreDate {

    public static String birthday = "1986-09-18";
    public MyDate(int day, int month, int year) {
        super(day, month, year);
    }

    public static void callBack(){
        System.out.println("静态方法回调函数");
    }
}
