package com.Chapter10.EX3;
import java.io.*;

public class EX3 {
    public static void main(String[] args) {
        try{
            Runtime ce=Runtime.getRuntime();
            File file=new File("C:\\windows","Notepad.exe");
            ce.exec(file.getAbsolutePath());
            file=new File("C:\\Program Files\\Internet Explorer","IEXPLORE www.sohu.com");
            ce.exec(file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
