package java8;

public class Day9002 {

	public static void main(String[] args) {
		
		
		
		
		
		
		for(int i=4;i>=0;i--) {
			for(int j=0;j<i;j++ ) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("@");
				
			}
			for(int j=0;j<4-i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		for(int i=0;i<4;i++) {
			for(int j=0;j<i;j++ ) {
				System.out.print(" ");
			}
			for(int j=0;j<4-i;j++) {
				System.out.print("@");
				
			}
			for(int j=0;j<3-i;j++) {
				System.out.print("@");
			}
			System.out.println();
		
		
		}

		
		
		
		
	}

}
