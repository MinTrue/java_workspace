package com.sas.app0229.use;
// 실행하고자 할때 패키지 다 넣어야함 실행할떄 인수 창이뜨면 패키지를 입력한다 

import com.sds.app0229.bird.Bird;
import com.sds.app0229.bird.Duck;


class UseDuck{
	public static void main(String[] args){
	//기본자료형 간 형변환
	//자바에서는 비슷한 자료형이라면, 서로 형변환이 가능하다.
	//숫자(byte,short,int,long,float,double),문자(char)
	byte b =4; // 1
	int x =7 ; // 4
	x= b;

	//자바에서 객체형도 자료형이라면, 객체간 형변환도 가능할까? yes
	//자바에서 상속관계에 있는 자료형은 서로 비슷한 자료형으로 인정된다.
	//따라서 객체간 형변환도 지원


		// 오리 한마리 인스턴스 올리기
		Duck d = new Duck();

		//부모님이 물려준, age를 사용해본다
		System.out.println(d.name);
		d.eat();
		
		Bird bird = new Duck(); //bird가 부모 duck 자식 가능하다.
		System.out.println(bird.age);

		Duck dc = (Duck)bird;


	}

}