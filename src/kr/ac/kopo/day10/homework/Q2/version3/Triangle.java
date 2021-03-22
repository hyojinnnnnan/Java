package kr.ac.kopo.day10.homework.Q2.version3;

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
