package kr.ac.kopo.day12.inter01;

public class SamsungTV {
	
	private boolean power;
	private int channelNo;
	private int volumeSize;
	
	public SamsungTV() {
		System.out.println("Samsung TV를 동작합니다.");
		power=false;
		channelNo=3;
		volumeSize=6;
	}
	
	public void powerOn() {
		System.out.println("[Samsung TV]전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("[Samsung TV]전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("[Samsung TV]채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("[Samsung TV]채널을 내립니다.");
	}
	public void volumeUp() {
		System.out.println("[Samsung TV]볼륨을 올립니다.");
	}
	public void volumeDown() {
		System.out.println("[Samsung TV]볼륨을 내립니다.");
	}

}
