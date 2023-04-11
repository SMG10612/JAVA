/* 2023.04.04
 * 송민규
 * 두 숫자를 입력받아서 두수의 합계 출력하기
 * 변수 : first, second, total
 * 알고리즘
 * 1. 정수 입력받기 : first,second
 * 2. 선택문if(first<second)
 * 3. 반복문(for first부터 second까지 first++)
 * 			total += first
 * */
package chapter05;

import java.util.Scanner;

public class TextEx5 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 두개를 입력하여 주세요 : ");
		int first = stdin.nextInt();
		int second = stdin.nextInt();
		int temp = 0;
		if(second < first) {
			temp = first;
			first = second;
			second = temp;
		}
		temp=0;
		while(first<=second) {
			temp+=first;
			first+=1;
		}
		System.out.println("두 수의 합은 : "+temp);
		
	}
}
