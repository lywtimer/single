package com.lywtimer.oop.abstractor;

/**
 * ClassName: SalariedEmployee
 * Package: com.lywtimer.oop.abstractor
 * Description:
 *      定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。
 *      该类包括：private成员变量monthlySalary；
 *      实现父类的抽象方法earnings(),该方法返回monthlySalary值；
 *      toString()方法输出员工类型信息及员工的name，number,birthday。
 * @Author lywtimer
 * @Create 2023/8/6 11:55
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "SalariedEmployee[ " + super.toString() + "]";
    }
}
