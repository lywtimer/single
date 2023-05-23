package com.i9youth.basicString;

public class Demo {

    public static void main(String[] args) {
        System.out.println("===========创建字符串的方式=======");
        String str = "我是中国人";
        String str2 = new String("我是中国人");
        char[] arr = {'我','是','中','国','人'};
        byte[] arr2 = {97,98,99,100};
        String str3 = new String(arr); //字符数组
        String str4 = new String(arr2, 0, 3); //字节数组

        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

        System.out.println("===========字符串的常用方式=======");
        String article = "我爱北京天安门,天安门上太阳升,what a wonderful building!";
        String findStr = "天安门";
        String findStr2 = "abc";
        System.out.println(article.charAt(2));
        System.out.println(article.charAt(article.length() - 1));
        System.out.println(article.concat("\n第二句开始"));
        System.out.println(article.contains(findStr));
        System.out.println(article.contains(findStr2));
        System.out.println(article.indexOf(findStr));
        String filename = "Article.php";
        System.out.println(filename.endsWith(".php"));
        System.out.println(filename.startsWith("rticle", 1));
        String abc = "abc";
        System.out.println(abc.equals(findStr2));

        System.out.println("===========字符串的内存分析=======");
        String str11 = "ti876345";
        String str12 = new StringBuilder().append("ti").append("876345").toString();
        System.out.println(str11);
        System.out.println(str12);
        System.out.println(str11 == str12);//false

        System.out.println("===========可变字符串=======");
        int times = 9000000;
        long startTime = System.currentTimeMillis();
//        variableString(times);
//        System.out.println("执行时间:" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        variableString2(times);
        System.out.println("执行时间:" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        variableString3(times);
        System.out.println("执行时间:" + (System.currentTimeMillis() - startTime));

    }

    static void variableString(int times) {
        String str = "";
        for (int i = 0; i < times; i++) {
            str += i;
        }
    }

    static void variableString2(int times) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            stringBuilder.append(i);
        }
    }

    static void variableString3(int times) {
        final StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < times; i++) {
            stringBuffer.append(i);
        }
    }
}
