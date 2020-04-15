package programmers;

import java.util.Arrays;

public class Solution001 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer =new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			int[] temp=Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.parallelSort(temp);
			answer[i]=temp[commands[i][2]-1];
		}
		String str="Hello";
		char[] chArr=str.toCharArray();
		chArr=new char[] {'H','e','l','l','o'};
		
		return answer;
	}
}
