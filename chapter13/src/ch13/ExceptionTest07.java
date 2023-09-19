/*
 * 작성일 : 2023년 9월 19일
 * 작성자 : 컴소부 202095047 송민규
 * 나이를 입력받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.
 */
package ch13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest07 {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int old=0;//0으로 초기화해야 출력문에 오류안남
		try {
			old = std.nextInt();
			System.out.println("당신의 나이는 "+old+"살(세) 입니다.");
		} catch (InputMismatchException e) {
			System.out.println("나이는 정수형을 입력하십시오.");
			//e.printStackTrace();
		}
		//System.out.println("당신의 나이는 "+old+"살(세) 입니다."); //논리오류 
	}
}
//컨트롤 시프트 o : 한번에 import시키는 단축키