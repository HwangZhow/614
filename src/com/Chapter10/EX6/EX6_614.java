package com.Chapter10.EX6;
import java.io.*;

public class EX6_614 {
    public static void main(String[] args) {
        File sourceFile=new File("d.txt");
        File targetFile=new File("e.txt");
        char c[]=new char[19];
        try {
            Writer out=new FileWriter(targetFile,true);
            Reader in=new FileReader(sourceFile);
            int n=-1;
            while((n=in.read(c))!=-1){
                out.write(c,0,n);
            }
            out.flush();
            out.close();
        }
        catch (IOException e){
            System.out.println("ERROR "+e);
        }
    }
}
