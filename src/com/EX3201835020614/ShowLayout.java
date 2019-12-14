package com.EX3201835020614;
import java.awt.*;
import javax.swing.*;

public class ShowLayout extends JFrame {
    PannelGridLayout pannelGrid;
    PanelNullLayout panelNull;
    JTabbedPane p;
    ShowLayout(){
        pannelGrid=new PannelGridLayout();
        panelNull=new PanelNullLayout();
        p=new JTabbedPane();
        p.add("网格布局的面板",pannelGrid);
        p.add("空布局的面板",panelNull);
        add(p,BorderLayout.CENTER);
        add(new JButton("窗体是BorderLayout布局"),BorderLayout.NORTH);
        add(new JButton("南"),BorderLayout.SOUTH);
        add(new JButton("西"),BorderLayout.WEST);
        add(new JButton("东"),BorderLayout.EAST);
        setBounds(10,10,570,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }

}
