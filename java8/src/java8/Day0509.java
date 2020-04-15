package java8;

import java.util.Scanner;

public class Day0509 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("안녕하세요.커피집입니다.");
		System.out.println("음료를 주문해 주세요.");
		System.out.println("A.아메리카노,C.카페모카, L.카페라뗴, M.카페모카");
		System.out.println("입력 >");
		String menu = sc.next();
		
		switch(menu) {
			case "a":
			case"A":
					System.out.println("아메리카노");
			break;
			case "c":
			case "C":
				System.out.println("카푸치노");
			break;
			case"l":
			case"L":
				System.out.println("카페라뗴");
			break;
			case"m":
			case"M":
				System.out.println("카페모카");
				break;
				
		}
		 
		sc.close();
		
		
	}

}
