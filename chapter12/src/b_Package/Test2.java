/*
 * 작성일 : 2023년 9월 12일
 * 작성자 : 컴소부 202095047 송민규
 */

package b_Package;
import a_Package.Test1;
//import a_Package.*;

public class Test2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.sum(10, 20));
	}
}
