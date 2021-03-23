package kr.ac.kopo.day11.homework.version2;

public class Triangle extends Figure{
	
	Triangle(){
		super.setWidth();
		super.setHeight();
	}
	
	@Override
	public void calArea() {
		int w=super.getWidth();
		int h=super.getHeight();
		double a=(double)w*h*0.5;
		super.setArea(a);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("가로 %d, 세로 %d의 삼각형 면적은 %.2f입니다.", getWidth(), getHeight(), getArea());
	}


}
