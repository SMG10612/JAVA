/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴소부 202095047 송민규
 * 설명 : 바이트 단위로 파일에 저장.(파일 생성)
 */

package ch13_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutoutStreamTest2 {

	public static void main(String[] args) throws IOException {
		Scanner std = new Scanner(System.in);
		
		
		//파일명으로 객체 생성
		OutputStream fos = new FileOutputStream("c.txt");
		//OutputStream :  바이트 스트림의 입출력을 위한 추상 클래스
		//FileOutputStream : 파일에 바이트 스트림의 입출력 기능 제공
		
		String str = "자바 프로그래밍 \n문자 스트림과 바이트 스트림 \n";
		byte[]bt = str.getBytes(); //문자열을 바이트로 변환
		
		fos.write(bt); //파일에 쓰기(저장).
		System.out.println("파일을 바이트 파일을 생성하였습니다.");
		fos.close();
	}
}
