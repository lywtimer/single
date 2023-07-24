package com.lywtimer.utils;

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
}
