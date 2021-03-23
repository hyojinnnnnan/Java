package kr.ac.kopo.day12.inter02;

public interface TV { //TV 표준안 
	
	//인터페이스는 상수와 추상메소드로만 구성
	
	//상수
	/*public static final*/ int MAX_VOLUME_SIZE=50;
	/*public static final*/ int MIN_VOLUME_SIZE=0;
	
	//추상메소드
	/*public abstract*/ void powerOn();
	/*public abstract*/ void powerOff();
	/*public abstract*/ void channelUp();
	/*public abstract*/ void channelDown();
	/*public abstract*/ void soundUp();
	/*public abstract*/ void soundDown();
	/*public abstract*/ void mute();
	
	default void copyright() {
		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
	}

}
