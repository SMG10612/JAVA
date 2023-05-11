package Star;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 : ");
		int num = stdin.nextInt();
		for(int i =0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j<num-i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}

}
