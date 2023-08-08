package com.lywtimer.oop.override;

/**
 * ClassName: Order
 * Package: com.lywtimer.oop.override
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 23:11
 */
public class Order {
    private String name = "order";

    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}
    void methodDefault(){}
    protected void methodProtected(){}
    public void methodPublic(){}

    public void show(){
        orderPrivate = 1;
        orderDefault = 1;
        orderProtected = 1;
        orderPublic = 1;
        System.out.println("我是父类show方法");
    }

    public Order() {
        orderPublic = 1;
        System.out.println("创建 com.lywtimer.oop.override Order");
    }

    public String getName() {
        return this.name;
    }
}
