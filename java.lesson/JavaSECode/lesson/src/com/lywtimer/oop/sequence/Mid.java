package com.lywtimer.oop.sequence;

/**
 * ClassName: Mid
 * Package: com.lywtimer.oop.sequence
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 8:38
 */
public class Mid extends Root{
    static {//Empty class initializer
        System.out.println("②Mid static block");
    }
    public Mid() {
        System.out.println("⑦Mid constructor");
    }
    public Mid(String msg) {
        this();
        System.out.println("⑧Mid constructor + " + msg);
    }

    {
        System.out.println("⑥Mid block");
    }
}
