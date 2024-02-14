package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListCollection {

	public static void main(String[] args) {

		// ArrayList와 LinkedList 두 클래스 상위 클래스인 List 사용하자

//		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();

		// 문자열 인스턴스 저장
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");

		Iterator<String> it = set.iterator();
		// 반복문 ==> set 사용할때 사용
		// set 은 특성상 for 문을 사용할 수 없음
		// 만약 ArrayList를 쓰다가 set 을 쓰고 싶으면 Iterator 이용
		// ArrayList or LinkedList만 쓰고 싶다면 for 문 돌리면 됨.

		// 스택 안에 있는 값이 있는지 확인해줌
		// 스택 안에 있는 값이 없다면 반복문을 벗어남
		while (it.hasNext()) {
			System.out.println(it.next() + '\t');
		}
		System.out.println();

	}

}
