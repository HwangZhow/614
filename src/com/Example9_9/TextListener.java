package com.Example9_9;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;

public class TextListener implements DocumentListener{
    JTextArea inputText,showText;
    public void setInputText(JTextArea text){
        inputText=text;
    }
    public void setShowText(JTextArea text){
        showText=text;
    }
    public void changedUpdate(DocumentEvent e){
        String str=inputText.getText();
        String regex="[\\s\\d\\p{Punct}]+";
        String words[]=str.split(regex);
        Arrays.sort(words);                     //按字典序从小到大排序
        showText.setText(null);
        for(int i=0;i<words.length;i++)
            showText.append(words[i]+',');
    }
    public void removeUpdate(DocumentEvent e){
        changedUpdate(e);
    }
    public void insertUpdate(DocumentEvent e){
        changedUpdate(e);
    }
}
