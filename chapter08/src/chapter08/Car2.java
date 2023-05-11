package chapter08;

public class Car2 {
	String company ="쉐보레";
	String model; //null
	String color; //null
	int maxSpeed; //0
	
	//생성자2
	public Car2() {}
	
	public Car2(String model) {
		this(model,"은색",250);//생성자 4 호출
	}
	//생성자3
	public Car2(String model, String color) { //생성자 4 호출
		this(model,color,250);
	}
	//생성자4
	public Car2(String model, String color,int maxSpeed) { //공통실행코드
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
