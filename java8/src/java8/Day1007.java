package java8;

public class Day1007 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[][] ary1 = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } }; // new int[4],[2];
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		System.out.println(ary1[1].length);
		System.out.println(ary1[2].length);
		System.out.println(ary1[3].length);
//		System.out.println(ary1[4].length);
		for (int i = 0; i < ary1.length; i++) {
			
	
			for(int j=0;j<ary1[i].length;j++) {
				System.out.println(ary1[i][j]);
			}
		}
		System.out.println();
		
		int[][] ary2 = {{10,20,30},{40},{50,60}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<ary2[i].length;j++) {
				System.out.println(ary2[i][j]);	//[][] 길이를 사용할떄 length를사용.
			}
		}
	
	}

}
