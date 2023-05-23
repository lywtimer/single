package com.i9youth.basicArray;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {


        int[] i_arr = new int[10];
        i_arr[7] = 76344;
        String[] s_arr = new String[10];
        s_arr[3] = "小明";
        System.out.println("i_arr" + Arrays.toString(i_arr));
        System.out.println("i_arr[2] = " + i_arr[2]);
        System.out.println("s_arr" + Arrays.toString(s_arr));

        System.out.println("=========静态创建数组========");
        int[] i_arr2 = {1,2,5,6,7,10};
        System.out.println("i_arr2" + Arrays.toString(i_arr2));
        System.out.println("i_arr2的长度" + i_arr2.length);
        System.out.println("=========数组的遍历========");
        for (int i = 0; i < i_arr2.length; i++) {
            System.out.println("i_arr2[" + i + "] = " + i_arr2[i]);
        }
        for (int i : i_arr2) {
            i = 10;
            System.out.println(i);
        }
        System.out.println("i_arr2" + Arrays.toString(i_arr2));


        System.out.println("i_arr2的元素之和" + array_sum(i_arr2));

        System.out.println("=========数组的拷贝========");

        int[] arr = {1,9,3,5,7,11};
        int[] arr_copy = arr;
        int[] arr_deep_copy = new int[arr.length];
        for (int i = 0; i < arr_deep_copy.length; i++) {
            arr_deep_copy[i] = arr[i];
        }
        System.out.println("arr地址" + arr);
        System.out.println("arr" + Arrays.toString(arr));
        System.out.println("arr_copy地址" + arr_copy);
        System.out.println("arr_copy" + Arrays.toString(arr_copy));
        System.out.println("arr_deep_copy地址" + arr_deep_copy);
        System.out.println("arr_deep_copy" + Arrays.toString(arr_deep_copy));
        arr_copy[3] = 333;
        System.out.println("arr" + Arrays.toString(arr));
        System.out.println("arr_copy" + Arrays.toString(arr_copy));
        System.out.println("arr_deep_copy" + Arrays.toString(arr_deep_copy));

        System.out.println("=========Arrays的常用方法========");
        Arrays.sort(arr);
        System.out.println("查找arr的下标是" + Arrays.binarySearch(arr, 9));
        int[] ints = Arrays.copyOf(arr, arr.length);
        int[] ints2 = Arrays.copyOf(arr, arr.length - 2);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints2));
        System.out.println("ints = arr " + Arrays.equals(ints, arr));

        System.out.println("=========二维数组========");
        int[][] arr3 = {{1,2,3},{4,5},{6,7}};
        System.out.println("arr3[1][1] = " + arr3[1][1]);
        int[][] arr4 = new int[3][];
        int[] arr4_1 = {1,3,5,7,9};
        int[] arr4_2 = {2,4,6,8};
        arr4[1] = arr4_1;
        arr4[2] = arr4_2;
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(Arrays.toString(arr4[i]));
        }
        int[][] arr5 = new int[4][5];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(Arrays.toString(arr5[i]));
        }
    }

    static int array_sum(int ...nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
