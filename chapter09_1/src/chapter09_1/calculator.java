//정적 멤버 이용(static)
package chapter09_1;

public class calculator {
	static double pi=3.14159;//정적 필드
	//int field1;
	
	//static void Method() {
	//	this.field1=10;//안댐
	//}
	static int plus(int x,int y) {//정적 메소드
		return x+y;
	}
	static int minus(int x,int y) {//정적 메소드
		return x-y;
	}
}
