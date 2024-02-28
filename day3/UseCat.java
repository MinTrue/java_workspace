
class UseCat {
	public static void main(String[] args){
		//고양이 한마리 인스턴스 올리기
		int x = 5; //기본 자료형

		//Cat c1 = new Cat("호찌",5,"흰색");
		//Cat c2 = new Cat("모찌",6,"검정색");
		//Cat c3 = new Cat("후찌",7,"파란색");
		//Cat c4 = new Cat("우찌",6 ,"노란색");


		Cat c3 = new Cat();
		c3.setName("길양이");
		c3.setAge(2);
		c3.setColor("갈색");

		System.out.println(c3.name);
		System.out.println(c3.age);
		System.out.println(c3.color);
		}
}



