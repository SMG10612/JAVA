/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴소부 202095047 송민규
 * 설명 : 바이트 단위로 파일에 저장.(파일 생성)
 */

package ch13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInoutStreamTest2 {

	public static void main(String[] args) throws IOException {
		//파일 객체 생성
		File file = new File("c.txt");
		
		//FileReader 객체 생성
		FileReader fr = new FileReader(file);
		
		//한 문자씩 읽기
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}
