package ch13_2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataOutoutStreamTest1 {

	public static void main(String[] args) throws IOException {
		Scanner std = new Scanner(System.in);
		System.out.print("출력할 파일명을 입력하세요 : ");
		String s = std.next();
		
		FileOutputStream fos = new FileOutputStream(s);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('김');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MAX_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		
		fos.close();
		System.out.println(s+"파일이 생성되었습니다.");
	}

}
