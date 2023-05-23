package com.i9youth.basicCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Constraint {

    public static void main(String[] args) {

        Collection<Integer> col = new ArrayList();
        col.add(40);
        col.add(50);
        col.add(60);
        col.add(90);
//        col.add("hello");//不兼容的类型: java.lang.String无法转换为java.lang.Integer
        int sum = 0;
        for (Integer integer : col) {
            sum += integer;
        }
        System.out.println(sum);

        System.out.println("======自定义泛型=====");
        Point<String> p = new Point<>();
        p.setX("3.15");
        p.setY("16");
        System.out.println(p.toString());

        Point<Double> p2 = new Point<>();
        p2.setX(3.15);
        p2.setY(16.0);
        System.out.println(p2.toString());
        p2.checkValue(20);
        p2.checkValue("who are you");
    }
}
