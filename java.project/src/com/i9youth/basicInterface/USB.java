package com.i9youth.basicInterface;

public interface USB {

    int num = 10;
    public abstract void start();
    public abstract void stop();
    //默认方法
    default String getMac() {
        return "mac地址";
    }

    static void fun1() {
        System.out.println("interface 的静态方法");
    }
}

interface Electronic extends O {
    int voltage();
}

interface O {
    String name();
}

class Mouse implements USB, Electronic {

    @Override
    public void start() {
        System.out.println("鼠标开始工作");
    }

    @Override
    public void stop() {
        System.out.println("鼠标结束工作");
    }

    @Override
    public int voltage() {
        return 15;
    }

    @Override
    public String name() {
        return "鼠标";
    }
}

class Keyboard implements USB {

    @Override
    public void start() {
        System.out.println("键盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("键盘结束工作");
    }
}