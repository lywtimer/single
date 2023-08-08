package com.lywtimer.oop.abstractor;

/**
 * ClassName: Template
 * Package: com.lywtimer.oop.abstractor
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 11:25
 */
public abstract class Template {
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("程序所花费的时间:" + (end - start));
    }

    public abstract void code();
}
