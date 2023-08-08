package com.lywtimer.oop.innerClass;

/**
 * ClassName: OuterClassTest
 * Package: com.lywtimer.oop.innerClass
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 15:35
 */
public class OuterClassTest {
    public static void main(String[] args) {
        //1.创建静态成员内部类
        Person.Dog dog = new Person.Dog();
        dog.eat();
        //2.非静态的成员内部类
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.eat();
    }

    public Comparable getInstance() {
        if (Math.random() > 0.1) {
            //提供接口的实现类的匿名对象
            class MyComparable implements Comparable {
                @Override
                public int compareTo(Object o) {
                    return 0;
                }
            }
            return new MyComparable();
        }
        //提供接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}

class Person{

    String name = "lyw";
    //静态成员内部类
    static class Dog{
        public void eat(){
            System.out.println("狗吃肉");
        }
    }
    //非静态的成员内部类
    class Bird{
        String name = "黄鹂鸟";
        public void eat(){
            System.out.println(name + "吃虫");
            System.out.println("Bird的名字:" + name);
            System.out.println("Person的名字:" + Person.this.name);
        }
    }
    public void method(){
        //局部内部类
        class InnerClass1{

        }
    }
    public Person(){
        //构造器中局部内部类
        class InnerClass1{

        }
    }

    {
        //代码块中局部内部类
        class InnerClass1{

        }
    }
    public void eat(){
        System.out.println("人吃可以吃的");
    }
}
