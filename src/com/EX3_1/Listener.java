package com.EX3_1;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Listener implements DocumentListener {
    int sum=0;
    double aver=0;
    JTextArea inputjt,outputjt;
    public void setInputjt(JTextArea text){
        inputjt=text;
    }
    public void setOutputjt(JTextArea text){
        outputjt=text;
    }
    public void changedUpdate(DocumentEvent e){
        String str=inputjt.getText();
        String regex="[\\D]+";
        String[] addends=str.split(regex);
        outputjt.setText(null);
        for (int i=0;i<addends.length;i++)
            sum=sum+Integer.parseInt(addends[i]);
        int n=addends.length;
        aver=sum/n;
        outputjt.append("和：");
        outputjt.append(sum+"");
        outputjt.append("\n");
        outputjt.append("平均数：");
        outputjt.append(aver+"");

    }
    public void insertUpdate(DocumentEvent e) {
        changedUpdate(e);
    }
    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);
    }
}
