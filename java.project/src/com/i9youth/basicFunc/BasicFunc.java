package com.i9youth.basicFunc;

public class BasicFunc {


    public static void main(String[] args) {
        //[修饰符1,修饰符2...] 返回值/void 方法名(参数列表)

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("======计算1~10的和======");
        System.out.println("sum的值:" + sum);

        System.out.println("======计算1~20的和======");
        for (int i = 10; i <= 20; i++) {
            sum += i;
        }
        System.out.println("sum的值:" + sum);

        test((byte)10);
        byte flag = 1;
        test(flag, 20);
    }

    public static void test(byte flag) {
        System.out.println("void test() 调用");
        if (flag > 5) {
            return ;
        }
    }

    public static int test(byte flag, int num) {
        System.out.println("void test() 调用 " + num + " 次");
        if (flag > 5) {
            return flag + 1;
        }
        return 100;
    }
}
