package java8;

import java.util.Scanner;

public class Day0606 {

	public static void main(String[] args) {
		/*
		 * �� ���� ������� �Է¹޾Ƽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
		int num = sc.nextInt();
			
		for(int i=1; i<10; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		sc.close();
		}
	}

