package com.Chapter10.EX5_mod;
import java.io.*;
import java.util.Scanner;

public class EX5_614 {
    public static void main(String[] args) {
        Scanner Sin=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String a=Sin.nextLine();
        String regex="[\\s\\d\\p{Punct}]+";
        String[] b =a.split(regex);
        File file = new File("614.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            for (int i=0;i<b.length;i++) {
                out.write(b[i].getBytes());
            }
            out.close();
            System.out.println(file.getName() + "的大小：" + file.length() + "字节");
        } catch (IOException e) {
            System.out.println("614Error " + e);
        }
    }
}
