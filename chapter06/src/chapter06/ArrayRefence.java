/*객체 참조 배열
 * ;참조타입(클래스,인터페이스) 배열은 각 항목에 객체의 번지를 가짐
 *  Stirng은 클래스 이므로 String[] 배열은 각 항목에 문자열이 아닌, String 객체의 번지를 가짐
 *  String[] 배열간 문자 비교는 ==연산자 대신 equals()메소드 사용
 * */
package chapter06;

public class ArrayRefence {

	public static void main(String[] args) {
		String strArray[] = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0]==strArray[1]);//주소가 같다(객체가 같다)
		System.out.println(strArray[0]==strArray[2]);//주소가 다르다(2에는 또다른 객체를 하나 생성했기 떄문에)
		System.out.println(strArray[0].equals(strArray[2]));
		//equals가 0하고 2에 들어있는 값이 같은가 물어보는것(문자열이 같은가?)
	}

}
