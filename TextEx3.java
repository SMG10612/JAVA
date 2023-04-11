package chapter05;

import java.util.Scanner;

public class TextEx3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자를 입력하여 주세요 : ");
		int num = stdin.nextInt();
		int hap=0;
		for(int i=1; i<=1000; i++) {
			if(i%num==0) {
				hap += i;
			}
		}
		System.out.println("1~1000사이 "+num+"배수의 합은 : "+hap);
	}

}
