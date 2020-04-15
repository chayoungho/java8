package java8;

public class Day0801 {

	public static void main(String[] args) {
		/*1~100까지 출력*/
		System.out.println("1~100");
		for (int i=0;i<=100;i++) {
			System.out.println(i);
		}
		/*1~100 중에 3과 5의 공배수의 합은 		 * 얼마인가요?*/
		int sum=0;
		for (int i=1;i<=100;i++) {
			if((i%3==0) &&(i%5==0)){
				sum +=i;
			}
		} 
			System.out.println("3과 5의 공배수의합:"+sum);
		/*1~100중에 짝수는 더하고 홀수는 뺀 결과를 출력하세요.*/	
			int res=0;
			int res2=0;
			for (int i=1;i<=100;i++) {
				if(i %2==0) {
					res += i;
				}else {
					res2 +=i;
				}
			}
			System.out.println("짝수는 더하고 홀수는 뺀 결과:"+(res-res2));
	}
	
}
