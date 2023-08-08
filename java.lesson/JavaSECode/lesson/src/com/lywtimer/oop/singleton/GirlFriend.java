package com.lywtimer.oop.singleton;

/**
 * ClassName: Grilfriend
 * Package: com.lywtimer.oop.singleton
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 15:20
 */
public class GirlFriend {


    private GirlFriend() {

    }
    private static GirlFriend single;
    public static GirlFriend getGirlFriend(){
        if(single == null) {
            single = new GirlFriend();
        }
        return single;
    }

    public void say(){
        System.out.println("你想说!");
    }
}
