package Day15;

public class A {
	A(){System.out.println("A ��ü�� ������");}

	
	//�ν��Ͻ� ��� Ŭ����
	class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		//static int field2;
		void method1() {}
		//static void method(){}
	}
	//���� ��� Ŭ���� 
	static class C{
		
	}
	// �ν��Ͻ� �ʵ�
	B outerfield1 =new B(); //(o)
	C outerfield2= new C(); //(o)
	
	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 =new B();
		C var2 =new C();
	}
	//static B field3 =new B();//(x) A��ü����
	static C outerfield4=new C();
	//���� �޼ҵ�
	
	static void mathod2() {
		//B var1= new B(); //(x)A��ü����
		C var2=new C(); // (o)����������
	}
	}
