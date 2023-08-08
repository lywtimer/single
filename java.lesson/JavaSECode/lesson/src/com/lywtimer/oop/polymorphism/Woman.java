package com.lywtimer.oop.polymorphism;

/**
 * ClassName: Woman
 * Package: com.lywtimer.oop.polymorphism
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 9:33
 */
public class Woman extends Person{
    @Override
    public void hobby() {
        super.hobby();
        System.out.println("逛街自拍刷剧");
    }

    public void pregnancy(){
        System.out.println("pre-前,先 + gn( = -gen-)生殖 + -ant动作倾向");
    }

    @Override
    public String toString() {
        return "Woman{}";
    }
}
