package java8;

import java.util.Scanner;

public class Day1015 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
final		int kimbab=2000;
final		int dduk=2000;
final		int oden=2000;
final		int sundae=2000;
final		int a,b,c,d;
		System.out.println("김밥1줄 2000원,떡볶이1인분2000원,오뎅1개500원,순대 1인분 2000원 ");
		System.out.println("김밥 떡볶이 오뎅 순대 순으로 입력해주세요.");
		System.out.println("김밥은 몇 줄 구매하시겠습니까?:");
		System.out.println();
		a= sc.nextInt();
		System.out.println("떡볶이는 몇 인분 구매하시겠습니까?:");
		b=sc.nextInt();
		System.out.println("오뎅은 몇 개 구매하시겠습닌까?:");
		c=sc.nextInt();
		System.out.println("순대는 몇 인분 구매하시겠습니까?:");
		d=sc.nextInt();
		System.out.println();
		System.out.println("김밥은 "+a+"줄 주문하셨습니다");
		System.out.println("김밥"+kimbab*a);
		System.out.println("떡볶이는 :"+b+"인분 주문하셨습니다");
		System.out.println("떡볶이는"+dduk*b+"인분 주문 하셨습니다");
		
		System.out.println("오뎅은 몇 개 구매하시겠습닌까?:");
		
		System.out.println("순대는 몇 인분 구매하시겠습니까?:");
		
		/*
		 * int g=0,d=0,o=0,s=0; int Max=(g+d)+(o+s); for(int i=0;i<4;i++) {
		 * 
		 * System.out.println("먹은 총합:"); sc.nextInt(Max); }
		 */
		
		
		
		
		
	}

}
