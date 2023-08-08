package com.lywtimer.oop.polymorphism;

/**
 * ClassName: PersonTest
 * Package: com.lywtimer.oop.polymorphism
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 9:35
 */
public class PersonTest {
    public static void main(String[] args) {
        Man p1 = new Man();
        Person p2 = new Woman();
        humanLiving(p1, p2);
//        p2.pregnancy();
        System.out.println(p2 instanceof Man);
        System.out.println(p2 instanceof Woman);
        System.out.println(p2 instanceof Person);

    }

    public static void humanLiving(Person... p) {
        for (int i = 0; i < p.length; i++) {
            p[i].hobby();
            if (p[i] instanceof Woman w) {
                w.pregnancy();
            }
            if (p[i] instanceof Man) {
                ((Man) p[i]).hunting();
            }
            System.out.println(p[i].toString() + "\n====== end =====");
        }

    }
}
