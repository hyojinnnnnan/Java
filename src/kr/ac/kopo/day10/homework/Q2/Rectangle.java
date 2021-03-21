package kr.ac.kopo.day10.homework.Q2;

public class Rectangle extends Figure {

	@Override
	void calArea() {
		System.out.println("가로 " + num1 + ", 세로 " + num2 + "의 직사각형 면적은 " + num1 * num2 + "입니다.");
	}

}
