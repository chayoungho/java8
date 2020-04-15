package java8;

import java.util.Scanner;

public class Day1110 {

	public static void main(String[] args) {
		System.out.println("가격을 입력하세요:");
		Scanner sc=new Scanner(System.in);
		int price= sc.nextInt();
		System.out.println("수량을 입력하세요:");
		int amount=sc.nextInt();
		int res1= price*amount;
		System.out.println("상품 단가:"+price+"원");
		System.out.println("상품 수량:"+amount+"개");
		
		int sale=0;
		if(res1 >=1_000_000) {
			price *=0.6;
			sale =40;
		}else if(res1>=500_000) {
			price*=0.7;
			sale =30;
				
			
		}
	
		System.out.println("할인율:"+sale+"%");
		System.out.println("지불 금액:"+price*amount);
	}

}
