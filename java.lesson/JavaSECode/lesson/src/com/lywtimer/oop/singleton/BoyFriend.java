package com.lywtimer.oop.singleton;

/**
 * ClassName: Grilfriend
 * Package: com.lywtimer.oop.singleton
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 15:20
 */
public class BoyFriend {


    private BoyFriend() {

    }
    //静态代码块 初始化
    static {
        //数据库连接池
        System.out.println("数据库连接池 static");
    }
    {
        System.out.println("数据库连接池 block");
    }
    private static BoyFriend single = new BoyFriend();
    public static BoyFriend getGirlFriend(){
        return single;
    }
}
