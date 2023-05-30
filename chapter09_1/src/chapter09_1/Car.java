package chapter09_1;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달린다.");
	}
	public static void main(String[] args) {//정적 메소드안에 인스턴스 변수나 메소드 사용불가
		//speed=60; //(x)정적 메소드 안에서 인스턴스 필드는 객체 생성 후 사용해야 함
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
	
	

}
