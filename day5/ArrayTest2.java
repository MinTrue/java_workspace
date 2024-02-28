class ArrayTest2 {

	public static void main(String[] args) {
		/*
		js 에서 선언과 동시에 값을 할당하는 방법으로 배열을 생성할때 아래와 같다
		let arr = ["사과","딸기","오렌지"]
		*/
		String[] arr={"사과","딸기","오렌지"};
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//jdk 5 버전 부터 집합형인 데이터는 개선된 루프(improved loop)를 지원
		for(String fruit : arr){ //(한요소: 집합형) 속도는 느리지만 집합형 데이터를 추출할때 코드량을 줄일 수 있다.
			System.out.println(fruit);
		}
	}
}
