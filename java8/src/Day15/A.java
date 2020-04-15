package Day15;

public class A {
	A(){System.out.println("A 객체가 생성됨");}

	
	//인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		//static int field2;
		void method1() {}
		//static void method(){}
	}
	//정적 멤버 클래스 
	static class C{
		
	}
	// 인스턴스 필드
	B outerfield1 =new B(); //(o)
	C outerfield2= new C(); //(o)
	
	// 인스턴스 메소드
	void method1() {
		B var1 =new B();
		C var2 =new C();
	}
	//static B field3 =new B();//(x) A객체없음
	static C outerfield4=new C();
	//정적 메소드
	
	static void mathod2() {
		//B var1= new B(); //(x)A객체없음
		C var2=new C(); // (o)정적은가능
	}
	}
