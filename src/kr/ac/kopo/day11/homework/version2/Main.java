package kr.ac.kopo.day11.homework.version2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Figure f;

		switch (num) {
		case 1:
			f = new Rectangle();
			f.calArea();
			f.printInfo();
			break;
		case 2:
			f = new Square();
			f.calArea();
			f.printInfo();
			break;
		case 3:
			f = new Triangle();
			f.calArea();
			f.printInfo();
			break;
		case 4:
			f = new Circle();
			f.calArea();
			f.printInfo();
			break;
		}
	}

}
