package com.lywtimer.oop.sequence;

/**
 * ClassName: Root
 * Package: com.lywtimer.oop.sequence
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 8:38
 */
public abstract class Root {
    static {
        System.out.println("①Root static block");
    }

    public Root() {
        System.out.println("⑤Root constructor");
    }

    {
        System.out.println("④Root block");
    }
}
