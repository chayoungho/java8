package java8;

import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		/* HelloWorld 0~HelloWorld9까지 10줄 출력*/
		for (int i=0;i<10;i++){
			System.out.println("HelloWorld"+i);
		}
		/*위 결과물을 반전시키기*/
		for (int i=9;i>=0;i--) {
			System.out.println("HelloWorld"+i);
		}
		
		/*@를 5개씩 7줄 출력하세요.*/
		for (int i=1;i<=7;i++) {
			System.out.println("@@@@@");
		}
			System.out.println();
		/*위의 출력물을 중첩 for문으로 변경하세요.*/
		for (int i=0;i<7;i++) {
			for(int j=0; j<5;j++ ) {
		System.out.print("@");
			
		}
		System.out.println();
	}
		for(int i=0;i<7;i++) {
			for(int j=0; j<=5;j++) {
				if(j%2==0) {
					System.out.print("@");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		/*문자열을 입력받아서 for문으로 출력하기*/
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.:");
		System.out.println("입력 >");
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	
	}
}
