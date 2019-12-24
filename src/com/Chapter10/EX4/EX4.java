package com.Chapter10.EX4;
import java.io.*;

public class EX4 {
    public static void main(String[] args) {
        int n=-1;
        byte [] a=new byte[100];
        try {
            File f=new File("G:\\workSpace\\614_2\\src\\com\\Chapter10\\EX5_mod\\EX5_614.java");
            InputStream in=new FileInputStream(f);
            while ((n=in.read(a,0,100))!=-1){
                String s=new String(a,0,n);
                System.out.println(s);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("File read Error"+e);
        }
    }
}
