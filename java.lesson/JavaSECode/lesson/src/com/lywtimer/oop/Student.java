package com.lywtimer.oop;

/**
 * ClassName: Student
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/31 22:41
 */
public class Student {
    int number;
    int state;
    int score;

    public void info() {
        System.out.println("number:" + number + ",state:" + state + ",score:" + score);
    }

    public void getInfo() {
        System.out.println("number:" + number + ",state:" + state + ",score:" + score);
    }

    public void info(int i) {
        System.out.println("number:" + number + ",state:" + state + ",score:" + score);
    }

    public int max(int i, int j) {
        return i > j ? i : j;
    }

    public double max(double i, double j) {
        return i > j ? i : j;
    }

    public double max(double i, double j, double k) {
        double temp = max(i, j);
        return max(temp, k);
    }

    public void print(int... args) {

    }

    public void print(String args) {
        
    }
}

