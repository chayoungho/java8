package java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Day0405 {

	public static void main(String[] args) throws Exception {
		int intnum;
		double dblnum;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수와 실수를 입력하세요:");
		intnum = Integer.parseInt(inbr.readLine());
		dblnum = Double.parseDouble(inbr.readLine());
		System.out.println("입력한 정수는 "+ intnum +"입니다." );
		System.out.println("입력한 실수는 "+dblnum+" 입니다.");
		
	
	}

}
