/*
 * 메소드 재정의(overriding)
 * 하위클래스에서 상위 클래스의 메소드를 재정의 하면 상위 클래스의 메소드는 숨겨지고
 * 재정의된 하위 클래스의 메소드만 사용
 * but,super키워드를 이용해서 부모 메소드 호출은 가능*/
package chapter10;

public class Calculator {
	double areaCircle(double r) {
		System.out.println("Executing areaCircle() of the Calculator object");
		return 3.14159*r*r;
	}
}
