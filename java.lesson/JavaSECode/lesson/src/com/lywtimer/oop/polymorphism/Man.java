package com.lywtimer.oop.polymorphism;

/**
 * ClassName: Man
 * Package: com.lywtimer.oop.polymorphism
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 9:31
 */
public class Man extends Person{

    @Override
    public void hobby() {
        super.hobby();
        System.out.println("吸烟喝酒烫头");
    }

    public void hunting(){
        System.out.println("来自古英语huntian,打猎，猎捕，来自Proto-Germanic*huntona,猎捕，捕获，来自PIE*kend,抓住，抓捕，词源同hint.");
    }
}
