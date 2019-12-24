package com.Example9_9;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowDocument extends JFrame {
    JTextArea inputText,showText;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem itemCopy,itemCut,itemPaste;
    TextListener textChangeListener;            //inputText的监视器
    HandListener handleListener;                //itemCopy，itemCut，itemPaste的监视器
    WindowDocument(){
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        inputText=new JTextArea(15,20);
        showText=new JTextArea(15,20);
        showText.setLineWrap(true);             //文本自动回行
        showText.setWrapStyleWord(true);        //文本区以单词为界自动回行
        menubar=new JMenuBar();
        menu=new JMenu("编辑");
        itemCopy=new JMenuItem("复制C");
        itemCut=new JMenuItem("剪切T");
        itemPaste=new JMenuItem("粘贴P");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke('P'));
        itemCut.setAccelerator(KeyStroke.getKeyStroke('T'));
        itemCopy.setActionCommand("copy");
        itemCut.setActionCommand("cut");
        itemPaste.setActionCommand("paste");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menubar.add(menu);
        setJMenuBar(menubar);
        add(new JScrollPane(inputText));
        add(new JScrollPane(showText));
        textChangeListener=new TextListener();
        handleListener=new HandListener();
        textChangeListener.setInputText(inputText);
        textChangeListener.setShowText(showText);
        handleListener.setInputText(inputText);
        handleListener.setShowText(showText);
        (inputText.getDocument()).addDocumentListener(textChangeListener);
        //向文档注册监视器
        itemCopy.addActionListener(handleListener);
        //向菜单项注册监视器
        itemPaste.addActionListener(handleListener);
        itemCut.addActionListener(handleListener);
    }
}
