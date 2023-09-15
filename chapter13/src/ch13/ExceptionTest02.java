/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

package ch13;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdin.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdin.nextInt();
		
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("해당 예외 : "+e);
			//e.printStackTrace();
		}
	}

}//알트 시프트 제트 : 트라이 캐치문 단축키
