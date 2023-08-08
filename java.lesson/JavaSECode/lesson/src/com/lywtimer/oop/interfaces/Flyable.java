package com.lywtimer.oop.interfaces;

/**
 * ClassName: Flyable
 * Package: com.lywtimer.oop.interfaces
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 12:39
 */
public interface Flyable {
    public static final int MIN_SPEED = 0;
    int MAX_SPEED = 90000;
    public abstract void fly();
}
