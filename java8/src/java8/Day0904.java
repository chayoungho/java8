package java8;

import java.util.Scanner;

public class Day0904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ");
		int subScore= 0;
		
		long startTime=System.currentTimeMillis();
		for(int i=0;i<10;i++) {
			int num1 =(int)(Math.random() *8) +2;
			int num2 =(int)(Math.random()*9)+1;
			System.out.println(num1+"x"+num2+"=");
			int answer = sc.nextInt();
			
			if(num1 * num2==answer) {
				System.out.println("�����Դϴ�");
			}else {
				subScore +=5;
				System.out.println("�����Դϴ�."+subScore+"5�� �����մϴ�");
			}			
		}
		long endTime =System.currentTimeMillis();
		long playTime =endTime -startTime / 1000;
		long score = 200- playTime-subScore;
		if(score >100) {
			score =100;
		}else if(score <0) {
			score= 0;
		}
		System.out.println("���� ������"+score+"�Դϴ�");
		sc.close();
	}

}
