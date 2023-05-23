package com.i9youth.basicFunc;

public class BasicStatic {

    static {
        System.out.println("======初始化 BasicStatic======");
    }

    public static void main(String[] args) {
        System.out.println("exec main ...");

        MyStatic obj = new MyStatic(10);
        MyStatic obj2 = new MyStatic(6);
        MyStatic obj3 = new MyStatic(3);
        System.out.println(MyStatic.token);
        obj.exec();
        MyStatic.token = "hello";
        obj2.exec();
        obj3.exec();
        obj.exec();

        Cat cat = new Cat("小花", 2, "黄色");
        cat.catchMouse();
    }
}


class MyStatic {

    private int times;
    static String token = "djeo345jh";

    static {
        System.out.println("======MyStatic 静态代码块======");
    }

    {
        System.out.println("======MyStatic 构造代码块======");
    }

    MyStatic(int times) {
        this.times = times;
        System.out.println("======MyStatic 构造方法======");
    }

    public void exec()
    {
        System.out.println("MyStatic(" + token + ") exec " + times + "次");
    }
}