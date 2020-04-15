package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class FontAppletEx {

	public static void main(String[] args) {
		 JFrame f= new JFrame("폰트 설정 예제");
			FontJApplet p = new FontJApplet();
			p.init();
			
			
			f.setSize(600,500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(p);
			f.setResizable(false);
			f.setVisible(true);
		}
		
	}


