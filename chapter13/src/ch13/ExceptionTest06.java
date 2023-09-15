/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

package ch13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest06 {

	public static void main(String[] args) throws FileNotFoundException, IOException {//정확한 예외 처리는 불가
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}
