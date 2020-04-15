package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class PolygonJAppletEx {
   public static void main(String[] args) {
      JFrame f = new JFrame("폴리곤 그리기");
      PolygonJApplet p= new PolygonJApplet();
      
      f.setBackground(Color.YELLOW);
      f.setSize(500, 500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(p);
      f.setResizable(false);
      f.setVisible(true);
      
   }
}