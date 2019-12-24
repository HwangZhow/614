package com.EX3_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener1 implements ActionListener {
    JTextField jf1,jf2;
    JTextArea ja1;
    public void setJf1(JTextField text){
        jf1=text;
    }
    public void setJf2(JTextField text){
        jf2=text;
    }
    public void setJa1(JTextArea area){
        ja1=area;
    }
    public void actionPerformed(ActionEvent e){
        try{
            double n1=Double.parseDouble(jf1.getText());
            double n2=Double.parseDouble(jf2.getText());
            double res=0;
            res=n1+n2;
            ja1.append(n1+"+"+n2+"="+res+"\n");
        }
        catch (Exception exp){
            ja1.append("\n请输入数字字符\n");
        }
    }
}
