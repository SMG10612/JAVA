/*클래스 내부에서 메소드를 호출 할 경우에는 객체를 생성할 필요가 없다
 * 메소드 이름만으로 호출이 가능하다.
 */
package chapter08_1;

public class Calculation {
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum=plus(x,y); //클래스 내부에서 메소드 호출 (메소드 이름만으로 호출)
		double result=sum/2;
		return result;
	}
	
	void execute() {
		double result=avg(7,10); //클래스 내부에서 메소드 호출
		println("execution result:"+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
