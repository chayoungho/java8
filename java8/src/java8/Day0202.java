package java8;

import java.util.Scanner;

public class Day0202 {
	public static void main(String[] args) {
		//��ĳ�ʸ� �ۼ��ϼ���.
		Scanner sc = new Scanner(System.in);
		//int�� ���� number1�� number2�� �����ϼ���.
		int number1;
		int number2;
		//ȭ�鿡 number1�� number2�� ���� �Է��ϵ��� �ȳ������� ����� �ּ���.
		System.out.println("number1�� number2�� ���� ���ʴ�� �־��ּ���.");
		System.out.println("�����̳� ����Ű�� ���� ������ �ּ���");
		//�ۼ��� ��ĳ�ʷ� number1�� number2�� ���� �Է��ϼ��� (nextInt() ����ؾ� ��)
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		//number1�� number2�� �հ踦 ȭ�鿡 ����� �ּ���
		System.out.print("�� ���� �հ�� ");
		System.out.print(number1 + number2);
		System.out.println("�Դϴ�.");
		//number1���� 10�� �����ϰ� number2���� 20�� �����ؼ� ������� 30���� ��µǾ�� �մϴ�.
		
		//��ĳ�ʸ� �ݾ��ּ���.
		sc.close();
		
		
		
		
		
		
	}
}
