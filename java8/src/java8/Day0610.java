package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0610 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int intyear;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.println("윤년을 판별할 년도 입력! :");
		intyear = Integer.parseInt(inbr.readLine());
		
	  if ((intyear % 4 == 0&& intyear % 100 !=0) || (intyear % 400 ==0))	{
			System.out.println(intyear+"년은 윤년이다.");
			}else{
			System.out.println(intyear+"년은 윤년이 아니다.");
		}
		
	}

}
