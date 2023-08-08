package com.lywtimer.oop;

/**
 * ClassName: RecursionTest
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 7:39
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest t = new RecursionTest();
        int inputNum = 10;
        int sum = t.getSum(inputNum);
        System.out.println(sum);
        System.out.println(t.getSumWithFor(inputNum));
        System.out.println(t.f(inputNum));
        Card c = new Card("no9572");
        c.info();
        Boy jack = new Boy("杰克", 28);
        Girl lili = new Girl("丽丽", 21);
        Girl rose = new Girl("肉丝", 18);
        lili.marry(jack);
        jack.shout();
        System.out.println(lili.compare(rose));
    }

    public int getSumWithFor(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    /*
    通过递归算法实现.
    参数列表:int
    返回值类型: int
    */
    public int getSum(int num) {
        if(num == 1){
            return 1;
        }
        return num + getSum(num-1);
    }
    /**
     * 快速排序
    */

    /**
     * 汉诺塔游戏
     */
    /**
     * 斐波那契数列
     */
    public int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }


}
