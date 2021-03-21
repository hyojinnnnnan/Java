package kr.ac.kopo.day10.homework.Q2.version2;

public class Rectangle extends Figure{
	
	Rectangle(){
		super.setWH("Rectangle",super.randomNum(), super.randomNum());
	}
	
	@Override
	public void calArea() {
		int w=super.getW();
		int h=super.getH();
		super.setArea(w*h);
		super.calArea();
	}

}
