package kr.ac.kopo.day11.homework.version2;

public abstract class Figure {
	
	private int width;
	private int height;
	private double area;
	
	/**넓이를 계산하는 추상화 메소드*/
	public abstract void calArea();
	
	/**가로, 세로, 넓이를 출력하는 추상화 메소드*/
	public abstract void printInfo();
	
	/**2~10 까지 난수 생성*/
	public int randomNum() {
		int max=10;
		int min=2;
		return (int) (Math.random() * (max-min)+min);
	}

	/**도형 가로 출력*/
	public int getWidth() {
		return width;
	}

	/**도형 가로 설정*/
	public void setWidth() {
		this.width = this.randomNum();
	}

	/**도형 세로 출력*/
	public int getHeight() {
		return height;
	}

	/**도형 세로 설정*/
	public void setHeight() {
		this.height = this.randomNum();
	}

	/**도형 넓이 출력*/
	public double getArea() {
		return area;
	}

	/**도형 넓이 설정*/
	public void setArea(double area) {
		this.area = area;
	}
}
