package Day22;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		super("���� ���̾ƿ�");
		// JFram�� JAplet�� �⺻ ���̾ƿ� �Ŵ����� BOrderLayout�̱�
		// ������,BorderLayout �Ŵ����� �������� �ʾƵ� �ȴ�.
		// �� ������Ʈ�� �����̳ʿ� �߰�
		add("North", new Button("North"));
		add(BorderLayout.EAST, new Button("EAST"));
		add(new Button("Center"), BorderLayout.CENTER);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("West"), BorderLayout.WEST);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutTest bit = new BorderLayoutTest();
		bit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
