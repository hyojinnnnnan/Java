package kr.ac.kopo.day11.homework;

public class Triangle extends Figure{
	
	Triangle(){
		super.setWidth();
		super.setHeight();
		super.setFigureName("Triangle");
	}
	
	@Override
	public void calArea() {
		int w=super.getWidth();
		int h=super.getHeight();
		double a=(double)w*h*0.5;
		super.setArea(a);
	}

}
