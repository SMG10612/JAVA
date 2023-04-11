package chapter04;

import java.util.Scanner;

public class SimpleIFTest02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요 : ");
		int grade = stdin.nextInt();
		char gh = 'n';
		if(grade>=90&&grade<=100) {
			gh = 'A';
		}
		else if(grade>=80) {
			gh = 'B';
		}
		else if(grade>=70) {
			gh = 'C';
		}
		else if(grade>=60) {
			gh = 'B';
		}
		else {
			gh = 'F';
		}
		System.out.println("당신의 학점은 \'"+gh+"\' 입니다");
		
	}

}
