/*
 * 작성일 : 2023년 9월 19일
 * 작성자 : 컴소부 202095047 송민규
 */
package ch13;

public class ExText1 {
	public static void parse(String str) {
		float f = 0;
		try {
			f =Float.parseFloat(str);
			} catch (NumberFormatException nfe) {
				 f=0;
			} finally {
				System.out.println(f);
			}
	}
	
	public static void main(String[] args) {
		parse("korea");
	}

}
