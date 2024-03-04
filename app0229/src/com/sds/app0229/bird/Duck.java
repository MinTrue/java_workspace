package com.sds.app0229.bird;

//새의 자식인 오리를 정의한다.
public class  Duck extends Bird{
	                     /*is  a*/ //생략이 되어있다
	public String color="white";
	/*
	public Duck(){
		super();
	}
	*/
	public void quack(){
		System.out.println("오리가 꽥괙 거려요");
	}
	public void  fly(){
		System.out.println("오리가 퍼덕 거려요");
	}
}
