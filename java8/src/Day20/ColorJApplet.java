package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class ColorJApplet extends JPanel{
	public void init() {
		setBackground(Color.orange);
		//��� 1:�гλ��
		//Panel p1=new Panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	
	
	}
	public void paint(Graphics g) {
//		���2: PAINT �żҵ忡�� FILLRECT ���
//		G.SETCOLOR(COLOR.ORANGE);
//		G.FILLRECT(0, 0, GETWIDTH, GETHEIGHT);
//		
		Color myColor =new Color(0,0,0);
		g.setColor(myColor);
		g.drawString("������ �۾��� �׸���.", 40, 100);
	}
}
