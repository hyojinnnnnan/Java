package kr.ac.kopo.day12.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		SamsungTV sam=new SamsungTV();
		sam.powerOn();
		sam.channelUp();
		sam.channelDown();
		sam.volumeUp();
		sam.volumeDown();
		sam.powerOff();
		
		System.out.println();
		
		//삼성티비가 고장나서 엘지티비를 구매했다
		LGTV lg=new LGTV();
		//삼성티비와 똑같은 메소드일 줄 알고 다음과 같이 썼다.
		//삼성티비 리모컨으로 엘지티비를 동작하고 싶은데..
		/*
		lg.powerOn(); 오류 -> lg.turnOn();
		lg.channelUp();
		lg.channelDown();
		lg.volumeUp(); 오류 -> lg.soundUp();
		lg.volumeDown(); 오류 -> lg.soundDown();
		lg.powerOff(); 오류 -> lg.turnOff();
		*/
		//엘지티비는 삼성티비의 메소드를 해석할 수 없다 
		//엘지는 엘지 나름대로, 삼성은 삼성 나름대로 메소드가 있다 보니 서로 제어가 불가능하다
		//그렇기 때문에 티비를 바꾸면 바꿀 수록 동작이 불가능한 리모컨이 늘어난다
		//최소 전원, 음량, 채널 등과 같은 공통된 기능은 어느 회사의 리모컨을 사용하던 작동이 되면 좋을 것 같은데... -> 표준을 만들자! : 인터페이스 (package kr.ac.kopo.day12.inter02)

	}

}
