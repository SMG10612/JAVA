package chapter09_1;

public class calculatorTest {

	public static void main(String[] args) {//정적 메소드
		double result1=10*20*calculator.pi;//pi앞에 static이 있기때문에 객체 생성안하고도 사용가능
		int result2 = calculator.plus(10,5);
		int result3 = calculator.minus(10,5);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
	}

}
