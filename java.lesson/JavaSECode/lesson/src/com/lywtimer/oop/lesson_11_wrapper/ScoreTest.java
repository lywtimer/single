package com.lywtimer.oop.lesson_11_wrapper;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.lywtimer.oop.lesson_11_wrapper
 * Description:
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * - 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而向量类java.util.Vector可以根据需要动态伸缩。
 * - 创建Vector对象：Vector v=new Vector();
 * - 给向量添加元素：v.addElement(Object obj);  //obj必须是对象
 * - 取出向量中的元素：Object obj=v.elementAt(0);
 *   - 注意第一个元素的下标是0，返回值是Object类型的。
 * - 计算向量的长度：v.size();
 * - 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 * @Author lywtimer
 * @Create 2023/8/7 8:04
 */
public class ScoreTest {

    @Test
    public void test2(){

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == i);//
        System.out.println(m == n);//

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//
    }

    public ScoreTest() {
    }

    @Test
    public void test(){
        Vector v = new Vector();
        final Scanner scanner = new Scanner(System.in);
        int maxScore = 0;
        while (true){
            System.out.println("请输入学生成绩");
            int score = scanner.nextInt();
            if (score < 0){
                break;
            }
            v.addElement(score);
            if (score > maxScore) {
                maxScore = score;
            }
        }
        for (int i = 0; i < v.size(); i++) {
            Object o = v.elementAt(i);
            //自动拆箱
            int score = (Integer) o;
            char grade;
            if (maxScore - score <= 10) {
                grade = 'A';
            } else if (maxScore - score <= 20) {
                grade = 'B';
            } else if (maxScore - score <= 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("student "+ i + " score is :" + score + " grade is " + grade);
        }

        scanner.close();

    }
}
