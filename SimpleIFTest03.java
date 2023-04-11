package chapter04;

import java.util.Scanner;

public class SimpleIFTest03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요 : ");
		int grade = stdin.nextInt();
		char gh = 'n';
		switch(grade/10){
			case 9 : gh = 'A'; break;
			case 8 : gh = 'B'; break;
			case 7 : gh = 'C'; break;
			case 6 : gh = 'D'; break;
			default : gh = 'F'; break;
		}
		System.out.println("당신의 학점은 \'"+gh+"\' 입니다");
	}

}
