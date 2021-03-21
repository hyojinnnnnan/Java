package kr.ac.kopo.day10.homework.Q2;

public class Triangle extends Figure {

	@Override
	void calArea() {
		double result = (double) num1*num2*0.5;
		System.out.printf("가로 %d, 세로 %d의 삼각형 면적은 %.2f입니다.", num1, num2, result);
	}

}
