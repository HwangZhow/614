package com.EX3201835020614;
import java.awt.*;
import javax.swing.*;

public class PannelGridLayout extends JPanel {
    PannelGridLayout(){
        GridLayout grid=new GridLayout(10,10);
        setLayout(grid);
        Label label[][]=new Label[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                label[i][j]=new Label();
                if((i+j)%2==0)
                    label[i][j].setBackground(Color.black);
                else
                    label[i][j].setBackground(Color.red);
                add(label[i][j]);
            }
        }
    }
}
