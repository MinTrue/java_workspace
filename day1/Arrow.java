/*
  자바는 클래스기반 언어이다.
  따라서 모든 ~~ 코드는 클래스 안에 작성해야 
  아래의 영문자로 작성된 코드는 , 오직 0과 1만을 이애할수 있는
  컴퓨터들에게는 알수없는 형태의 데이터이다.
  따라서 아래의 원본소스인 Arrow.java 파일을 컴파일하여
  문법검사나 자료형에 대한 판단 결과를 기계어 형태로 저장해놓고,
  추후에는 두번다시 컴파일하지 않고, 실행할 수 있기 때문에
  실행속도가 인터프리터 언어에 비해 빠르다
*/
class Arrow{
	//멤버변수를 선언할때는 클래스 영역에 작성

	//js와는 달리, 메모리에 올려질 데이터의 종류를 반드시
	//알려줘야 한다.
	int x=1;
	
	//자바, C, C# 등 대부분의 응용프로그램들은 실행을
	//위해서, 반드시 메인 메서드가 필요하다
	//프로그램이 메인을 먼저 찾아서 호출하려고 하기 때문
	//아래의 main() 메서드는 자바 프로그램 실행 시
	//즉 'java 대상클래스' 형식에서  java 프로그램에 
	//의해 자동호출

	public static void main(String[] args){
 		System.out.print("나의 첫자바");

		//구구단
		for(int i=1;i<=9;i++){
			//홀수번쨰만 출력
			if(1%2 !=0){
				System.out.println("2*"+i+"="+(2*i));
			}
		}
	}
}
























