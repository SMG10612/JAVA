/*
 * 작성일 : 2023년 9월 19일
 * 작성자 : 컴소부 202095047 송민규
 */
package ch13;

public class ExTest1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		try {
			System.out.println("2/0은 : ");
			int div = b/a;
			System.out.println(div);
		}
		catch(RuntimeException ex) {
			System.out.println("RuntimeException 예외 발생");
		}
		catch(Exception ex) {
			System.out.println("Exception 예외 발생");
		}
	}

}
