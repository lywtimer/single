package com.i9youth.basicCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        System.out.println("========List接口========");
        long t = System.currentTimeMillis();

        ArrayList<String> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add("hello");
        arr.add("world");
        arr.add("!");
        arr.add(arr.size(), "世界");//不能越界设置
        arr.add(arr.size(), "你好");//会覆盖
//        arr.remove(100);//不能越界删除
        for (int i = 0; i < 100000; i++) {
            arr.add((char)(97 + i) + "");
        }

        System.out.println(System.currentTimeMillis() - t + " ms");

        List<String> arr2 = new LinkedList();
        t = System.currentTimeMillis();
        arr2.add("li");

        for (int i = 0; i < 100000; i++) {
            arr2.add((char)(97 + i) + "");
        }
        System.out.println(System.currentTimeMillis() - t + " ms");

    }
}
