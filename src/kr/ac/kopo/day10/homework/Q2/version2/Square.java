package kr.ac.kopo.day10.homework.Q2.version2;

public class Square extends Figure{
	
	Square(){
		super.setW("Square",super.randomNum());
	}
	
	@Override
	public void calArea() {
		int w=super.getW();
		super.setArea(w*w);
		super.calArea();
	}

}
