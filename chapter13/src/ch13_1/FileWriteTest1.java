/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴소부 202095047 송민규
 * 설명 : 문자를 파일에 쓰기.(저장)
 */
package ch13_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest1 {

	public static void main(String[] args) throws IOException {
		Scanner std = new Scanner(System.in);
		
		System.out.print("저장 파일명을 입력하세요 : ");
		
		String sfile = std.next();
		
		//파일에 저장할 문자열 생성
		String source = "그쪽도 홍박사님을 아세요?\n" + "홍홍홍\n" + "홍박사님을 아세요??";
		
		//파일명으로 객체 생성
		FileWriter fw = new FileWriter(sfile);
		
		//문자열을 파일에 출력
		fw.write(source); //객체를 통해 a.txt파일에 source에 있는 내용을 저장(출력) 하라.
		
		//출력 스트림 닫기
		fw.close();
		
		System.out.println("파일이 생성되었습니다.");
	}

}
