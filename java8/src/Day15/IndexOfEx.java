package Day15;

public class IndexOfEx {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		int index = str.indexOf("프로");
		System.out.println(index);
		index = str.indexOf("C언어");
		System.out.println(index);
		str = "자바자바자바 프로프로 그래밍이이입니다.";
		index = str.indexOf("바"); // 매개변수가 한 개일 경우에는 0번부터 검색
		System.out.println(index);
		index = str.indexOf("바", index + 1); // 첫번째 매개변수: 검색어,2번째 매개변수: 검색 시작 위치
		System.out.println(index);
		index = str.indexOf("바", index + 1);
		System.out.println(index);
		index = str.indexOf("바", index + 1);
		System.out.println(index);
		String str2=str.replace(" 프로프로 ","프로");
		System.out.println(str);
		System.out.println(str2);
		String str3=str.replace("자바", "java");
		System.out.println(str3);
		System.out.println();
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);
		
		
	}

}
