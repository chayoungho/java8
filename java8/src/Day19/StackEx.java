package Day19;



public class StackEx {
public static void main(String[] args) {
	Stack<String> ss=new Stack<String>();//String Ÿ���� Stack ����
	ss.push("Apple");
	ss.push("Banana");
	ss.push("Orange");
			
	System.out.println(ss.pop());
	System.out.println(ss.pop());
	System.out.println(ss.pop());
	
	Stack<Integer>is= new Stack<Integer>();//Integer Ÿ���� Stack����
	is.push(3);
	is.push(7);
	is.push(9);
	System.out.println(ss.pop());
	System.out.println(ss.pop());
	System.out.println(ss.pop());

}
}
public class Stack<T> {
	int positon;
	object[] stck;
	public Stack() {
		positon=0;
		stck =new object [20];
	}
	//���ÿ� ��� ����
	public void push(T item) {
		if(positon==20)
			return;
		stck[positon]=item;
		positon++;
	}
	//���� ��� ������
	public T pop {
		if (positon==0)
			return null;
		positon--;
		return (T)stck[positon];
	}
}
