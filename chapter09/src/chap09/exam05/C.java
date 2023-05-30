package chap09.exam05;

import chap09.exam04.A;

public class C {
	public	C() {
		A a = new A();
		a.field1=1;
		a.field2=1;//호출 불가
		a.field3=1;//호출 불가
		
		a.method1();
		a.method2();//호출 불가
		a.method3();//호출 불가
	}
}
