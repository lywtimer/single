package com.lywtimer.array;

import com.lywtimer.utils.ArrayTools;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: ArrayDemoTest
 * Package: com.lywtimer.array
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/7/23 16:28
 */
public class ArrayDemoTest {

    public static void main(String[] args) {
        arraysDemo();
        


    }
    public static void arraysDemo(){
        int[] arr1 = {6,9,2,9,1};
        int[] arr2 = {6,9,2,1,9};
        int[] arr3 = {6,9,2,1,9};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr2, arr3));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2 == arr3);

    }
    public static void bubbleSort(){
        int[] arr = {6,9,2,9,1};
        for (int j = 0; j < arr.length -1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i+1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        ArrayTools.printArr(arr);

    }
    public static void student(){
        /*从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
        - 成绩>=最高分-10  等级为’A’
        - 成绩>=最高分-20  等级为’B’
        - 成绩>=最高分-30  等级为’C’
        - 其余            等级为’D’*/

        System.out.print("请输入学生数量");
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int[] scoreArr = new int[total];
        int maxScore = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print("请输入学生成绩");
            int score = s.nextInt();
            scoreArr[i] = score;
            maxScore = Math.max(score, maxScore);
        }

        for (int i = 0; i < scoreArr.length; i++) {
            int score = scoreArr[i];
            int diff = maxScore - score;
            if (diff <= 10) {
                System.out.println("学生" + i + "等级为’A’");
            } else if (diff <= 20) {
                System.out.println("学生" + i + "等级为’B’");
            } else if (diff <= 30) {
                System.out.println("学生" + i + "等级为’C’");
            } else {
                System.out.println("学生" + i + "等级为’D’");
            }
        }
        s.close();
    }
    public static void defineArr() {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr1 = new int[3];
        int[] arr2 = {2,4,6,8,10};
        int arr3[] = {2,4,6,8,10};
        int[][] arr4 = new int[][]{{2,4,6,8,10},{1,3,5,7},{9,8,7,6,5,4}};
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr4[1][2]);
        //遍历数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void yangHui() {
//        **案例3：**使用二维数组打印一个 10 行杨辉三角。
//        提示：
//        1. 第一行有 1 个元素, 第 n 行有 n 个元素
//        2. 每一行的第一个元素和最后一个元素都是 1
//        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        //显示
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void rectangleNumber() {
        System.out.println("输入矩阵的维度");
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[][] arr = new int[len][len];
        int allNodes = len * len;
        /*
         * k = 1:向右
         * k = 2:向下
         * k = 3:向左
         * k = 4:向上
         */
        int k = 1;
        int startRow = 0;
        int startColumn = 0;
        for (int i = 1; i <= allNodes; i++) {
            if (k == 1) {
                if (startColumn < len && arr[startRow][startColumn] == 0) {
                    arr[startRow][startColumn++] = i;
                } else {
                    k = 2;
                    startRow++;
                    startColumn--;
                    i--;
                }
            } else if (k == 2) {
                if (startRow < len && arr[startRow][startColumn] == 0) {
                    arr[startRow++][startColumn] = i;
                } else {
                    k = 3;
                    startRow--;
                    startColumn--;
                    i--;
                }
            } else if (k == 3) {
                if (startColumn >= 0 && arr[startRow][startColumn] == 0) {
                    arr[startRow][startColumn--] = i;
                } else {
                    k = 4;
                    startRow--;
                    startColumn++;
                    i--;
                }
            } else if (k == 4) {
                if (startRow >= 0 && arr[startRow][startColumn] == 0) {
                    arr[startRow--][startColumn] = i;
                } else {
                    k = 1;
                    startRow++;
                    startColumn++;
                    i--;
                }
            }
        }
        ArrayTools.printArr(arr);
        s.close();
    }
}
