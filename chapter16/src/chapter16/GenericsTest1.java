package chapter16;


class Box<T>{	// 제너릭 클래스 선언
	T vol;		// 변수를 제너릭으로 선언
	void setVolume(T v) {	// 매소드의 매개변수를 제너릭으로 선언
		vol = v;
	}
	T getVolume() {	// 반환값의 형을 제너릭으로 선언
		return vol;
	}
}

public class GenericsTest1 {
	public static void main(String[] args) {
		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolume(200);
		//ibox.setVolume(3.14);		자료형이 다르기 때문에 오류 발생
		System.out.println("<Integer>박스의 부피 : " + ibox.getVolume());
		
		Box<Double> dbox = new Box<Double>();
		dbox.setVolume(3.14);
		//dbox.setVolume(200);		자료형이 다르기 때문에 오류 발생
		System.out.println("<Integer>박스의 부피 : " + dbox.getVolume());
	}

}
