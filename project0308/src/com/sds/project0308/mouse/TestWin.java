package com.sds.project0308.mouse;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestWin extends JFrame {
	JButton bt;
	Canvas can;
	
	
	public TestWin() {
		bt = new JButton("눌러봐");
		can = new Canvas() {
				public void paint(Graphics g) {
					g.fillOval(50, 50, 100, 100);
			}
		};
		can.setPreferredSize(new Dimension(250,200));
		setLayout(new FlowLayout());
		add(bt);
		add(can);
		
		//버튼과 리스너 연결
		//클릭이라는 행위를 .java 까지 만들어가면서 구현을 할 필요가 있는가?
		bt.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("나 눌럿어?");
				}
			}
		);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TestWin();
	}

}
