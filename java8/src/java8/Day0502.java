package java8;

import java.util.Scanner;

public class Day0502 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int inputNumber = 0;
	System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�.");
	System.out.println("���ڸ� �Է��� �ּ���.");
	inputNumber = sc.nextInt();
	
//  String result = inputNumber % 2 == 0 ? "¦��" : "Ȧ��"; //���׿����ڸ� ���
	String result = ""; //�������� 0���� �ʱ�ȭ�ϰ� ���ڿ��� ""���� �ʱ�ȭ�մϴ�.
	if(inputNumber % 2 == 0) { // if���� ����Ͽ� ������ true�� ��쿡 �����ϴ� �߰�ȣ ������ ǥ��
		result="¦��";
		System.out.println("¦������ �Ǻ����Դϴ�.");

	}
	if(inputNumber % 2 !=0) {
		result="Ȧ��";
		System.out.println("Ȧ������ �Ǻ����Դϴ�.");
	}
		
	System.out.println("�Է��Ͻ� ���ڴ� "+inputNumber+ "�̰�. �� ���ڴ�"+result+"�Դϴ�.");
	sc.close();
	
	
			
}
}
