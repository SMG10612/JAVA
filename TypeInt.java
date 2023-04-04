package chapter03;

public class TypeInt {

	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0x03; //16진수
		int var3 = 345; //10진수
		
		byte var4 = -128;
		//byte var5 = 128; //입력값 초과
		
		long var6 = 10000000000L; //정수 리터럴이 int타입의 허용 범위 넘는 경우 'L'붙이기
		//long var7 = 10000000000; //컴파일 에러
		
		char c1 = 'A'; //문자 직접 저장
		char c2 = 65; //10진수로 저장
		char c3 = '\u0041'; //16진수로 저장
		
		String name= "MIN"; //문자열
		String str1 = "i like \"java\""; //이스케이프 문자
		String str2 = "number\tname\tage"; //이스케이프 문자
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		//System.out.println(var5);
		System.out.println(var6);
		//System.out.println(var7);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(name);
		System.out.println(str1);
		System.out.println(str2);
	}

}
