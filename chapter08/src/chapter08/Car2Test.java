package chapter08;

public class Car2Test {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("Car1.company : "+ car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("회사");
		System.out.println("Car2.company : "+ car2.company);
		System.out.println("Car2.model : "+car2.model);
		System.out.println();
		
		Car2 car3 = new Car2();
		System.out.println("Car3.company : "+ car3.company);
		System.out.println("Car3.model : "+car3.model);
		System.out.println("Car3.color : "+car3.color);
		System.out.println();
		
		Car2 car4 = new Car2();
		System.out.println("Car4.company : "+ car4.company);
		System.out.println("Car4.model : "+car4.model);
		System.out.println("Car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();

	}

}
