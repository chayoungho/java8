package java8;

import java.util.Scanner;

public class Day1013 {

	public static void main(String[] args) {
		System.out.println("5개의 정수를 입력받아 최대값을 구하는 프로그램");
		Scanner sc=new Scanner(System.in);
		int[] arr =new int[5];
		for(int i=0;i<5;i++) {
			System.out.print(i+1+"번째 정수를 입력하세요:");
			arr[i] =sc.nextInt();
			
		}
		int max = Integer.MIN_VALUE; 
		for(int num:arr) {
			if(max <num) {
				max =num;
			}
		}
		System.out.println("최대값:"+max);
	sc.close();
	}

}
