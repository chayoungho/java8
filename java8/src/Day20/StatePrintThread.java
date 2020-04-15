package Day20;

import java.time.chrono.ThaiBuddhistEra;

public class StatePrintThread extends Thread{
	private  Thread targetThread;
	
	public StatePrintThread(Thread targThread) {
		this.targetThread =targThread;
	}
	public void run(){
		while(true) { //������ ���¸� 0.5�ʿ� �� ���� ���
			Thread.State state= targetThread.getState();
			System.out.println("Ÿ�� ������ ����:"+state);
			if(state== Thread.State.NEW) {
				targetThread.start();
			}
			if(state== Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);	//0.5�ʰ� �Ͻ� ����
			}catch(Exception e){}
		}
	}
		
	}

