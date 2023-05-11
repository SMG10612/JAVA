package Star;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 : ");
		int num = stdin.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
