package java8;

import java.util.Scanner;

public class DAT {

	public static void main(String[] args) {
		int a,b;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("입력a:");
		a = sc.nextInt();
		System.out.println("입력b:");
		b = sc.nextInt();
		
		String stra = "a("+a+")";
		String strb = "b("+b+")";
		
		System.out.println("입력 :" +stra+"."+strb );
		
		String result = a >= b ? stra : strb;
		System.out.println("결과"+result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
