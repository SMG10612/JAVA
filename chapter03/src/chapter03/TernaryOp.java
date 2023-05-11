/*
 * 
 * 
 */

package chapter03;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = stdin.nextInt();
		
		boolean flag;
		flag=(a%2==0)?true:false;
		System.out.print(a+"이 짝수인가?:");
		System.out.print(flag);
	}

}
