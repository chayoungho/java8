package Day15;

public class Audio implements RemoteControl{
	int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolum(int volume) {
		if(volume >MAX_VOLUME) {
			this.volume=MAX_VOLUME; 
		}else if(volume<MIN_VOLUME){
			this.volume=MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		this.volume=volume;
		System.out.println("������ "+this.volume +"���� �����մϴ�");
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio�� ���Ұ� ���·� �����մϴ�.");
		}
		else {
			System.out.println("Audio�� ���Ұ� ���¸� �����մϴ�.");
		}
	}
	
}
