package kr.ac.kopo.day11.homework.version2;

public class Circle extends Figure{
	
	double pi=3.141592;
	
	Circle(){
		super.setWidth();
	}
	
	@Override
	public void calArea() {
		int w=super.getWidth();
		super.setArea(w*w*pi);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("반지름 %d의 원 면적은 %.2f입니다.", getWidth(), getArea());
	}


}
