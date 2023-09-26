package ch13_2;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest1 {

	public static void main(String[] args) throws IOException {
		String source = "Have a good day. Have a nice day! have good? Jave fun?";
		char intxt[] = new char[source.length()];
		source.getChars(0,source.length(), intxt, 0);
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt);
		
		fw.close();
	}

}
