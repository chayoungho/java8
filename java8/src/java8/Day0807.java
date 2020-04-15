package java8;

import java.util.Scanner;

public class Day0807 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("a,b의 값을 차례대로 입력하세요:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(!(a>-10_000_000 && a <= 100_000_000)) {
			
		} else {
			System.out.println("입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		if(!(b>=10_000_000 && b<=10_000_000)) {
			System.out.println("b값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		int min=0,max=0,sum=0;
		if(a>b) {
			max=a;
			min=b;
		}else if(a==b) {
			System.out.println(a);
			System.exit(0);
		}else {
			min =a;
			max =b;
		}
		
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
		System.out.println("a부터b까지의 합:"+sum);
	}

}
