package chapter10;

public class StudentExample {

	public static void main(String[] args) {
		Student students = new Student("홍길동","1234-5678",1);
		
		System.out.println("name : "+students.name);
		System.out.println("ssn : "+students.ssn);
		System.out.println("StudentNo : "+students.studentNo);
	}

}
