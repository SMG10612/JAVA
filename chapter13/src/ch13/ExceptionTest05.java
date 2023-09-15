package ch13;

/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴소부 202095047 송민규
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e+ "파일을 찾을 수 없습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 앍을 수 없습니다.");
			//e.printStackTrace();
		}
	}

}
