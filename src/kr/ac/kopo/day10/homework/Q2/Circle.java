package kr.ac.kopo.day10.homework.Q2;

public class Circle extends Figure {

	double pi = 3.141592;

	@Override
	void calArea() {
		double result = (double) pi * num1 * num1;
		System.out.printf("반지름 %d의 원 넓이는 %.2f입니다.", num1, result);
	}

}
