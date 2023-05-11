package chapter08;

public class CarTest {

	public static void main(String[] args) {
		//*클래스는 틀이다
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("현재속도 : "+myCar.speed);//묵시적 초기화
		
		//필드값 변경
		myCar.speed=60;
		System.out.println("수정된속도 : "+myCar.speed);
	}

}
