//입력받은 단의 구구단 출력하기

package chapter05;

import java.util.Scanner;

public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("단을 하나 입력하세요 : ");
		int dan = stdin.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
	}
}
