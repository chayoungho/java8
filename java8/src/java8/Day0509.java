package java8;

import java.util.Scanner;

public class Day0509 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�ȳ��ϼ���.Ŀ�����Դϴ�.");
		System.out.println("���Ḧ �ֹ��� �ּ���.");
		System.out.println("A.�Ƹ޸�ī��,C.ī���ī, L.ī����, M.ī���ī");
		System.out.println("�Է� >");
		String menu = sc.next();
		
		switch(menu) {
			case "a":
			case"A":
					System.out.println("�Ƹ޸�ī��");
			break;
			case "c":
			case "C":
				System.out.println("īǪġ��");
			break;
			case"l":
			case"L":
				System.out.println("ī����");
			break;
			case"m":
			case"M":
				System.out.println("ī���ī");
				break;
				
		}
		 
		sc.close();
		
		
	}

}
