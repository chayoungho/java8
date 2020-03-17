package java8;

public class Day0308 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		System.out.println();
		
		
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		//a가 앞에 있으면 전위 or 전치 연산자;
		
		++a;
		System.out.println(a);
		++a;
		System.out.println(a);
		++a;
		System.out.println(a);  
		//a가 뒤에 있으면 후위 or 후치 연산자;
		
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println();
		
		System.out.println(a);
	}
}
