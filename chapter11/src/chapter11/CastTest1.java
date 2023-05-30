/*타입변환(casting)-(자동타입 변환):
 * 1. 클래스의 타입 변환은 상속관계에서 발생
 * 2. 자식은 부모타입으로 자동타입 변환 기능
 * 3. 바로 위 부모가 아니더라도 상속 계층에서 상위 타입이면 자동 타입 변환 가능
 * 타입변환(강제타입 변환)
 * 1. 부모타입을 자식타입으로 변환
 * 2. 자식 타입이 부모 타입으로 형 변환 후 다시 자식 타입으로 변환 할 떄만 사용 가능
 * instanceof 연산자
 * 1. 객체가 특정 클래스로부터 생성된 객체인지 판별 true,false로 변환
 * 2. object 클래스는 자바의 최상위 클래스
 * 
 * */

package chapter11;

class Rectangle4{
	public int width;
	public int height;
	
	public Rectangle4(int w, int h) {
		width=w;
		height=h;
	}
	
	public int computerRectangleArea() {
		return width*height;
	}
}

class Cube4 extends Rectangle4{
	public int depth;
	public Cube4(int w, int h, int d) {
		super(w,h);
		depth=d;
	}
	public int computerCubeArea() {
		return super.computerRectangleArea()*depth;
	}
}

public class CastTest1 {

	public static void main(String[] args) {
		//상위클래스 형의 객체변수에 하위 클래스로부터 객체 생성 후 배정
		Rectangle4 r = new Cube4(10,20,30);
		
		System.out.println("r은 Rectangle4의 객체?"+(r instanceof Rectangle4));
		System.out.println("r은 Cube4의 객체?"+(r instanceof Cube4));
		System.out.println("r은 Object의 객체?"+(r instanceof Object));
		
		System.out.println();
		//상위클래스 형의 객체변수를 통해 상위 클래스 메소드 호출
		System.out.println("area is "+r.computerRectangleArea());
		
		//상위클래스 형의 객체변수를 통해 하위 클래스 메소드 호출 불가
		//System.out.println("area is"+r.computerCubeArea());
		//하위클래스 형의 객체변수에 상위 클래스로부터 생성된 객체 배정은 불가능
		//Cube4 c = new Rectangle4(10,20);
		
		Cube4 c = (Cube4) r; //r을 하위 클래스 객체로 강제타입변환
		System.out.println("volume is "+c.computerCubeArea());
		
	}

}
