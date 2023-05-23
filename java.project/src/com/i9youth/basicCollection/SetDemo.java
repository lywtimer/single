package com.i9youth.basicCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1980);
        hashSet.add(1980);
        hashSet.add(9);
        hashSet.add(18);
        System.out.println(hashSet);

        Set<Cat> treeSet = new TreeSet<>();
        treeSet.add(new Cat(3, "小花"));
        treeSet.add(new Cat(4, "小白"));
        treeSet.add(new Cat(5, "小灰"));
        treeSet.add(new Cat(2, "小黑"));


        System.out.println(treeSet);
    }
}
