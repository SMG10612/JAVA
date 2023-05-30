package chap09.exam04;

public class B {
	public B() {
		A a = new A();
		a.field1=1;
		a.field2=1;
		a.field3=1;//호출 불가
		
		a.method1();
		a.method2();
		a.method3();//호출 불가
	}
}
