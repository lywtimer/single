package com.lywtimer.oop.interfaces;

/**
 * ClassName: Plane
 * Package: com.lywtimer.oop.interfaces
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 12:49
 */
public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("尽管实际经验表明,在弯曲的表面上空气流动的速度确实更快,但伯努利原理却无法解释为什么会出现流速变快的现象。" +
                "换句话说,这个定理并没有说明机翼上方的高流速是如何产生的。");
    }
}
