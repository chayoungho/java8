package java8;

import java.util.Scanner;

public class Day1108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("두 개의 정수 값을 입력하여 곱 구하기:");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int res = num1*num2;
		System.out.println(num1+"x"+num2+"="+res);
		if(res>500) {
			break;
		}
		}
		System.out.println("결과값이 500을 초과하여 프로그램을 종료합니다.");
	}

}
