package com.lywtimer.oop.lesson_09_enum.apply;

/**
 * ClassName: Employee
 * Package: com.lywtimer.oop.lesson_09_enum.apply
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 6:21
 */
public class Employee {
    private String name;
    private int age;
    private Status status;

    public Employee() {
    }

    public Employee(String name, int age, Status status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
