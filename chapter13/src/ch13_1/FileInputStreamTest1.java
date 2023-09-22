/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴소부 202095047 송민규
 * 설명 : 파일에 저장된 바이트 내용 가져오기.(출력)
 */
package ch13_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		
		
		try {
			System.out.print("읽을 파일명을 입력하세요 : ");
			String sfile = std.next(); //문자열로 입력된 파일명 저장.
			//읽어들일 파일명으로 객체 생성
			FileInputStream fis = new FileInputStream(sfile);
			// 한 바이트씩 읽기
			int i;
			while((i = fis.read()) != -1) { //데이터를 모두 읽으면 -1을 반환시켜 프로그램을 끝냄
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("\n"+ sfile + "파일로 부터 바이트를 읽어 화면에 출력되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다.");
		} catch (IOException e) {
			System.out.println("읽어 들일 파일이 없습니다.");
		}
	}

}
