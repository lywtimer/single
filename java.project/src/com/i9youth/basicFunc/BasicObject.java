package com.i9youth.basicFunc;

public class BasicObject {

    public static void main(String[] args) {
        Animal a1 = new Animal("狮子王", 30);
        Animal a2 = new Animal("鹿王", 35);
        Class<? extends Animal> a1Class = a1.getClass();
        Class<? extends Animal> a2Class = a2.getClass();
        System.out.println(a1Class);
        System.out.println(a2Class);
        int hashCode = a1.hashCode();
        int hashCode2 = a2.hashCode();
        System.out.println(hashCode);
        System.out.println(hashCode2);

        String str = a1.toString();
        System.out.println(str);

    }
}

