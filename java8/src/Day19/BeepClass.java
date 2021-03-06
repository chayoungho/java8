package Day19;

import java.awt.Toolkit;

public class BeepClass {
	public static void main(String[] args) throws InterruptedException {
		Toolkit tk= Toolkit.getDefaultToolkit();
		System.out.println("현재 스레드명:"+Thread.currentThread());
		
		for(int i=0;i<5;i++) {
		System.out.println("경고");
			try {
			Thread.sleep(500);
		}catch (InterruptedException e) {}
		}
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t1 스레드명"+Thread.currentThread().getName());
				for(int i=0;i<5;i++) {
					tk.beep();
					try {
					Thread.sleep(500);
				}catch (InterruptedException e) {}
				}
			}
		});
		t1 = new Thread(()-> {//람다식
			
				for(int i=0;i<5;i++) {
					System.out.println("t1 스레드명"+Thread.currentThread().getName());
					tk.beep();
					try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
				}
			}
		});
		t1.start();//스레드 실행 메소드

}}
