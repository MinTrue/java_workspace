package com.sds.project0305.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatB extends Frame implements KeyListener{
							/* is a 관계*/
	TextArea area; //html 에서의 textarea 와 동일
	Panel p_south;
	TextField t;
	ChatA chatA; //ChatA를 제어하기 위해 보유하자, 현재는 null
	
	public ChatB(ChatA chatA) { //new ChatB(채팅A 인스턴스)
		area = new TextArea();
		p_south = new Panel();
		t = new TextField(15);
		this.chatA = chatA; //매개변수로 넘겨받은 chatA 의 주소값을 멤버변수로 보관해놓자 그래야 두고두고 ChatA를 제어할 수있다
		
		//스타일 적용
		area.setBackground(Color.YELLOW);
		
		//조립
		add(area); //BorderLayout .CENTER 부착
		p_south.add(t); //판자에 텍스트 필드부착
		
		add(p_south, BorderLayout.SOUTH);//판자를 남쪽 영역에 부착

		//텍스트 필드와 리스너와의 연결
		t.addKeyListener(this);
		
		setBounds(750, 300, 300, 400); //위치 + 너비 까지 지정가능
		setVisible(true);
	}

	
	public void keyReleased(KeyEvent e) {	
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			//나의 area 에 로그 남기기
			String msg =t.getText(); //텍스트 필드에 입력한 값
			this.area.append(msg+"\n");
			//ChatA area 에 로그 남기기
			chatA.area.append(msg+"\n");
			
			//입력한값을 초기화
			t.setText("");
		}
	}
	
	public void keyTyped(KeyEvent e) {
	}
	public void keyPressed(KeyEvent e) {	
	}
}
