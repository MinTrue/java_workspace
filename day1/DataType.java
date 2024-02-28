/*
[ 인터프리터 방식 vs  컴파일 방식]

	                    편의성                                        속도

인터프리터      편하다(자료형 구분 x)                  실행할떄마다 판단(느리다)

컴파일         불편하다(원본소스-> 기계어)              실행할때 기계어 실행
                문법검사, 자료형종류 판단등
                의 최종 결과물을 기계어 형태저장
*/

/*
[일반적인 프로그래밍 언어의 학습 순서]
1. 변수와 자료형 (일거리 제공법)
2. 연산자 (일거리를 어떻게 연산할지 결정하는 부호)
3. 제어문 (실행부를 제어할 수 있는 방법)
4. 함수 (코드의 재사용)
5. 배열 (대량, 규치데이터 효율적처리)
6. 객체(현실 반영 기존변소+기존함수=단위(클래스))
*/

class DataType{
	
	/*
	java 호출대상 main() 메서드 정의
	java도 다른 프로그래밍 언어와 마찬가지로, 문자,숫자,논리값을
	사용할 수 있다. 단, 자바는 자료형을 반드시 명시해야 하는 컴파일 기반
	의 언어이기 때문에, 자료형이 세분화되어 있다.
	*/

	public static void main(String[] args){
		//문자 자료형(A, B 하나짜리 철자로 되어 있는 데이터)
		char ch = 'A';
		String str="korea";

		//숫자형 (실수(소수점지원), 정수)
		//실수 : float(4byte) < double(8byte) (용량에 차이)
		//정수 : byte(1byte) < short(2byte) < int(4byte) < long(8byte) (용량 차이)

		}

}