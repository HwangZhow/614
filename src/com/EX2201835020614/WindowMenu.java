package com.EX2201835020614;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Component;
import static javax.swing.JFrame.*;

public class WindowMenu extends JFrame{
	JMenuBar menubar;
	JMenu menu,subMenu;
	JMenuItem item1,item2;
	JPanel imagePanel;
	ImageIcon background;
	public WindowMenu(){}
	public WindowMenu(String s,int x,int y,int w,int h){
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		background=new ImageIcon("src\\com\\icons\\EVA.jpg");
		JLabel label=new JLabel(background);
		label.setBounds(0,0,background.getIconWidth(),background.getIconHeight());
		imagePanel=(JPanel)getContentPane();
		imagePanel.setOpaque(false);
		imagePanel.setLayout(new FlowLayout());

		getLayeredPane().setLayout(null);
		getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(String s){
		setTitle(s);
		menubar=new JMenuBar();
		menu=new JMenu("NERV");
		subMenu=new JMenu("软件项目");
		item1=new JMenuItem("MAGI",new ImageIcon("src\\com\\icons\\home.png"));
		item2=new JMenuItem("中心教条",new ImageIcon("src\\com\\icons\\check.png"));
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.add(subMenu);
		subMenu.add(new JMenuItem("初号机",new ImageIcon("src\\com\\icons\\kb.png")));
		subMenu.add(new JMenuItem("二号机",new ImageIcon("src\\com\\icons\\email.png")));
		menubar.add(menu);
		setJMenuBar(menubar);
	}
}
