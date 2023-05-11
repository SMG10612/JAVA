package chapter08_1;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("sum:"+(args[0]+args[1]));	//매개 변수값을 직접 더하기
		
		//문자열을 정수로 변환
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("sum is "+(num1+num2));
	}

}
