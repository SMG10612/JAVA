package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// 문자열 배열 생성
		String[] name = {"kim", "lee", "park", "jung", "oh"};
		
		// 문자열의 배열을 이용하여 리스트 객체(제너릭) 생성
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("초기값 : " + lname);
		
		// 리스트 끝에 "ha" 추가
		lname.add("ha");
		
		// 0번지에 "김" 변경
		lname.set(0, "김");
		
		// 3번지에 "최" 추가 (인덱스 자동 조절)
		lname.add(3, "최");
		System.out.println("변경 후 : " + lname);
		
		// 무작위 재배치, Collections 클래스의 메소드 이용.
		Collections.shuffle(lname);
		System.out.println("셔플 후 : " + lname);
		
		// 정렬
		Collections.sort(lname);
		System.out.println("정렬 후 : " + lname);
		
		// 5번째 값 출력
		lname.get(5);
		System.out.println("5번째 값 출력 : " + lname);
	}

}
