package Day13;

import java.util.Scanner;

public class Ex5_1 {

	public static void main(String[] args) {
		System.out.println("출력할 문자열을 입력하세요:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("입력한 문자열:"+sb);
		
		//문자열 리버싱
		sb.reverse();
		System.out.println("리버싱 문자열:"+sb);
		
		sc.close();
	}

}
