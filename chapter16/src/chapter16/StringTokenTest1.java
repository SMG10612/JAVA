package chapter16;

import java.util.StringTokenizer;

public class StringTokenTest1 {

	public static void main(String[] args) {
		String s1 = "name song gender M age 22";
		String s2 = "name,song,gender,M,age,22";
		String s3 = "name/song/gender/M/age/22";
		
		System.out.println(":: 빈칸을 기준으로 분리 ::");
		StringTokenizer st1 = new StringTokenizer(s1);
		while(st1.hasMoreTokens()) { //토큰이 있으면 true, 없으면 false를 반환
			String first = st1.nextToken(); //다음 토큰을 기준으로 문자열을 반환
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: 쉼표를 기준으로 분리 ::");
		StringTokenizer st2 = new StringTokenizer(s2,","); //분리자 => ,
		while(st2.hasMoreTokens()) {
			String first = st2.nextToken();
			String second = st2.nextToken();
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: 슬러쉬를 기준으로 분리 ::");
		StringTokenizer st3 = new StringTokenizer(s3,"/"); //분리자 => /
		while(st3.hasMoreTokens()) {
			String first = st3.nextToken();
			String second = st3.nextToken();
			System.out.println(first + "\t" + second);
		}
	}

}
