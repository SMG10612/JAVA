/* 20203-04-04
 * 송민규
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 * 
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while,continue사용)
 * */
package chapter05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자를 입력 하세요 : ");
		int num = stdin.nextInt();
		int temp = 0;
		int i = 1;
		while(i<=100) {
			i++;
			if(i%num!=0) {
				continue;
			}
			temp+=i;
		}
		System.out.println(num+"의 배수의 합은 : "+temp);
	}
}