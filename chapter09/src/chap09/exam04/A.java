package chap09.exam04;

public class A {
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A() {
		field1=1;//가능
		field2=1;//가능
		field3=1;//가능(같은 클래스 내에서만)
		
		method1();//가능
		method2();//가능
		method3();//가능(같은 클래스 내에서만)
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
