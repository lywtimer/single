package com.i9youth.basicFile;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class First {

    public static void main(String[] args) throws IOException {
        String dirname = "D:\\work.note";
        File file = new File(dirname);
        if (file.isDirectory()) {
            System.out.println("=====文件列表====");
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isFile();
                }
            });
            for (File file1 : files) {
                System.out.println(file1.getName() + " is file? " + file1.isFile());
            }
        } else {
            System.out.println(dirname + " 是文件 " + file.isFile());
        }
        System.out.println("=====文件操作====");
        String dir = "D:\\work.note\\english";
        File dirHandle = new File(dir);
        if (dirHandle.isDirectory()) {
            System.out.println(dir + " 是文件夹");
            String demo = dir + "\\demo.txt";
            File demoHandle = new File(demo);
            System.out.println(demoHandle + "的文件名是:" + demoHandle.getName());
            System.out.println(demoHandle + "的绝对路径是:" + demoHandle.getAbsolutePath());
            System.out.println(demoHandle + "的相对路径是:" + demoHandle.getPath());
            System.out.println(demoHandle + "的大小是:" + demoHandle.length());


            if (demoHandle.exists()) {
                final boolean delete = demoHandle.delete();
                System.out.println(demo + "已经存在,删除结果:" + delete);
            } else {
                final boolean newFile = demoHandle.createNewFile();
                System.out.println(demo + "不存在,创建结果 " + newFile);
            }
        }
    }
}
