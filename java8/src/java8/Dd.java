package java8;

import java.util.Scanner;

public class Dd {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int width, height;
		int area, perimeter;
		System.out.println("�ʺ� �Է��� �ּ���:");
		width = sc.nextInt();
		System.out.println("���̸� �Է��� �ּ���:");
		height = sc.nextInt();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("�簢���� ����:"+ area);
		System.out.println("�簢���� �ѷ�:"+perimeter);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
