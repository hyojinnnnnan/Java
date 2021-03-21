package kr.ac.kopo.day10.homework.Q2.version3;

public class Circle extends Figure{
	
	double pi=3.141592;
	
	Circle(){
		super.setW("Circle");
	}
	
	@Override
	public void calArea() {
		int w=super.getW();
		super.setArea(w*w*pi);
		super.calArea();
	}

}
