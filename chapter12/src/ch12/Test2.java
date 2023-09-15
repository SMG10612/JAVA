/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

package ch12;

class TestTest{
	//private String text; //private라서 접근 안댐
	public String text;
	public TestTest(String s) {
		this.text = s;
	}
}

public class Test2 {

	public static void main(String[] args) {
		TestTest test = new TestTest("ABC");
		System.out.println(test.text.toLowerCase());
	}
}
