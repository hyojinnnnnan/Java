package kr.ac.kopo.day12.inter02;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TV가 가리키는 객체가 삼성이던 엘지던 간에 정상적으로 동작함 -> 다형성(추상화,객체형변환, 인터페이스의 개념이 모두 사용됨)
		
		TV tv=new SamsungTV(); //객체 형변환
		tv.powerOn();
		tv.channelDown();
		tv.soundUp();
		tv.channelUp();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.mute();
		tv.powerOff();
		
		tv=new LGTV(); //객체 형변환
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.mute();
		tv.powerOff();

	}

}
