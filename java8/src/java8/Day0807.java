package java8;

import java.util.Scanner;

public class Day0807 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("a,b�� ���� ���ʴ�� �Է��ϼ���:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(!(a>-10_000_000 && a <= 100_000_000)) {
			
		} else {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		if(!(b>=10_000_000 && b<=10_000_000)) {
			System.out.println("b���� �Է� ������ �ʰ��Ͽ����ϴ�.");
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
		System.out.println("a����b������ ��:"+sum);
	}

}
