package com.i9youth.basicInterface;

public class Demo {

    public static void main(String[] args) {

        Mouse m = new Mouse();
        m.start();
        USB.fun1();
        int num = USB.num;
        System.out.println(num);
        System.out.println(m.getMac());
        System.out.println(m.voltage());
        System.out.println("=======interface end=========");
    }
}
