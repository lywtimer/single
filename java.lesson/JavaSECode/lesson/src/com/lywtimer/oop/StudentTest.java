package com.lywtimer.oop;

/**
 * ClassName: StudentTest
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/31 22:48
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {
                students[i].info();
                System.out.println(students[i].max(-1,-20,-5));
            }
        }



    }
}
