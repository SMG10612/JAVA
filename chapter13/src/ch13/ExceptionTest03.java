/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

package ch13;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.*;

public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = Integer.parseInt(stdin.next());
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdin.nextInt();
		
		try {
			System.out.println(num1 / num2); //예외가 발생할 것 같은 부분
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌수 없습니다.");
			//System.out.println("해당 예외 : "+e); //e를 찍는이유는 개발자가 보는것
			//e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("첫 번째 수는 숫자만 입력 하시오.");
		} catch(InputMismatchException e) {
			System.out.println("두 번쨰 수는 숫자만 입력하시오.");
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally { //생략 가능
			System.out.println("프로그램 종료.");
		}
	}

}
