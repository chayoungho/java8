package java8;

import java.util.Scanner;

public class Day1110 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���:");
		Scanner sc=new Scanner(System.in);
		int price= sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int amount=sc.nextInt();
		int res1= price*amount;
		System.out.println("��ǰ �ܰ�:"+price+"��");
		System.out.println("��ǰ ����:"+amount+"��");
		
		int sale=0;
		if(res1 >=1_000_000) {
			price *=0.6;
			sale =40;
		}else if(res1>=500_000) {
			price*=0.7;
			sale =30;
				
			
		}
	
		System.out.println("������:"+sale+"%");
		System.out.println("���� �ݾ�:"+price*amount);
	}

}
