package chapter10;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) { //제정의
		System.out.println("Executing areaCircle() of the Calculator object");
		return Math.PI*r*r;
	}
}
