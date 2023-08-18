package com.lywtimer.lesson.data_type;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ClassName: BinaryTest
 * Package: com.lywtimer.lesson.data_type
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/16 10:54
 */
public class BinaryTest {
    @Test
    public void testDefine(){
        int num1 = 123;		//十进制
        int num2 = 0b101;	//二进制
        int num3 = 0127;	//八进制
        int num4 = 0x12aF;	//十六进制

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

    @Test
    public void testConvert(){
        //1.十进制整数转换成其它进制格式输出:
        int num = 97;

        System.out.println(num);
        System.out.println("0B" + Integer.toBinaryString(num));
        System.out.println("0" + Integer.toOctalString(num));
        System.out.println("0x" + Integer.toHexString(num));
        System.out.println("对应的字符:" + (char)num);

        String s = (char)0x61 + ",我是谁?";
        System.out.println(s);
    }

    @Test
    public void testRandom(){
        //1.随机数
        int high = 90;
        int low = 89;
        System.out.println("\n========= 1.使用Math.random()生成[0,1)之间的double类型随机数 =======");
        for (int i = 0; i < 10; i++) {
            int r = (int)(Math.random() * (high - low + 1)) + low;
            System.out.print(r + "\t");
        }
        System.out.println("\n========= 2.使用ThreadLocalRandom生成线程安全的随机数 =======");
        for (int i = 0; i < 10; i++) {
            int num = ThreadLocalRandom.current().nextInt(low, high + 1);
            System.out.print(num + "\t");
        }
        System.out.println("\n========= 3.使用Random类生成随机数 =======");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(low, high + 1);
            System.out.print(num + "\t");
        }
        System.out.println("\n========= 4.使用SecureRandom生成更加安全的随机数 =======");
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(low, high + 1);
            System.out.print(num + "\t");
        }
    }

    @Test
    public void testRandomChar(){
        // -
        Random rand = new Random();
        int num = rand.nextInt('\u4E00', '\u9FA5' + 1);
        System.out.println(Character.toChars(num));
        System.out.println(Character.toChars(num + 1));
        System.out.println(Character.toChars(num + 2));
        System.out.println(Character.toChars(num + 3));

        System.out.println("我是中国人".charAt(3));
    }
}
