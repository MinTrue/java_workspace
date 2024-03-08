package com.sds.project0308.sprite;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


//개발자가 그림을 뺏어서 그리기 위해 JPanel  을 상속받아 paint() 메서드를 재정의 해야 한다.
public class MyPanel extends JPanel{
	//스프라이트 이미지는배열로 선언
	Toolkit kit =Toolkit.getDefaultToolkit();
	String[] path = {

			"C:/java_workspace/project0308/res/image1.png",
			"C:/java_workspace/project0308/res/image2.png",
			"C:/java_workspace/project0308/res/image3.png",
			"C:/java_workspace/project0308/res/image4.png",
			"C:/java_workspace/project0308/res/image5.png",
			"C:/java_workspace/project0308/res/image6.png",
			"C:/java_workspace/project0308/res/image7.png",
			"C:/java_workspace/project0308/res/image8.png",
			"C:/java_workspace/project0308/res/image9.png",
			"C:/java_workspace/project0308/res/image10.png",
			"C:/java_workspace/project0308/res/image11.png",
			"C:/java_workspace/project0308/res/image12.png",
			"C:/java_workspace/project0308/res/image14.png",
			"C:/java_workspace/project0308/res/image15.png",
			"C:/java_workspace/project0308/res/image16.png",
			"C:/java_workspace/project0308/res/image17.png",
			"C:/java_workspace/project0308/res/image18.png"
	};
	
	Image[] imgArray = new Image[path.length]; //이미지가 들어갈 공간 확보
	int index=0; //어떤 이미지를 보여줄지를 결정짓는 배열의 index
	
	public MyPanel() {
		for(int i=0;i<imgArray.length;i++) {
			imgArray[i] = kit.getImage(path[i]);
		}
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.YELLOW); //그림에 사용될 페인트 색상 노란색으로
		g.fillRect(0, 0, 500, 400);//채워진 사각형을 그리기
		
		g.drawImage(imgArray[index], 100, 50, 200, 213, this);
	}
}
