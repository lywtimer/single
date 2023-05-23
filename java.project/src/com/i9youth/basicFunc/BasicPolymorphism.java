package com.i9youth.basicFunc;

public class BasicPolymorphism {

    public static void main(String[] args) {
        Animal a = new Cat("毛毛", 2, "白色");
        Animal b = new Dog("旺财", 4);
        b.eat();
        a.eat();
        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(b instanceof Cat);
        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Dog);
    }
}
