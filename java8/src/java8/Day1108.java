package java8;

import java.util.Scanner;

public class Day1108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("�� ���� ���� ���� �Է��Ͽ� �� ���ϱ�:");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int res = num1*num2;
		System.out.println(num1+"x"+num2+"="+res);
		if(res>500) {
			break;
		}
		}
		System.out.println("������� 500�� �ʰ��Ͽ� ���α׷��� �����մϴ�.");
	}

}
