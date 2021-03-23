package kr.ac.kopo.day11.homework.version2;

public class Rectangle extends Figure{
	
	Rectangle(){
		super.setWidth();
		super.setHeight();;
	}
	
	@Override
	public void calArea() {
		int w=super.getWidth();
		int h=super.getHeight();
		super.setArea(w*h);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.0f입니다.", getWidth(), getHeight(), getArea());
	}

}
