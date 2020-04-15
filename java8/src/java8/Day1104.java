package java8;

public class Day1104 {

	public static void main(String[] args) {
		int[][] arr=new int[5][7];
			for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ "\t" );
			
			}
			System.out.println();
			}
			int cnt= 1;
			for (int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=cnt;
					cnt++;
				}
			}
			for(int i =0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+ "\t" );
				
				}
			System.out.println();
			
			
	}
	
	
	}
}
