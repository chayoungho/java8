package Day14;

public class CellphoneEx {
	public static void main(String[] args) {
		DmbCellphone dcp = new DmbCellphone("갤럭시S20", "레드", 10);
		dcp.powerOn();					//부모의 메서드
		dcp.bell();						//부모의 메서드
		dcp.sendVoice("여보세요");		//부모의 메서드
		dcp.receiveVoice("택배입니다.");	//부모의 메서드
		dcp.sendVoice("집앞에 놓아 주세요.");//부모의 메서드
		dcp.receiveVoice("알겠습니다.");	//부모의 메서드
		dcp.hangUp();					//부모의 메서드
		dcp.turnOnDmb();				//자신의 메서드
		dcp.setChannel(100);			//자신의 메서드
		dcp.turnOffDmb();				//자신의 메서드
		dcp.powerOff();					//부모의 메서드
		
		Cellphone cp =new Cellphone();
		cp.powerOn();
	//	cp.turnOndmb();// 부모의 객체는 자식의 인스턴스 맴버를 호출할 수 없습니다.
		cp.powerOff();
	}
}
