package chapter10;

public class SupersonicAirplane extends Airplane{
	public static final int NOMAL=1;//상수는 상속안댐 //제정의 또한 안댐
	public static final int SUPERSONIC=2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("supersonic flight.");
		} else {
			super.fly(); //Airplane 객체의 fly() 메소드 호출
		}
	}
}
