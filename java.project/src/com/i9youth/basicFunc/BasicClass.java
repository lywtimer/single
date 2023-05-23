package com.i9youth.basicFunc;

public class BasicClass {


    public static void main(String[] args) {

        int i;
//        System.out.println(i); //可能尚未初始化变量i

        Person p = new Person();
        p.name = "小红";
        p.eat();
        Person.flag = 0;
        Person p2 = new Person("小明");
        p2.eat();

        Person p3 = new Person("小米", 30);
        p3.eat();

    }


}

class Person {
    public String name;
    private int age;

    static int flag = 1;

    public Person() {
        System.out.println("默认构造方法");
    }
    public Person(String name) {
        this();//Call to 'this()' must be first statement in constructor bod
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat()
    {
        if (flag == 1) {
            System.out.println(name + "是杂食动物");
        } else {
            System.out.println(name + "是肉食动物");
        }
    }
}