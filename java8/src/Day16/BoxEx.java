package Day16;

public class BoxEx {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		Box box = new Box();
		box.set(name);	//String ->Object �ڵ�����ȯ
		String name2 =(String)box.get(); //Object ->String ��������ȯ
		System.out.println(name2);
		
		Apple apple =new Apple();
		System.out.println(apple.hashCode());
		box.set(apple); //Apple-> Object �ڵ�����ȯ
		Apple apple2 =(Apple)box.get();	//Object -> Appple ��������ȯ
		System.out.println(apple2.hashCode());
	
		Box2<String> box2 =new Box2<>();
		box2.set(name);
		name2 = box2.get();
		System.out.println(name2);
		
	//	box2.set(apple); //box2�� ���׸����� String�� ����ϵ��� �����Ͽ����ϴ�.
		Box2<Apple> box3=new Box2<Apple>();
		box3.set(apple);
		apple2=box3.get();
//		box3.set(name);//box3�� Apple�� ����� �����մϴ� .String�� ����� �Ұ����մϴ�
	}
}