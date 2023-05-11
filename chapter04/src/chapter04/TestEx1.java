/*
 * 2023년 03월 28일
 * 송민규
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수들을 모두 더해서 출력
 */
package chapter04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("직급을 입력하세요 : ");
		int jik = stdin.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = stdin.nextInt();
		
		if(jik<=8 && jik>=7 && age>=40) {
			System.out.println("당신의 연금은 80%입니다");
		} else if(jik <= 6 && age>=50) {
			System.out.println("당신의 연금은 100%입니다");
		} else {
			System.out.println("당신은 연금 대상자가 아닙니다");
		}
	}

}
