package programmers;

public class Exam002 {
	public static void main(String[] args) {
		String[]s= {"AB","z","aBz"};
		int[]n= {1,1,4};
		String[]result=new String[s.length];
		Solution002 sol=new Solution002();
		for(int i=0;i<s.length;i++) {
			result[i] =sol.solution(s[i],n[i]);
		}
		for(int i =0;i<s.length;i++) {
			System.out.println(s[i]+":"+n[i]+"->"+result[i]);
		}
	}
}
