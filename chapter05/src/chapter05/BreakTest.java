/* 20203-04-04
 * 송민규
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package chapter05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num = 0;
		int temp = 0;
		int cnt = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = stdin.nextInt();
			temp += num;
			System.out.println("현재 합 : "+temp);
			cnt++;
			if(temp>=1000) {
				System.out.println("1000을 넘은 수 : "+num);
				//temp=temp-num;
				System.out.println("평균 : "+(temp/cnt));
				break;
			}
		}		
	}

}
