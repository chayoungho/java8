package java8;

import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		/* HelloWorld 0~HelloWorld9���� 10�� ���*/
		for (int i=0;i<10;i++){
			System.out.println("HelloWorld"+i);
		}
		/*�� ������� ������Ű��*/
		for (int i=9;i>=0;i--) {
			System.out.println("HelloWorld"+i);
		}
		
		/*@�� 5���� 7�� ����ϼ���.*/
		for (int i=1;i<=7;i++) {
			System.out.println("@@@@@");
		}
			System.out.println();
		/*���� ��¹��� ��ø for������ �����ϼ���.*/
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
		/*���ڿ��� �Է¹޾Ƽ� for������ ����ϱ�*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���.:");
		System.out.println("�Է� >");
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	
	}
}
