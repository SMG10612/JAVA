package chapter08;

public class Cae1 {
	String company ="쉐보레";
	String model; //null
	String color; //null
	int maxSpeed; //0
	
	//생성자2
	public Cae1() {}
	
	public Cae1(String model) {
		this.model=model;
	}
	//생성자3
	public Cae1(String model, String color) {
		this.model=model;
		this.color=color;
	}
	//생성자4
	public Cae1(String model, String color,int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
