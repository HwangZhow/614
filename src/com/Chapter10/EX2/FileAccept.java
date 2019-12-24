package com.Chapter10.EX2;
import java.io.*;

public class FileAccept implements FilenameFilter{
    private String extendName;
    public void setExtendName(String s){
        extendName="."+s;
    }
    public boolean accept(File dir,String name){
        return name.endsWith(extendName);
    }
}
