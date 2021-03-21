package kr.ac.kopo.day10.homework.Q2.version2;

public class Circle extends Figure{
	
	double pi=3.141592;
	
	Circle(){
		super.setW("Circle", super.randomNum());
	}
	
	@Override
	public void calArea() {
		int w=super.getW();
		super.setArea(w*w*pi);
		super.calArea();
	}

}
