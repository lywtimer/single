package com.lywtimer.oop.interfaces;

/**
 * ClassName: Bullet
 * Package: com.lywtimer.oop.interfaces
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 12:45
 */
public class Bullet implements Flyable,Attackable {
    @Override
    public void attack() {
        System.out.println("子弹穿透力极强,可以致命并且让被击中者痛苦万分。");
    }

    @Override
    public void fly() {
        System.out.println("不同枪支和弹药的子弹速度有很大差异。手枪子弹速度一般在300~450米/秒，步枪子弹速度一般在700~850米/秒，口径步枪子弹速度可达860~970米/秒，狙击步枪子弹速度最快可达1000米/秒，但目前世界上没有超过1000米/秒的狙击步枪初速。");
    }
}
