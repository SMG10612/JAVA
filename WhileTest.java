/*
 * 2023년 03월 28일
 * 송민규
 * 반복문(while) 1~10까지의 합 구하기
 */

package chapter05;

public class WhileTest {

	public static void main(String[] args) {
		/*
		int sum=0,cnt=1;
		while(cnt<=10) {
			sum = sum + cnt;
			cnt = cnt + 1;
		}
		System.out.println("1부터10까지의 합은 : "+sum);
		*/
		
		/*
		int sum=0;
		for(int cnt=1; cnt<=10; cnt++) {
			sum=sum+cnt;
		}
		System.out.println("1부터10까지의 합은 : "+sum);
		*/
		
		int sum=0,cnt=1;
		do {
			sum = sum+cnt;
			cnt = cnt+1;
		} while(cnt<=10);
		
		System.out.println("1부터10까지의 합은 : "+sum);
	}

}
