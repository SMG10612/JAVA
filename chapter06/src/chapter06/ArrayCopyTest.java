/*Array클래스 : System.arraycopy(str,
 * */
package chapter06;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		String str3[] = {"java","array","copy"};
		String str4[] = new String[5];
		
		for(int i=0; i<num1.length; i++) {
			num2[i] = num1[i];
		}
		
		System.out.print("num2 value : ");
		for(int i:num2) {
			System.out.print(i+" ");
		}
		
		System.arraycopy(str3, 0, str4, 0, 3);
		System.out.print("\nstr4 value : ");
		for( String value:str4) {
			System.out.print(value+" ");
		}
		
		System.out.print("\nstr5 value : ");
		String str5[] = Arrays.copyOf(str3, 2);
		for(String value:str5) {
			System.out.print(value+" ");
		}
	}

}
