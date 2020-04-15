package Day22;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Puzzler extends JPanel {
	JLabel[] lables;
	Point[] points;
	Block[] blocks;
	protected int x;

	public static void main(String[] args) {
		JFrame f = new JFrame("¼ýÀÚÆÛÁñ");
		Puzzler p = new Puzzler();
		int x;
		p.setLayout(null);
		p.makeGame();


		f.add(p);
		f.setSize(266, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void addKeyListener(KeyListener[] keyListeners) {

	}

	void makeGame() {
		lables = new JLabel[25];
		points = new Point[25];
		blocks = new Block[25];

		for (int i = 0; i < blocks.length; i++) {
			lables[i] = new JLabel(i + 1 + "", JLabel.CENTER);
			lables[i].setSize(50, 50);
			lables[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));
			points[i] = new Point(i % 5 * 50, i / 5 * 50);
			lables[i].setLocation(points[i]);
			blocks[i] = new Block(lables[i], points[i]);
			this.add(lables[i]);

		}
		this.remove(lables[blocks.length - 1]);
		int x = blocks.length;

	}

	KeyListener getKeyListener() {
		KeyListener listner = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT && x % 5 != 0) {
					x++;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT && x % 5 != 1) {
					x--;
				} else if (e.getKeyCode() == KeyEvent.VK_UP && x <= 20) {
					x += 5;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN && x >= 6) {
					x -= 5;
				}
				System.out.println();
			}
		};
		return listner;

	}

	void moveGame(int x ,int KeyCode) {
		switch(KeyCode) {
		case KeyEvent.VK_LEFT;
		
		break;
		case KeyEvent.VK_RIGHT;
			JLabel lable=blocks[x-1].getLable();
			blocks[x].setLable(lable);
			break;
		
		case KeyEvent.VK_UP;

		break;
		case KeyEvent.VK_DOWN;

		break;
		}
		
	}

	JLabel[] getLables() {
		return lables;
	}

	public void setLables(JLabel[] lables) {
		this.lables = lables;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	class Block {
		public Block(JLabel jLabel, Point point2) {
		}

		private JLabel lable;
		private Point point;

	}
}
