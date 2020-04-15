package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[]=new int[10];
		
		BufferedReader inbr=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 10개를 입력하세요!:");
		for(int x=0; x<r.length;x++) {
			r[x]=Integer.parseInt(inbr.readLine());
			
		}
		System.out.print("입력 데이터 값:");
		for(int x=0;x<r.length;x++) {
			System.out.print(r[x]+"..");
		}
		System.out.println();
		//오름차순 정렬 시작
		/*
		 * for(int i=0; i<r.length;i++) {//버블정렬 for(int j =0;j<r.length;j++) {
		 * if(r[i]<r[j]) { int temp=r[i]; r[i]=r[j]; r[j]=temp; } }
		 * 
		 * }
		 */
		Arrays.sort(r);//Arrays 클래스에 제공하는 정렬 메서드
		
		
		//오름차순 정렬 끝		
		System.out.print("오름차순 데이터 값 :");
		for(int x=0;x<r.length;x++) {
			System.out.print(r[x]+"..");
		}
		System.out.println();
		System.out.print("합계:");
		int sum=0;
		for(int x=0;x<r.length;x++) {
			sum=sum+r[x];
		}
		System.out.print(sum);
		System.out.println("평균:"+(sum/r.length));
	}

}
