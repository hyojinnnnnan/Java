package kr.ac.kopo.day10.homework.Q2.version2;

public class Triangle extends Figure{
	
	Triangle(){
		super.setWH("Triangle", super.randomNum(), super.randomNum());
	}
	
	@Override
	public void calArea() {
		int w=super.getW();
		int h=super.getH();
		double a=(double)w*h*0.5;
		super.setArea(a);
		super.calArea();
	}

}
