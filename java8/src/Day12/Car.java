package Day12;

public class Car {

	// �ʵ�
	String company = "����ڵ���";
	String model = "���";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;

	// ������

	Car() {// �����ڸ� �������� ������ �⺻�����ڰ� �ڵ����� �ۼ��˴ϴ�.
		this("����ڵ���", "����", 300);
	}

	Car(String company, String color, int maxSpeed) {
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	Car(String color, int maxSpeed) {
		this.company = "����ڵ���";
		this.color = "����";
		this.maxSpeed = maxSpeed;
	}

	Car(int maxSpeed) {
		this("����ڵ���", "����", maxSpeed);
	}
	//�޼���
	void accel() {
		speed +=10;
		if(speed>maxSpeed) {
			speed=maxSpeed;
		}
		System.out.println("���� �ӵ� :"+speed);
	}
	void brake() {
		speed=0;
		System.out.println("���� �ӵ�:"+speed);
	}
}
