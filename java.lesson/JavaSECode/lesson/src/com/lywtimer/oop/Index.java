package com.lywtimer.oop;


import com.lywtimer.oop.abstractor.Rectangle;

/**
 * ClassName: Index
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 23:24
 */
public class Index {

    public static void main(String[] args) {
        //
        byte[] arr = new byte[1024*1024*100];
        //abstract demo
        Rectangle r = new Rectangle("yellow", 1, 10, 20);
        System.out.println(r.findArea());
        //programing sequence
//        Leaf leaf = new Leaf();
//        GirlFriend g = GirlFriend.getGirlFriend();
//        g.say();
//        BoyFriend b = BoyFriend.getGirlFriend();
//        Order order = new Order();
//        SubOrder t = new SubOrder();
//        order.show();
//        t.show();
//        System.out.println(t.getName());
    }
}
