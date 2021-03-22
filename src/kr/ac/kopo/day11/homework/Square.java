package kr.ac.kopo.day11.homework;

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
