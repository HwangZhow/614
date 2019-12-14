package com.EX1201835020614;
import javax.swing.*;
import java.awt.*;
public class EX1201835020614 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window1=new JFrame("第一个窗口");
		JFrame window2=new JFrame("第二个窗口");
		Container con=window1.getContentPane();
		con.setBackground(Color.blue);
		window1.setBounds(300,300,300,300);
		window2.setBounds(200,200,200,200);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
