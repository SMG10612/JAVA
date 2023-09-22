package ch13_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamTest2_1 {

	public static void main(String[] args) {
		File file = new File("c.txt");
		
		//FileInput 객체 생성
		try {
			FileInputStream fr = new FileInputStream(file);
			
			//한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
			System.out.println("파일로부터 바이트를 읽어 화면에 출력");
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}
}
