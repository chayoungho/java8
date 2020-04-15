package java8;

import java.util.Scanner;

public class Day0901 {

	public static void main(String[] args) {
		/*
		 * 1~100 �߿� �����ϰ� ������ �����Ѵ�. �Է��� ���� ���亸�� ũ��"up"* �Է��� ���� ���亸�� ������ "down" �ִ� ȸ����
		 * 10ȸ�� �����մϴ�. ������ ��Ҹ� ���� ������ ����մϴ�.
		 */
		int cnt = 0;
		int number = (int) (Math.random() * 100) + 1;
		int inputnum = 0;
		Scanner sc = new Scanner(System.in);

		long startTime = System.currentTimeMillis();
		while (true) {
			do {
				if (inputnum != 0) {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
				System.out.println("���ڸ� �Է��� �ּ���(1~100):");
				inputnum = sc.nextInt();
			} while (inputnum < 1 || inputnum > 100);
			cnt++;
			if (number == inputnum) {
				System.out.println("�����Դϴ�." + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else if (number > inputnum) {
				System.out.println("up" + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else {
				System.out.println("down" + cnt + "ȸ �Է��Ͽ����ϴ�.");
			}
			if (cnt == 10) {
				System.out.println("���������� 0���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
		}
		
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000;
		double score = (180 - playTime) / 1.8;
		System.out.println("����������:" + score + "�� �Դϴ�.������ �����մϴ�.");
		
		sc.close();
	}

}
