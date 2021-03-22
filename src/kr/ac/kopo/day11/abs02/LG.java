package kr.ac.kopo.day11.abs02;

public class LG extends Printer{
	
	LG(){
		setProductName("LG");
	}
	
	@Override
	public void print() {
		System.out.println("LG 프린터에서 출력 중...");
	}
	
}
