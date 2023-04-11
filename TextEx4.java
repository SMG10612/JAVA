/* 두개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는 프로그램 작성
 * #문제분석
 * 	#문제분석
 * 	변수 =num1,num2,sum
 * 	#알고리즘
 * 	1. 두 정수 입력(num1,num2)
 * 	2. 선택문(if (num1<num2))
 * 	3. 복합논리(반복문 안에 선택문 포함)
 * 		while(num1<=num2){
 * 			if(sum1%2==0){
 * 				sum+=sum1
 * 			}
 * 			num1+=1
 * 		}
 * */

package chapter05;

import java.util.Scanner;

public class TextEx4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 두개를 입력하여 주세요 : ");
		int first = stdin.nextInt();
		int second = stdin.nextInt();
		int temp = 0;
		if(second > first) {
			temp = first;
			first = second;
			second = temp;
		}
		temp=0;
		for(int i = second; i <= first; i++) {
			if(i%2!=0) {
				temp += i;
			}
		}
		System.out.println("두 수 사이의 홀수값의 합은 : "+temp);
		
	}

}
