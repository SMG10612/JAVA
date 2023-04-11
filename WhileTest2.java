/*2023-04-04
 *송민규
 *입력받은 숫자의 팩토리얼 구하기
 *#문제분석
 *	변수 : fac,facValue
 *#알고리즘
 *	1.팩토리얼 구할 수 입력(fac)
 *	2.반복
 *	  while(fac>1)
 *		{
 *			facvalue = fac을 1씩 감소하면서 곱하기
 *		}
 *	3.결과출력
 * 
 * */
package chapter05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number : ");
		int fac=stdin.nextInt();
		int facValue=1;
		
		while(fac>1) {
			System.out.print(fac+"X");
			facValue+=fac--;
		}
		System.out.println("1="+facValue);
	}

}
