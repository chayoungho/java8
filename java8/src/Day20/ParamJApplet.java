package Day20;

import java.awt.Graphics;

import javax.swing.JApplet;

public class ParamJApplet extends JApplet{
	private static final long seriaIVersionUID =1L;  //Ŭ������ �����ѹ��� ����
	String title;									 //Ŭ������ ��ü�� ������ ���۽�						
													 //�۽źο��� ���� Ŭ�������� Ȯ���ϱ�
	public void init(String title) {				 //���Ͽ� ����մϴ�.
		this.title=title;							 //������� ������ �������� �����մϴ�.
		if(title==null)
			title="���޹��� �μ��� ����.";
	}
	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}
}
