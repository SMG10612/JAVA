/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

package ch12;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea"));
		System.out.println(sb2.append(sb1));
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5,9)); easy java korea
		System.out.println(sb2.delete(5,10));
		System.out.println(sb2);
		System.out.println(sb1.reverse());
	}

}
