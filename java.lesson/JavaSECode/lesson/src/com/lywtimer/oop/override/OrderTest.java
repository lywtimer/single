package com.lywtimer.oop.override;

/**
 * ClassName: OrderTest
 * Package: com.lywtimer.oop.override
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 23:14
 */
public class OrderTest {
    public void methodAccess(){
        Order order = new Order();

//        order.orderPrivate = 1;//
        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;
        order.methodProtected();
    }
}
