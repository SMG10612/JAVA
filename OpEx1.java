/*
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해 주는 프로그램 작성
 * 조건1: 동전의 총계수를 최소화
 * 조건2: 고액의 동전 우선 교환
 */
package chapter03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 금액을 입력하세요 : ");
		int money = stdin.nextInt();
		System.out.println("입락한 금액 : "+money);
		
		int won500,won100,won50,won10;
		won500 = money/500;
		money = money%500;
		won100 = money/100;
		money = money%100;
		won50 = money/50;
		money = money%50;
		won10 = money/10;
		money = money%10;
		
		System.out.print("500원:"+won500+"개, 100원:"+won100+"개, 50원:"+won50+"개, 10원:"+won10+"개");
	}

}
