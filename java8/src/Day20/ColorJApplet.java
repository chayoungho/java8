package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class ColorJApplet extends JPanel{
	public void init() {
		setBackground(Color.orange);
		//방법 1:패널사용
		//Panel p1=new Panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	
	
	}
	public void paint(Graphics g) {
//		방법2: PAINT 매소드에서 FILLRECT 사용
//		G.SETCOLOR(COLOR.ORANGE);
//		G.FILLRECT(0, 0, GETWIDTH, GETHEIGHT);
//		
		Color myColor =new Color(0,0,0);
		g.setColor(myColor);
		g.drawString("검정색 글씨를 그린다.", 40, 100);
	}
}
