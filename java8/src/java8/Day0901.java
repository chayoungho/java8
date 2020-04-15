package java8;

import java.util.Scanner;

public class Day0901 {

	public static void main(String[] args) {
		/*
		 * 1~100 중에 랜덤하게 정답을 설정한다. 입력한 값이 정답보다 크면"up"* 입력한 값이 정답보다 작으면 "down" 최대 회수는
		 * 10회로 설정합니다. 게임적 요소를 위해 점수를 출력합니다.
		 */
		int cnt = 0;
		int number = (int) (Math.random() * 100) + 1;
		int inputnum = 0;
		Scanner sc = new Scanner(System.in);

		long startTime = System.currentTimeMillis();
		while (true) {
			do {
				if (inputnum != 0) {
					System.out.println("잘못입력하셨습니다.");
				}
				System.out.println("숫자를 입력해 주세요(1~100):");
				inputnum = sc.nextInt();
			} while (inputnum < 1 || inputnum > 100);
			cnt++;
			if (number == inputnum) {
				System.out.println("정답입니다." + cnt + "회 입력하였습니다.");
			} else if (number > inputnum) {
				System.out.println("up" + cnt + "회 입력하였습니다.");
			} else {
				System.out.println("down" + cnt + "회 입력하였습니다.");
			}
			if (cnt == 10) {
				System.out.println("최종점수는 0점입니다. 게임을 종료합니다.");
				System.exit(0);
			}
		}
		
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000;
		double score = (180 - playTime) / 1.8;
		System.out.println("최종점수는:" + score + "점 입니다.게임을 종료합니다.");
		
		sc.close();
	}

}
