class Dog{
	String name;
	int age;

	//개성있는 강아지를 탄생시키기 위해 생성자를 정의한다
	//개발자가 생성자를 정의하는 순간부터는, 컴파일러가 더이상
	//디폴트 생성자를 정의하지 않는다 컴파잉러에 의한 생성자는
	//에러를 내지 않기 위한 최소한의 관여였기 때문에
	public Dog(String name, int age){
		this.name=name;
		this.age=age;
	

	//사용자가 정의한 자료형인 Dog 형도 배열로 선언이 가능
	//자바에서는 우리가 정의한 클래스를 자료형으로 인정해준다.
	//자바 개발자는 지금까지 없었던 새로운 자료형을 정의한 것으로 인정받음
		Dog[] arr5 = new Dog[3];

		Dog d1 = new Dog("메리",3); //인스턴스 생성
		Dog d2 = new Dog("뽀미",5); //인스턴스 생성
		Dog d3 = new Dog("짱구",8); //인스턴스 생성

		arr5[0]=d1; //배열에 넣기
		arr5[1]=d2; //배열에 넣기
		arr5[2]=d3; //배열에 넣기
	}
}