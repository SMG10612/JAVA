/* 2023-04-04
 * 송민규
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 * #문제분석
 * 	변수 : num,i,j
 * #알고리즘
 * 	1.줄수 입력(num)
 * 	2.중첩반복
 * 		while(i<=num){
 * 			while(i<=num){
 * 				별 찍기
 * 			}
 * 		}
 * */

package chapter05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 : ");
		int num = stdin.nextInt();
		int i=1;
		while(i<=num) {
			int j = 1;
			while(j<=num) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
