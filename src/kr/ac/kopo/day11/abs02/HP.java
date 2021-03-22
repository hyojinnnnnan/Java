package kr.ac.kopo.day11.abs02;

public abstract class HP extends Printer {
//HP를 레이저와 잉크젯으로 구성하고 싶을 때
//추상화 클래스 Printer를 상속받은 HP 클래스도 추상화 클래스로 만든다
	HP(){
		setProductName("HP");
	}

}

class HPLaser extends HP{
	@Override
	public void print() {
		System.out.println("HP 레이저 프린터에서 출력 중...");
	}
}

class HPInkjet extends HP{
	@Override
	public void print() {
		System.out.println("HP 잉크젯 프린터에서 출력 중...");
	}
}