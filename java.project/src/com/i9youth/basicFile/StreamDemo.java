package com.i9youth.basicFile;

import java.io.*;

public class StreamDemo {

    public static void main(String[] args) throws IOException {
        //当前路径
        File file=new File(".");
        String path=file.getAbsolutePath();
        System.out.println(path);


        FileOutputStream fos = new FileOutputStream("b.log");
        fos.write("hello".getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(path + "\\src\\com\\i9youth\\basicFile\\a.log");
        byte[] b = new byte[3];
        int len;
        int times = 0;
        while ((len = fis.read(b)) != -1) {
            times ++;
            System.out.print("第[" + times +  "]次 ");
            System.out.println(new String(b, 0, len));
        }
        fis = new FileInputStream(path + "\\src\\com\\i9youth\\basicFile\\a.log");
        int b2;
        times = 0;
        while ((b2 = fis.read()) != -1) {
            times ++;
            System.out.print("第[" + times +  "]次 ");
            System.out.println((char)b2);
        }

        fis.close();

    }
}
