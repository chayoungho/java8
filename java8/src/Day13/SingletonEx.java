package Day13;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton s1;
//		s1 = new Singleton(); //������ ȣ���� �Ұ����մϴ�.
		s1 =Singleton.getInstance(); //������ ������ ��ü�� ȣ���մϴ�.
	
		Singleton s2 =Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
		
		
	}

}
