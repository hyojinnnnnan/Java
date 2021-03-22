package kr.ac.kopo.day11.abs02;

public class Samsung extends Printer{
	
	Samsung(){
		setProductName("삼성");
	}
	
	@Override
	public void print() {
		System.out.println("삼성 프린터에서 출력 중...");
	}

}
