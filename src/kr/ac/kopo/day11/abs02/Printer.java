package kr.ac.kopo.day11.abs02;

public abstract class Printer { //하나 이상의 추상 메소드를 가진 클래스는 반드시 추상 클래스여야 한다
	
	private String productName;
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void startPrinter() {
		System.out.println("==="+getProductName()+" 프린터 동작시작===");
	}

	public abstract void print();
	//기존의 상속방식은 강제성을 부여할 수 없지만
	//추상화를 통해서는 해당 추상 메소드를 반드시 오버라이드하도록 강제성을 부여할 수 있다 - 표준화

}