package com.lywtimer.utils;

import java.io.PrintStream;

/**
 * ClassName: ArrayTools
 * Package: com.lywtimer.utils
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/24 23:07
 */
public class ArrayTools {
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    
    public void sort(int[] arr, String sortMethod) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if ("asc".equals(sortMethod)) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                } else if("desc".equals(sortMethod)) {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapOverload(int a, int b) {
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=100";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}
