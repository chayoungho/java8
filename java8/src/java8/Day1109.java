package java8;

import java.util.Scanner;

public class Day1109 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		char grade;
		do {
			if(a<0||a>100) {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");	
			}
			System.out.println("�⼮ ������ �Է����ּ���:");
		a=sc.nextInt();
		}while(a<0 ||a>100);
		do {
			if(b<0||b>100) {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");	
			}
			System.out.println("���� ������ �Է����ּ���:");
		b=sc.nextInt();
		}while(b<0 ||b>100);
		do {
			if(c<0||c>100) {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");	
			}
			System.out.println("�߰���� ������ �Է����ּ���:");
		c=sc.nextInt();
		}while(c<0 ||c>100);
		do {
			if(d<0||d>100) {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");	
			}
			System.out.println("�⸻��� ������ �Է����ּ���:");
		d=sc.nextInt();
		}while(d<0 ||d>100);
		
		int score =(int)(a/100.0*20+b/100.0*20+c/100.0*30d/100.0*30);
		System.out.println("������"+score+"�Դϴ�.");
		if(score>=90) {
			grade ='A';
	}else if(score >= 80) {
		grade= 'B';
	}else if(score >=70) {
		grade='c';
		
	}else if(score >=60) {
		grade='d';
	}
		
		
	}

}

//		4> 100�� 100�� 100�� 100��
//		100%�߿� 20 20 30 30
//		�Է��� ������ a b c d f �߿� �´� ������ ����	
//		a���� b���� c���� d���� ���Ѵ㿡 �������� f��