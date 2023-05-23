package com.i9youth.basicFile;


import java.io.*;

public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        //当前路径
        File file = new File(".");
        String path = file.getAbsolutePath();
        System.out.println(path);

        String filename = path + "\\src\\com\\i9youth\\basicFile\\a.log";
        FileReader reader = new FileReader(filename);

        char[] ch = new char[2];
        int len;
        while ((len = reader.read(ch)) != -1) {
            System.out.print(new String(ch, 0, len));
        }

        reader.close();

        FileWriter writer = new FileWriter("c.log");

        writer.write("今天天气好晴朗\n");
        writer.write("今天天气好晴朗\n");
        writer.write("今天天气好晴朗\n");

        writer.close();

    }
}
