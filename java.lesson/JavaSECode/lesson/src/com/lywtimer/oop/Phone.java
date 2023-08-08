package com.lywtimer.oop;

/**
 * ClassName: Phone
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/26 23:58
 */
public class Phone {
    String name;
    double price;
    public void call(){
        System.out.println("正在拨打电话...");
    }
    public void sendMessage(String message){
        System.out.println("发送信息:" + message);
    }
}
