package com.i9youth.basicFunc;

abstract class Life {

}

abstract class Being {
    abstract void breath();
}

class Animal extends Being {

    String name;
    int age;

    protected String breath = "氧气";

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreath() {
        return breath;
    }

    public Animal() {
        System.out.println("animal 无参构造");
    }

    public Animal(String name, int age) {
        System.out.println("animal 有参构造");
        this.name = name;
        this.age = age;
    }

    public Animal eat() {
        System.out.println("吃东西。。。。。");
        return null;
    }

    @Override
    void breath() {

    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println("看门");
    }
}
class Cat extends Animal {

    String color;
    public Cat() {

    }

    public Cat(String name, int age, String color) {
//        System.out.println("执行Cat有参构造");
        //super();//默认调用，隐含调用父类的无参的构造方法
        super(name, age); //Call to 'super()' must be first statement in constructor bod
        this.color = color;
    }

    public void catchMouse() {
        eat();
        System.out.println(color + "的" + name + "(" + age + "岁)在抓老鼠......");
    }

    @Override
    public Cat eat() {
        System.out.println("吃鱼。。。。。");
        return null;
    }

}