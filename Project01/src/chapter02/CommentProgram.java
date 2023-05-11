package chapter02;

import java.util.Scanner;

public class CommentProgram {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 : ");
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println("이름은 " + name + "이고 나이는 " + i + "이고 몸무게는 " + d + "입니다");
		
	}

}