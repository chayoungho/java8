package Day20;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void rnu() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}
