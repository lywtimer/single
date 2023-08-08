package com.lywtimer.oop.abstractor;

/**
 * ClassName: Employee
 * Package: com.lywtimer.oop.abstractor
 * Description:
 *      private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
 *      abstract方法earnings()；
 *      toString()方法输出对象的name,number和birthday。
 * @Author lywtimer
 * @Create 2023/8/6 11:12
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {

    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString(){
        return "name = " + name + ",number = " + number + ",birthday = " + birthday.toDateString();
    }
    public abstract void work();
//    public static abstract void worker();//Illegal combination of modifiers: 'abstract' and 'static'
}
