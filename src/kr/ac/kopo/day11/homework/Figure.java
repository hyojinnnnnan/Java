package kr.ac.kopo.day11.homework;

public abstract class Figure {
	
	private String FigureName;
	private int width;
	private int height;
	private double area;
	
	/**2~10 까지 난수 생성*/
	public int randomNum() {
		int max=10;
		int min=2;
		return (int) (Math.random() * (max-min)+min);
	}
	
	/**도형 종류 출력*/
	public String getFigureName() {
		return FigureName;
	}
	
	/**도형 종류 설정*/
	public void setFigureName(String figureName) {
		FigureName = figureName;
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
	
	/**넓이를 계산하는 추상화 메소드*/
	public abstract void calArea();

	/**도형별 가로, 세로, 넓이에 대한 정보를 출력하는 메소드*/
	public void printInfo() {
		if(this.FigureName.equals("Rectangle")) {
			System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.0f입니다.", getWidth(), getHeight(), getArea());
		}else if(this.FigureName.equals("Square")) {
			System.out.printf("가로 %d의 정사각형 면적은 %.0f입니다.", getWidth(), getArea());
		}else if(this.FigureName.equals("Triangle")) {
			System.out.printf("가로 %d, 세로 %d의 삼각형 면적은 %.2f입니다.", getWidth(), getHeight(), getArea());
		}else {
			System.out.printf("반지름 %d의 원 면적은 %.2f입니다.", getWidth(), getArea());
		}
	}

	
}
