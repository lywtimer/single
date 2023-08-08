package com.lywtimer.oop.suboverride;

import com.lywtimer.oop.override.Order;

/**
 * ClassName: SubOrder
 * Package: com.lywtimer.oop.suboverride
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 23:21
 */
public class SubOrder extends Order {

//    public int orderPublic;
    private String name = "sub order";

    public SubOrder(){
//        orderPublic = 2;
        System.out.println("创建 com.lywtimer.oop.suboverride SubOrder");
    }
    public void methodAccess() {
//        this.orderDefault = 1;//orderDefault' is not public in 'com.lywtimer.oop.override.Order'. Cannot be accessed from outside package
        this.orderProtected = 1;
        this.orderPublic = 1;
    }

    @Override
    public void show() {
        System.out.println("我是 Override show方法");
        System.out.println("orderPublic:" + orderPublic);
        System.out.println("parent orderPublic:" + super.orderPublic);
    }
//    public String getName() {
//        return name;
//    }
}
