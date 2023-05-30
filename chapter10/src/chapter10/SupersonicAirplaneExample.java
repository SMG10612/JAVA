package chapter10;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.land();
		
		System.out.println();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.takeoff();
		sa.fly();
		sa.land();
		
		System.out.println();
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.takeoff();
		sa.fly();
		sa.land();
	}

}
