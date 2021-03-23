package kr.ac.kopo.day11.homework.version2;

public class Square extends Rectangle{
		
	@Override
	public void calArea() {
		int w=super.getWidth();
		setArea(w*w);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("가로 %d의 정사각형 면적은 %.0f입니다.", getWidth(), getArea());
	}


}
