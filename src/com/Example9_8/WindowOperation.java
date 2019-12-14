package com.Example9_8;

import javax.swing.*;
import java.awt.*;

public class WindowOperation extends JFrame {
    JTextField inputNumberOne,inputNumberTwo;         //文本框  单行
    JComboBox choiceFuhao;                            //下拉列表
    JTextArea textShow;                               //文本框  多行
    JButton button;                                   //按钮组件
    OperatorListener operator;                        //监视ItemEvent事件的监视器
    ComputerListener computer;                        //监视ActionEvent事件的监视器
    public WindowOperation(){
        init();
        setVisible(true);                              //设置为可见
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    void init(){
        setLayout(new FlowLayout());
        inputNumberOne=new JTextField(5);       //5列
        inputNumberTwo=new JTextField(5);
        choiceFuhao=new JComboBox();                    //chioceFuhao为下拉列表对象
        button=new JButton("计算");                 //按钮  文本为计算
        choiceFuhao.addItem("选择运算符号：");            //下拉列表默认文本
        String [] a={"+","-","*","/"};
        for (int i=0;i<a.length;i++){
            choiceFuhao.addItem(a[i]);
        }
        textShow=new JTextArea(9,30);
        operator=new OperatorListener();
        computer=new ComputerListener();
        operator.setJComBox(choiceFuhao);
        operator.setWorkTogether(computer);
        computer.setJTextFieldOne(inputNumberOne);
        computer.setJTextFieldTwo(inputNumberTwo);
        computer.setJTextArea(textShow);
        choiceFuhao.addItemListener(operator);
        //chioceFuhao是事件源，operator是监视器
        button.addActionListener(computer);
        //button是事件源，computer是监视器
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
    }
}
