import java.util.Scanner;

public class ProcessControlTest {
    public static void main(String[] args) {
        //开启控制台输入
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

    /*    **题目：找出100以内所有的素数（质数）？100000以内的呢？**

        目的：不同的代码的实现方式，可以效率差别很大。

        分析：素数（质数）：只能被1和它本身整除的自然数。  ---> 从2开始，到这个数-1为止，此范围内没有这个数的约数。则此数是一个质数。
        比如：2、3、5、7、11、13、17、19、23、...*/

        System.out.println("找出100以内所有的素数（质数）？100000以内的呢？");
        int findMaxInt = 100000;
        int total = 0;
        for (int i = 2; i < findMaxInt; i++) {
            boolean counter = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    counter = false;
                    break;
                }
            }
            if (counter) {
//                System.out.println(i + "是质数");
                total++;
            }
        }
        System.out.println("1~" + findMaxInt + "质数之和:" + total);
        System.out.println("花费时间:" + (System.currentTimeMillis() -startTime));
        //循环嵌套
        int shapeLoop = 9;
        for (int i = 0; i < shapeLoop; i++) {
//            System.out.println(shapeLoop/2 - i);
            int row = shapeLoop/2 - i >= 0 ? shapeLoop/2 - i : i - shapeLoop/2;
            for (int j = 0; j < row; j++) {
                System.out.print(" \t");
            }
            //1 3 5 7 9 7 5 3 1 2n - 1
            int starCount = 2*i+1 >= 9 ? shapeLoop - 2 * row: 2*i+1;
//            System.out.println(row);
            for (int j = 0; j < starCount; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        //无限循环 while(true) for(;;)

     /*   声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
=========ATM========
        1、存款
        2、取款
        3、显示余额
        4、退出
        请选择(1-4)：
        */
        double balance = 0;
        boolean flag = false;
        while (true) {
            System.out.print("=========ATM========\n" +
                    "1、存款\n" +
                    "2、取款\n" +
                    "3、显示余额\n" +
                    "4、退出\n" +
                    "请选择(1-4)：");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("输入存款金额: ");
                    double add = scanner.nextDouble();
                    balance += add;
                    break;
                case 2:
                    System.out.print("输入取款金额: ");
                    double payment = scanner.nextDouble();
                    balance -= payment;
                    break;
                case 3:
                    System.out.println("账号当前余额:" + balance);
                    break;
                case 4:
                    System.out.println("退出");
                    flag = true;
                    break;
                default:
                    System.out.println("非法输入,请选择(1-4)：");
                    break;
            }
            if (flag) {
                break;
            }
        }

/*        世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/
        int paperHeight = 1;
        int mountainHeight = 884886 * 10;
        int foldTimes = 0;
        while (paperHeight < mountainHeight) {
            paperHeight *= 2;
            foldTimes++;
        };
        System.out.println("0.1毫米的纸折叠 " + foldTimes + " 次,高度为 "+paperHeight+" 可以超过珠穆朗玛峰8848.86米");

/*        随机生成一个100以内的数，猜这个随机数是多少？

        从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。

        提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)*/
        int randGuessNumber = (int)(Math.random() * 100 + 1);
        int guessTimes = 0;
        int guessNumber = 0;
        do {
            System.out.print("请猜[1,100]的随机数: ");
            guessNumber = scanner.nextInt();
            guessTimes++;
            if (guessNumber > randGuessNumber) {
                System.out.print("输入的数据大了");
            } else if (guessNumber < randGuessNumber) {
                System.out.print("输入的数据小了");
            } else {
                System.out.print("恭喜你答对了");
            }
            System.out.println("，你已经猜了 " + guessTimes + " 次");
        } while (guessNumber != randGuessNumber);

        int maxWhileTimes = 9;
        while (maxWhileTimes > 0) {
            System.out.println("while循环次数:" + maxWhileTimes);
            maxWhileTimes--;
        }
        //查找公约数
        System.out.print("请输入公约数m: ");
        int m = scanner.nextInt();
        System.out.print("请输入公约数n: ");
        int n = scanner.nextInt();
        int minNumber = m > n ? n : m;
        for (int i = minNumber; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(m + "和" + n + "的公约数: " + i);
            }
        }

        //输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        //例如： `153 = 1*1*1 + 3*3*3 + 5*5*5`
        System.out.print("请输入查找[水仙花数]的数值范围: ");
        int narcissisticLoopTimes = scanner.nextInt();
        for (int i = 100; i < narcissisticLoopTimes; i++) {
            int unitNumber = i % 10;
            int decadeNumber = i / 10 % 10;
            int hundredNumber = i / 100;
            if (i == unitNumber * unitNumber * unitNumber + decadeNumber * decadeNumber * decadeNumber + hundredNumber * hundredNumber * hundredNumber) {
                System.out.println("查找水仙花数是:" + i);
            }
        }

        //todo  循环条件,决定结束时机,一定是boolean类型的变量或者表达式
        System.out.print("请输入循环次数探索循环结构: ");
        int structLoopTimes = scanner.nextInt();
        int loopInit = 0;
        for (System.out.println("循环结构初始化"); loopInit < structLoopTimes; System.out.println("循环结构迭代"), loopInit++) {
            System.out.println("循环结构结构体");
        }

        System.out.print("请输入乘法表: ");
        int tableLoopTimes = scanner.nextInt();
        for (int i = 1; i <= tableLoopTimes; i++) {
            for (int j = 1; j <= tableLoopTimes; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.print("请输入循环次数: ");
        int loopTimes = scanner.nextInt();
        for (int i = 0; i < loopTimes; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < loopTimes - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        //从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
        //穿透可以显示switch-case的优势
        int totalDays = 0;
        System.out.println("请输入 month:");
        int month = scanner.nextInt();
        System.out.println("请输入 day:");
        int day = scanner.nextInt();
        switch (month) {
            case 12:
                totalDays += 30;
            case 11:
                totalDays += 31;
            case 10:
                totalDays += 30;
            case 9:
                totalDays += 31;
            case 8:
                totalDays += 31;
            case 7:
                totalDays += 30;
            case 6:
                totalDays += 31;
            case 5:
                totalDays += 30;
            case 4:
                totalDays += 31;
            case 3:
                totalDays += 28;
            case 2:
                totalDays += 31;
            case 1:
                totalDays += day;
        }
        System.out.println("输入的日期为2023年的第" + totalDays + "天。");


        double random = Math.random();
        //[a,b]随机数的公式

//        成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。

        System.out.println("请输入随机数的最小值:");
        int randMin = scanner.nextInt();
        System.out.println("请输入随机数的最大值:");
        int randMax = scanner.nextInt();
        int randInt = (int) (random * (randMax - randMin + 1)) + randMin;
        System.out.println("随机数是:" + randInt);

        System.out.println("请输入你的心率:");
        int heartBeats = scanner.nextInt();
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("需要做进一步的检查");
        } else {
            System.out.println("心率正常");
        }

/*        大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：
高：180cm以上；
富：财富1千万以上；
帅：是。

        如果这三个条件同时满足，则：“我一定要嫁给他!!!”
        如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
        如果三个条件都不满足，则：“不嫁！”*/
        System.out.println("请输入身高:");
        int height = scanner.nextInt();
        System.out.println("请输入财富:");
        double rich = scanner.nextDouble();
        System.out.println("是不是帅哥（是/否):");
        char handsome = scanner.next().charAt(0);
        int condition = 0;
        if (height > 180) {
            condition++;
        }
        if (rich >= 10000000) {
            condition++;
        }
        if (handsome == '是') {
            condition++;
        }
        if (condition > 2) {
            System.out.println("我一定要嫁给他!!!");
        } else if (condition >= 1) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁");
        }

        //为了防止内存泄漏
        scanner.close();
    }
}
