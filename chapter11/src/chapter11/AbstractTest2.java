package chapter11;

abstract class Figure {
	abstract void draw();
}

class Triangle2 extends Figure{
	public void draw() {
		System.out.println("다형성 : 삼각형을 그린다");
	}
}

class Rectangle2 extends Figure{
	public void draw() {
		System.out.println("다형성 : 사각형을 그린다");
	}
}

class Oval2 extends Figure{
	public void draw() {
		System.out.println("다형성 : 타원형을 그린다");
	}
}


class Polydraw{ //도형그리기 클래스
	//Figure 형의 객체를 매개변수로 그 객체의 draw()메소드 호출
	public void pdraw(Figure f) {
		f.draw();
	}
	/*
	public void pdraw(Triangle2 t) {
		t.draw();
	}
	public void pdraw(Rectangle2 r) {
		r.draw();
	}
	public void pdraw(Oval2 o) {
		o.draw();
	}
	*/	
}

public class AbstractTest2 {

	public static void main(String[] args) {
		Polydraw p = new Polydraw();
		Figure fg1 = new Triangle2(); // 추상클래스 형으로 객체 생성
		Figure fg2 = new Rectangle2();
		Figure fg3 = new Oval2();
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);
	}

}
