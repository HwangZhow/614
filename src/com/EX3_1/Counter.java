package com.EX3_1;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Counter extends JFrame{
    JTextArea inputjt,outputjt;
    Listener listener;
    public Counter(){
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        inputjt=new JTextArea(10,25);
        outputjt=new JTextArea(10,25);
        listener=new Listener();
        listener.setInputjt(inputjt);
        listener.setOutputjt(outputjt);
        add(inputjt);
        add(outputjt);
        (inputjt.getDocument()).addDocumentListener(listener);
    }
}
