package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü
		Scanner sc =new Scanner(System.in);
				
		
		System.out.print("�����Դϱ�?(����:1 �����ƴ�:0 )-");
		//Ű����� ���� �Է�
		int Capital = sc.nextInt();
		boolean isCapital = Capital == 0 ? false : true;
		
		System.out.print("�α�(����:��)- ");
		//Ű����� ���� �Է�
		int citizens = sc.nextInt();
		System.out.print("������ ��(����:��)-");
		//Ű����� ���� �Է�
		int riches = sc.nextInt();		
		//�Ǵ� ��Ʈ�������� ����(�� ������)
		//1. �� ������ �����̰� �α��� 100�� �̻��̾�� �Ѵ�.(���� ������)
		//2. �� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̾�� �Ѵ�.(���� ������)
		boolean isMetro1 = isCapital && citizens >= 100;
		boolean isMetro2 = riches >= 50;
		
		boolean isMetro = isMetro1 || isMetro2;
		
		System.out.println("��Ʈ�������� ����:" + isMetro);
		
		
	}

}
