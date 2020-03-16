package java8;

import java.util.Scanner;

public class ScanEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키보드 입력 대기중");
		System.out.println(sc.hasNext());
		sc.close();
	}

}

/*
 	컴퓨터가 한 줄의 끝으로 인식하는 것은 세미콜론(;)입니다.
 	사람이 한 줄의 끝으로 인식하는 것을 줄바꿈으로 사용하듯이 
 	컴퓨터는 세미콜론을 사용합니다.
 	
 	오늘부터 자바를 공부합니다.
 	첫 날부터 수업을 하니까 힘듭니다.
 	
 	컴퓨터는 엔터와 공백은 동일하게 취급합니다. 그리고 여러개의 공백도
 	한 개의 공백으로 취급합니다.
 	
 	오늘부터		자바를
 	공부합니다.;
 	 첫 날부터
 */


