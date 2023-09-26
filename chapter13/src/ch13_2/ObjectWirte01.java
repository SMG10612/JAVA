package ch13_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class PersonInfo implements Serializable{
	String name;
	String city;
	int age;
	
	//생성자
	public PersonInfo(String name, String city, int age) {//매개변수로 받은변수는 멤버변수로 가르키기위해 this를 씀
		this.name = name; //매개변수로 전달받은 값을 멤버 변수에 저장 //이름이 같기때문?
		this.city = city;  
		this.age = age;
	}
}

public class ObjectWirte01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner std = new Scanner(System.in);
		System.out.print("출력 파일 명을 입력하세요 : ");
		String fileName = std.next();
		
		String s1 = "***고객 정보***";
		
		//직렬화된 객체를 2개 생성
		PersonInfo p1 = new PersonInfo("송민규","부산",22);
		PersonInfo p2 = new PersonInfo("홍길도","서울",20);
		
		
		//직렬화된 객체를 2진수로 기록할 파일을 지정.
		//객체를 기록할 수 있는 ObjectOutputStream 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		// 직렬화된 객체를 파일에 2진수로 기록.
		oos.writeObject(s1); //1
		oos.writeObject(p1); //2
		oos.writeObject(p2); //3
		
		oos.close();
		
		System.out.println(fileName+"파일명으로 객체파일을 생성하였습니다.");
	}

}
