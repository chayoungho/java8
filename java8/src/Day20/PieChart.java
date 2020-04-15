package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class PieChart extends JApplet{
	int[] input= {30,15,45,10};
	String[] title= {"콩","밀","쌀","옥수수"};
	Color[] color= {Color.red,Color.orange,Color.blue,Color.gray};
	
	public void init() {
		setBackground(Color.lightGray);
	}
	public void paint(Graphics g) {
		int startAngle=0;
		int pieSize;
		int subtot=0;
		
		for(int i=0;i<input.length;i++) {
			//파이를 그리는 부분
			
			
			
			
			//범례를 그리는 부분
		}
	}
}
