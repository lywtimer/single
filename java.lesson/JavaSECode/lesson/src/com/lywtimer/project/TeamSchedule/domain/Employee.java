package com.lywtimer.project.TeamSchedule.domain;

/**
 * ClassName: Employee
 * Package: com.lywtimer.project.TeamSchedule.domain
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:08
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return toStringTpl();
    }

    protected String toStringTpl(){
        return id +
                "\t" + name +
                "\t" + age +
                "\t" + salary;
    }
}

