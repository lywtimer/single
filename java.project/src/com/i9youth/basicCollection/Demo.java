package com.i9youth.basicCollection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection arr = new ArrayList();
        String[] tags = {"看书","唱歌"};
        arr.add(20);
        arr.add("天罡正气");
        arr.add(false);
        arr.add(tags);

        System.out.println(arr);
        System.out.println(arr.contains(true));
        System.out.println(Arrays.toString(arr.toArray()));

        Collection col = new ArrayList();
        col.add(20);
        col.add("天罡正气");
        col.add(false);
        col.add(tags);

        System.out.println("arr == col " + arr.equals(col));
        col.remove(tags);
        System.out.println("arr == col " + arr.equals(col));
        System.out.println("col中有多少个元素 " + col.size());
        col.addAll(arr);
        System.out.println(col);
        col.remove(false);
        System.out.println(col);

        //遍历集合
        for (Object o : col) {
            System.out.println(o);
        }
        System.out.println("=======iterator遍历=======");
        final Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            arr.remove(false);//迭代过程中不允许修改
//            iterator.remove();
        }
        System.out.println(arr.size());
        System.out.println("=======iterator遍历第二遍=======");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

    }
}
