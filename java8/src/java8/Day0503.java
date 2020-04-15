package java8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 영어 점수를 입력해 주세요(0~100):");
		int score = sc.nextInt();
		String pass = "";
		
		if(score >= 90) {
			pass = "A학점";
		}else if( score >= 80 ) {
			pass = "B학점";}
		else if( score >=70) {
				pass="C학점";}
	else if( score >=60) {
			pass="D학점"; }
	else {
			pass="F학점";
	}
	
	
	
		System.out.println("시헙성적은"+pass+"입니다.");
													
		
		sc.close();
	}

}
		
		
		
		
		
		
		
		



