/*
나와의 다른 패키지에 들어있 Dog.class 클래스를 사용해본다.
*/
package use;
//C:\java_workspace\app0228\bin
import  animal.Dog;

class UseDog {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.getName()); //접근에러
	}
}
