package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {

	public LGTV() {
		super(); //Object 클래스
		System.out.println("=======LG TV=======");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]전원을 끕니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]채널을 올립니다.");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]채널을 내립니다.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]볼륨을 올립니다.");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]볼륨을 내립니다.");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("[LG TV]음소거 합니다.");
	}

}
