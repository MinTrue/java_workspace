package com.sas.app0229.use;
// �����ϰ��� �Ҷ� ��Ű�� �� �־���� �����ҋ� �μ� â�̶߸� ��Ű���� �Է��Ѵ� 

import com.sds.app0229.bird.Bird;
import com.sds.app0229.bird.Duck;


class UseDuck{
	public static void main(String[] args){
	//�⺻�ڷ��� �� ����ȯ
	//�ڹٿ����� ����� �ڷ����̶��, ���� ����ȯ�� �����ϴ�.
	//����(byte,short,int,long,float,double),����(char)
	byte b =4; // 1
	int x =7 ; // 4
	x= b;

	//�ڹٿ��� ��ü���� �ڷ����̶��, ��ü�� ����ȯ�� �����ұ�? yes
	//�ڹٿ��� ��Ӱ��迡 �ִ� �ڷ����� ���� ����� �ڷ������� �����ȴ�.
	//���� ��ü�� ����ȯ�� ����


		// ���� �Ѹ��� �ν��Ͻ� �ø���
		Duck d = new Duck();

		//�θ���� ������, age�� ����غ���
		System.out.println(d.name);
		d.eat();
		
		Bird bird = new Duck(); //bird�� �θ� duck �ڽ� �����ϴ�.
		System.out.println(bird.age);

		Duck dc = (Duck)bird;


	}

}