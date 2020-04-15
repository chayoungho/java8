package Day19;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Ex02 {
	public int add(int a, int b) {
		return a + b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public void oper(IntBinaryOperator operator, int a, int b) {
		System.out.println("����/�ν��Ͻ� �޼ҵ� ����:" + operator.applyAsInt(a, b));
	}

	public void operS(Function<String, String> stringOperator, String a) {
		System.out.println("�Ű������� �޼ҵ� ����:" + stringOperator.apply(a));
	}
public static void main(String[] args) {
	Ex02 ex= new Ex02();
	
	ex.oper( (a, b)->Ex02.mul(a, b),1,1);
	
	ex.oper(Ex02::mul,1,1);
	
	ex.oper( (a, b)->ex.add(a, b),1,1);
	
	ex.oper(Ex02:: mul, 1,1);
	
	ex.operS(s-> s.toLowerCase(),"STRING");
	
	
}
}
