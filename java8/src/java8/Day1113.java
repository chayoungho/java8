package java8;

import java.util.Scanner;

public class Day1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		int com, user;
		while (true) {
			com = (int) (Math.random() * 3) + 1;

			do {
				System.out.println("가위,바위,보 중에 하나를 선택하세요.");
				System.out.println("가위:1,바위:2,보:3,종료4");
				System.out.println(">");
				user = sc.nextInt();
				if (user < 1 || user > 4) {
					System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
				} else if (user == 4) {
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}
			} while (user < 1 || user > 3);
			String userStr = user == 1 ? "가위" : user == 2 ? "바위" : "보";
			String comStr = com == 1 ? "가위" : com == 2 ? "바위" : "보";
			if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("유저승! 유저:" + userStr + ".컴퓨터:" + comStr);
			} else if (user == com) {
				System.out.println("비겼음! 유저:" + userStr + ",컴퓨터:" + comStr);
			} else {
				System.out.println("컴퓨터승! 유저:" + userStr + ",컴퓨터:" + comStr);
			}
	
		}
	
	}

}
