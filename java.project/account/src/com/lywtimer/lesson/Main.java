package com.lywtimer.lesson;

import java.util.Date;

/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *
 * @Author lywtimer
 * @Create ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {

        final long time = new Date().getTime();
        final long start = System.currentTimeMillis();
        System.out.println("Hello world!");

        System.out.println(time);

        System.out.println(System.currentTimeMillis() - start);
    }
}