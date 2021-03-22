package kr.ac.kopo.day10.homework.Q2.version4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) : ");
		int num = sc.nextInt();
		sc.nextLine();

		switch (num) {
		case 1:
			Rectangle r = new Rectangle();
			r.calArea();
			break;
		case 2:
			Square s = new Square();
			s.calArea();
			break;
		case 3:
			Triangle t = new Triangle();
			t.calArea();
			break;
		case 4:
			Circle c = new Circle();
			c.calArea();
			break;
		}
	}

}
