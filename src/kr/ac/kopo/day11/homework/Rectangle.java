package kr.ac.kopo.day11.homework;

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
