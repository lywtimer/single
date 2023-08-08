package com.lywtimer.oop;

/**
 * ClassName: Person
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/27 0:08
 */
public class Person extends Animal {
    String name;
    int age;
    char gender;
    Phone phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void showPersonInfo() {
        System.out.println("姓名:" + name + "\t" + "年龄:" + age + "\t" + "性别:" + gender);
    }

    public void showPersonInfo(int times) {
        for (int i = 0; i < times; i++) {
            showPersonInfo();
        }
    }
}
