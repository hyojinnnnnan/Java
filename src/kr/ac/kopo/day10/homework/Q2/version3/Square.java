package kr.ac.kopo.day10.homework.Q2.version3;

public class Square extends Figure{
	
	Square(){
		super.setW("Square");
	}
	
	@Override
	public void calArea() {
		int w=super.getW();
		super.setArea(w*w);
		super.calArea();
	}

}
