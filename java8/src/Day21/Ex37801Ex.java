package Day21;

import java.awt.Color;

import javax.swing.JFrame;

import Day20.PieChart;

public class Ex37801Ex {

	public static void main(String[] args) {
		JFrame f=new JFrame("파이 차트");
		Ex37801 p =new Ex37801();

	f.add(p);
	f.setSize(500,500);
	f.setBackground(Color.LIGHT_GRAY);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setResizable(false);
	f.setVisible(true);
	
	}

}
