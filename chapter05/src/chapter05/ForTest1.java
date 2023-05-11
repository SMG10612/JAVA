/* 2023-04-04
 * 송민규
 * 입력받은 숫자의 약수를 출력하시오
 * #문제분석
 * 변수 : (num,ㅑ)
 * #알고리즘
 * 1.약수를 구할 숫자 입력 : (num)
 * 2.복합논리(반복문 안에 선택문 포함)
 * 	for(i=1; i<=num; i++){
 * 		if(num%i==0){
 * 			print(i+" ")
 * 		}
 * }
 * 3.
 * */

package chapter05;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("약수를 구할 수를 입력하세요 : ");
		int num = stdin.nextInt();
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
