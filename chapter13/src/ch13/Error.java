/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

package ch13;

public class Error {

	public static void main(String[] args) {
		x();
	}
	
	static void x() {
		y();
	}
	static void y() {
		z();
	}
	static void z() {
		int i = 1;
		int j = 0;
		System.out.println(i/j);
	}

}
//Exception:예외 ,  / by zero : 0으로 나눌수없다