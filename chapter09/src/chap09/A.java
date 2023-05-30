package chap09;

public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b){} //defalut값 지정
	private A(String s) {}
}
