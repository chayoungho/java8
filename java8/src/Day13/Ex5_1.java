package Day13;

import java.util.Scanner;

public class Ex5_1 {

	public static void main(String[] args) {
		System.out.println("����� ���ڿ��� �Է��ϼ���:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("�Է��� ���ڿ�:"+sb);
		
		//���ڿ� ������
		sb.reverse();
		System.out.println("������ ���ڿ�:"+sb);
		
		sc.close();
	}

}
