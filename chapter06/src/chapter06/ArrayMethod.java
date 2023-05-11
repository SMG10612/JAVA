/*클래스는 속성과 기능으로 구성
 * 메소든느 클래스의 핵심으로 클래스가 어떤 기능을 하는지 나타냄
 * 배열 조작 메소드는 1차원 배열에만 적용
 * */
package chapter06;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		int int1[] = {9,1,7,3,5,4,6,2,8,0};
		System.out.println("초기배열 : "+Arrays.toString(int1));
		
		Arrays.fill(int1, 3,5,33);
		System.out.println("fill()수행 후 : "+Arrays.toString(int1));
		
		Arrays.sort(int1);
		System.out.println("sort()수행 후 : "+Arrays.toString(int1));
		System.out.println("33은 배열의 "+Arrays.binarySearch(int1, 33)+"에 위치");
		//2진 바이너리
		//0 1 2 3
		//1 5 7 10
		//솔팅할때 6이 들어갈려고할때 (*-1)-1에 리턴한다
	}

}
