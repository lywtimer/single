package com.lywtimer.oop;

/**
 * ClassName: Boy
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 15:23
 */
public class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
    }

    public void shout(){
        if (this.age > 22) {
            System.out.println("终于可以结婚了");
        }else{
            System.out.println("好好学习");
        }
    }
}
