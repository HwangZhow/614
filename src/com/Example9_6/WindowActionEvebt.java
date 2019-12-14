package com.Example9_6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class WindowActionEvent extends JFrame{
    JTextField text;
    ActionListener listener;
    public WindowActionEvent(){
        setLayout(new FlowLayout());
        text=new JTextField(10);
        add(text);                                  //创建监视器
        listener=new ReaderListen();                //text将listener注册为自己的监视器
        text.addActionListener(listener);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
