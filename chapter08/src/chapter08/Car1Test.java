package chapter08;

public class Car1Test {

	public static void main(String[] args) {
		Cae1 car1 = new Cae1();
		
		System.out.println("Car1.company : "+ car1.company);
		System.out.println();
		
		Cae1 car2 = new Cae1("자가용");
		System.out.println("Car2.company : "+ car2.company);
		System.out.println("Car2.model : "+car2.model);
		System.out.println();
		
		Cae1 car3 = new Cae1("자가용","빨강");
		System.out.println("Car3.company : "+ car3.company);
		System.out.println("Car3.model : "+car3.model);
		System.out.println("Car3.color : "+car3.color);
		System.out.println();
		
		Cae1 car4 = new Cae1("택시","검정",200);
		System.out.println("Car4.company : "+ car4.company);
		System.out.println("Car4.model : "+car4.model);
		System.out.println("Car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();
	}

}
