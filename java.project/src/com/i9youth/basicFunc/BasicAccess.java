package com.i9youth.basicFunc;

import com.i9youth.basicTest.Memory;

public class BasicAccess {
    public static void main(String[] args) {
        System.out.println("=======start======");

        Memory m = new Memory();

        System.out.println(m.name);
//        System.out.println(m.time);

        final int i;
        i = 20;
        System.out.println(i);
//        i = 30;//只能赋值一次
        System.out.println(i);
        final Animal animal = new Animal("豹子", 30);
        System.out.println(animal.name);
        System.out.println(animal.age);
        System.out.println(animal.breath);

        animal.age = 40;
        System.out.println(animal.age);

    }
}
