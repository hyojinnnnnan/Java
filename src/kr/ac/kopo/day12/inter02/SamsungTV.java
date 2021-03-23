package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV{
	
	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle; //현 상태가 음소거인지 아닌지 확인하기 위해
	private int currentVolumeSize;
	
	public SamsungTV() {
		super(); //Object 클래스
		System.out.println("=====Samsung TV=====");
		modelName="Samsung";
		power=false;
		volumeSize=10;
		channelNo=3;
		muteToggle=false;
	}
	
	//The type SamsungTV must implement the inherited abstract method TV.soundDown()
	//TV 인터페이스의 추상 메소드를 오버라이딩 (OR SamsungTV 자체를 추상 클래스로 만들거나)
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("[Samsung TV]전원을 켭니다.");
		info();
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("[Samsung TV]전원을 끕니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("[Samsung TV]채널을 올립니다.");
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("[Samsung TV]채널을 내립니다.");
		channelNo--;
		info();
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("[Samsung TV]볼륨을 올립니다.");
		if (volumeSize<TV.MAX_VOLUME_SIZE) {
			volumeSize++;
		}
		if(muteToggle==true) {
			volumeSize=currentVolumeSize;
			muteToggle=false;
		}
		info();
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("[Samsung TV]볼륨을 내립니다.");
		if (volumeSize>TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		info();
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		if(muteToggle==false) { //음소거 상태가 아닐 때
			System.out.println("[Samsung TV]음소거 합니다.");
			currentVolumeSize=volumeSize;
			volumeSize=TV.MIN_VOLUME_SIZE;
		}else { //음소거 상태일 때
			System.out.println("[Samsung TV]음소거를 해제합니다.");
			volumeSize=currentVolumeSize;
		}
		muteToggle = !muteToggle; //음소거던 아니던 mute()를 수행하면 현 상태에서 반대로 바꿔야 하기 때문에
		info();
	} 
	
	//SamsungTV 전용 메소드
	private void info() {
		//삼성티비 내부에서만 필요한 메소드이기 때문에 public이 아닌 private으로 선언
		System.out.println("채널번호 : "+channelNo+", 음량 : "+volumeSize);
		System.out.println("---------------------");
	}
	

}
