package java8;

public class Day0206 {

	public static void main(String[] args) {
		char ch1 = 'a'; //문자 1개를 입력하는 char형은 작은 따옴표로 감싸야 합니다.
//		char ch2 = 'ab';	//char형은 2개 이상의 문자를 입력할 수 있습니다.
		char ch3 = '\n';	//escape문자는 컴퓨터가 1개의 문자로 인식합니다.
		char ch4 = 'b';		//char형의 문자들은 고유의 넘버를 가집니다.
		System.out.println(ch1);
		System.out.println(ch4);
		int result1 = ch1; //char형은 2바이트 int형은 4바이트 ch1은 int형으로 자동형변환
		System.out.println(result1);	//소문자 'a'는 97
		int result2 = ch4;
		System.out.println(result2);	//소문자 'b'는 98
		int result3 = 'z';
		System.out.println(result3);
		int result4 = '1';
		System.out.println(result4);
		int result5 = '9';
		System.out.println(result5);
		int result6 = '0';
		System.out.println(result6);
		int result7 = '가';
		System.out.println(result7);	//한글도 고유의 번호가 있다.
		char result8 = 97;	//char형은 숫자도 입력할 수 있다.
		System.out.println(result8);	//char형의 숫자를 대입하면 그 숫자에 맞는 문자가 출력된다.
		int result9 = 'A';
		System.out.println(result9);    //대문자 'A'는 65
										//대문자에 32를 더하면 소문자가 된다.
		char result10 = 'A' +32;
		System.out.println(result10);	
		
				
	}

}
