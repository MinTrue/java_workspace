/*
컬렉션 프레임웍에서 지원하는 객체 중, 순서 없는 객체들의 집할을 다루느
Set에 대해 학습

■Set의 특징
1) 순서 없이 모여진다.
2) 중복을 허용하지 않는다.(중복데이터 덮어쓴다.)
3) 오직 객체만을 담을 수 잇다.(컬렉션 프레임웍의 모든 객체의 공통)
*/
import java.util.HashSet;

class SetTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("BMW");
		set.add("AUDI");
		set.add("Benz");

		//모든 요소들을 반복문으로 출력 가능? X
		Iterator it = set.iterator();

	}
}
