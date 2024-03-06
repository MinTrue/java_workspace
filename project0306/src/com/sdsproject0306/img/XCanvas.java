package com.sdsproject0306.img;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

//Canvas 를 재정의 하기 위한 클래스
public class XCanvas extends Canvas {
	//자바에서 이미지르 얻는 방법은 여라가지 있으나, 이번 시간엥 Toolkit 을 이용한 이미지
	//얻는 방법을 알아보자
	
	//추상클래스라 하여 무조건 자식을 정의한 후 new 하는 것이 아니라 이미 api에서 인스턴스를 얻는
	//방법을 제공해 주는게 있는지 알아봐야 함
	Toolkit kit = Toolkit.getDefaultToolkit(); //추상클래스이고, 자체적으로 인스턴스를 얻는 메서드가 지원 static 으로
	Image image;
	int x=100, y=300, width=50, height=50;
	
	public XCanvas() {
		//이미지 경로나 윈도우나 맥, 리눅스만 사용하는 경로를 넣으면 자바의 슬로건 위배됨 
		//개선하는 방법을 알아보자, 오늘은 그냥 쓴다.
		image = kit.getImage("C:/java_workspace/project0306/images/plane.png");
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, x, y, width, height, null);

	}

}
