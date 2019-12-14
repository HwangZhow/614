package com.test;
import java.awt.FlowLayout;
import javax.swing.*;

public class JFrameBackground {


    private JFrame frame = new JFrame("背景图片测试");

    private JPanel imagePanel;

    private ImageIcon background;

    public static void main(String[] args) {
        new JFrameBackground();
    }

    public JFrameBackground() {
        background = new ImageIcon("src\\com\\icons\\EVA.jpg");// 背景图片
        JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面

        label.setBounds(0, 0, background.getIconWidth(),
                background.getIconHeight());
        imagePanel = (JPanel) frame.getContentPane();
        imagePanel.setOpaque(false);
        imagePanel.setLayout(new FlowLayout());
        imagePanel.add(new JButton("测试按钮"));
        frame.getLayeredPane().setLayout(null);
        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(background.getIconWidth(), background.getIconHeight());
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
