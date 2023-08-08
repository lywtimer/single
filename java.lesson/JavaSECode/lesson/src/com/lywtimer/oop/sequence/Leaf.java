package com.lywtimer.oop.sequence;

/**
 * ClassName: Leaf
 * Package: com.lywtimer.oop.sequence
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 8:38
 */
public final class Leaf extends Mid{
    static {//Empty class initializer
        System.out.println("③Leaf static block");
    }
    public Leaf() {
        super("leaf args");
        System.out.println("⑩Leaf constructor");
    }

    {
        System.out.println("⑨Leaf block");
    }
}
