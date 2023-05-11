package chapter08_1;

public class Rectangle_Test {

	public static void main(String[] args) {
		Rectangle myRec = new Rectangle();
		
		double result1=myRec.areaRectangle(10);
		double result2=myRec.areaRectangle(10,20);
		
		System.out.println("area of the regular square="+result1);
		System.out.println("area of the angled square="+result2);
	}

}
