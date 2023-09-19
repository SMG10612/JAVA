/*
 * 작성일 : 2023년 9월 19일
 * 작성자 : 컴소부 202095047 송민규
 */
package ch13;

public class ExTest6 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println("메소드 호출 후");
		} catch (ArrayStoreException e) {
			System.out.println("ArrayStoreException 예외 발생");
			//e.printStackTrace();
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException 예외 발생");
		}
		
	}
	static void method1() throws RuntimeException {
		int a = 0;
		int b = 2 / a;
		System.out.println("나눗셈후");
	}
}

