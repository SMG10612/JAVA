//final 필드 선언 초기화
package chapter09_1;

public class Person {
	final String nation="Korea"; //final선언후 초기화
	final String ssn; //생성자를 통해 초기화해야댐
	String name;
	
	public Person(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
