class ArrayTest1 {

	public static void main(String[] args) {
		/*
		자바는 일반적인 프로그래밍 언어(c, c#..)와 마찬가지로
		배열을 선언시 반드시 그 크기를 명시해야 한다.
		즉 js와는 틀리다. 자동으로 늘어나거나 하지 못함 고정적임

		자바에서의 배열은 일반적인 변수 선언과 마찬가지로 반드시 자료형을 명시
		*/
		int[] arr = new int[4]; //크기가 4인 배열을 생성한다.
		System.out.println("배열의크기는"+arr.length); //숫자형

		//모든 배열은 객체로 처리 됨 따라서 배열 변수 자체를 출력하면 주소값이 출력
		//결론: "자바에서 배열은 객체이다"
		System.out.println(arr);

		/*자바의 모든 자료형으로 배열을 생성할 수 있다.
		   자바 언어에서 자료형은 기본자료형(문자,숫자,논리값) + 객체자료형
		*/
		boolean[] arr2 = new boolean[3]; //논리값
		char[] arr3 = new char[5]; //문자형

		//객체자료형으로 배열 선언하기
		String[] arr4 = new String[3]; //객체자료형
	    arr4[0]="사과";
        arr4[1]="딸기";
		arr4[2]="바나나";

		for(int i=0;i<arr4.length;i++){
			System.out.println(arr4[i]);
		}
	}
}
