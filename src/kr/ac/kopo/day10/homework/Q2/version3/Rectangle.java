package kr.ac.kopo.day10.homework.Q2.version3;

public class Rectangle extends Figure{
	
	Rectangle(){
		super.setWidth();
		super.setHeight();
		super.setFigureName("Rectangle");
	}
	
	@Override
	public void calArea() {
		int w=super.getWidth();
		int h=super.getHeight();
		super.setArea(w*h);
	}

}
