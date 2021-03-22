package kr.ac.kopo.day10.homework.Q2.version3;

public class Square extends Rectangle{
	
	Square(){
		super.setFigureName("Square");
	}
	
	@Override
	public void calArea() {
		int w=super.getWidth();
		setArea(w*w);
	}

}
