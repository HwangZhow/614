package com.EX3_2;

import com.EX3_1.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jf1,jf2;
    JTextArea ja1;
    JButton jb1,jb2,jb3,jb4;
    Listener1 listener1;
    Listener2 listener2;
    Listener3 listener3;
    Listener4 listener4;
    public Calculator(){
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        jf1=new JTextField(25);
        jf2=new JTextField(25);
        ja1=new JTextArea(25,25);
        listener1=new Listener1();
        listener2=new Listener2();
        listener3=new Listener3();
        listener4=new Listener4();
        jb1=new JButton("加");
        listener1.setJf1(jf1);
        listener1.setJf2(jf2);
        listener1.setJa1(ja1);
        jb1.addActionListener(listener1);
        jb2=new JButton("减");
        listener2.setJf1(jf1);
        listener2.setJf2(jf2);
        listener2.setJa1(ja1);
        jb1.addActionListener(listener2);
        jb3=new JButton("乘");
        listener3.setJf1(jf1);
        listener3.setJf2(jf2);
        listener3.setJa1(ja1);
        jb1.addActionListener(listener3);
        jb4=new JButton("除");
        listener4.setJf1(jf1);
        listener4.setJf2(jf2);
        listener4.setJa1(ja1);
        jb1.addActionListener(listener4);
        add(jf1);
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jf2);
        add(ja1);
    }
}
