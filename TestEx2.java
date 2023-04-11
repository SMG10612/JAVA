/*
 * 2023년 03월 28일
 * 송민규
 * 직급과 나이를 입력받아서 직급이 7또는8이고 나이가 40대이면 "연금 80%"
 * 직급이 5 또는 6이고 나이가 50대이면 "연금 100%"
 * 그 외의 경우는 "연금 대상자가 아님
 * 을 출력하는 프로그램
 */
package chapter04;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = stdin.nextInt();
		String string = "";
		
		
		if(num > 0) {
			string = "양수";
		} else if(num == 0) {
			string = "0";
		} else {
			string = "음수";
		}
		System.out.println("입력하신 숫자는 "+string+" 입니다.");
	}

}
