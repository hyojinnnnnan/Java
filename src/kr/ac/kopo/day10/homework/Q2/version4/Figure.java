package kr.ac.kopo.day10.homework.Q2.version4;

public class Figure {
	
	private String FigureName;
	private int width;
	private int height;
	private double area;
	
	public int randomNum() {
		int max=10;
		int min=2;
		return (int) (Math.random() * (max-min)+min);
	}
	
	public void setW(String n) {
		this.FigureName=n;
		this.width=this.randomNum();
	}
	
	public void setWH(String n) {
		this.FigureName=n;
		this.width=this.randomNum();
		this.height=this.randomNum();
	}
	
	public int getW() {
		return this.width;
	}
	
	public int getH() {
		return this.height;
	}
	
	public void setArea(double a) {
		this.area=a;
	}
	public double getArea() {
		return this.area;
	}
	
	public void calArea() {
		if(this.FigureName.equals("Rectangle")) {
			System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.0f입니다.", getW(), getH(), getArea());
		}else if(this.FigureName.equals("Square")) {
			System.out.printf("가로 %d의 정사각형 면적은 %.0f입니다.", getW(), getArea());
		}else if(this.FigureName.equals("Triangle")) {
			System.out.printf("가로 %d, 세로 %d의 삼각형 면적은 %.2f입니다.", getW(), getH(), getArea());
		}else {
			System.out.printf("반지름 %d의 원 면적은 %.2f입니다.", getW(), getArea());
		}
	}

	
}
