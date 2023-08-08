package com.lywtimer.oop.suboverride;

import com.lywtimer.oop.override.Order;

/**
 * ClassName: OrderTest
 * Package: com.lywtimer.oop.suboverride
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 23:19
 */
public class OrderTest {
    public void methodAccess(){
        Order order = new Order();
        order.orderPublic = 1;
//        order.methodProtected();
        order.methodPublic();
    }
}
