package com.lywtimer.oop.abstractor;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.lywtimer.oop.abstractor
 * Description:
 *      定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 *      利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 *      当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @Author lywtimer
 * @Create 2023/8/6 12:04
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("约翰", 10001, new MyDate(1991,10,10), 10000
        );
        employees[1] = new SalariedEmployee("百丽", 10002, new MyDate(1999,9,9), 15000
        );
        employees[2] = new HourlyEmployee("乐理", 10003, new MyDate(1999,9,9), 25, 240
        );
        System.out.println("请输入当前的月份");
        int month = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println("工资为:" + employees[i].earnings());
            if (month == employees[i].getBirthday().getMonth()) {
                System.out.println("生日快乐!");
            }
        }
        scanner.close();
    }
}
