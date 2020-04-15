package java8;

import java.util.Scanner;

public class Day1109 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		char grade;
		do {
			if(a<0||a>100) {
			System.out.println("입력 범위를 초과하였습니다");	
			}
			System.out.println("출석 점수를 입력해주세요:");
		a=sc.nextInt();
		}while(a<0 ||a>100);
		do {
			if(b<0||b>100) {
			System.out.println("입력 범위를 초과하였습니다");	
			}
			System.out.println("과제 점수를 입력해주세요:");
		b=sc.nextInt();
		}while(b<0 ||b>100);
		do {
			if(c<0||c>100) {
			System.out.println("입력 범위를 초과하였습니다");	
			}
			System.out.println("중간고사 점수를 입력해주세요:");
		c=sc.nextInt();
		}while(c<0 ||c>100);
		do {
			if(d<0||d>100) {
			System.out.println("입력 범위를 초과하였습니다");	
			}
			System.out.println("기말고사 점수를 입력해주세요:");
		d=sc.nextInt();
		}while(d<0 ||d>100);
		
		int score =(int)(a/100.0*20+b/100.0*20+c/100.0*30d/100.0*30);
		System.out.println("총점은"+score+"입니다.");
		if(score>=90) {
			grade ='A';
	}else if(score >= 80) {
		grade= 'B';
	}else if(score >=70) {
		grade='c';
		
	}else if(score >=60) {
		grade='d';
	}
		
		
	}

}

//		4> 100점 100점 100점 100점
//		100%중에 20 20 30 30
//		입력한 점수를 a b c d f 중에 맞는 학점에 대입	
//		a학점 b학점 c학점 d학점 구한담에 나머지를 f로