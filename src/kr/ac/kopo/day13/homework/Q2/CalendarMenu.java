package kr.ac.kopo.day13.homework.Q2;

import java.util.Scanner;

public class CalendarMenu extends MyCalendar {
	
	private int inputInt(String msg) { // 사용자가 원하는 숫자 입력 ->  CalendarMenu 클래스에서만 사용되니까 private으로 선언
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}

	public void executeMenu(int menu) { // 선택한 메뉴 실행
		int userInputYear;
		int userInputMonth;
		switch (menu) {
		case 1:
			userInputYear = inputInt("년도를 입력하세요 : "); // 연도 입력받기
			super.makeCalendar(userInputYear);
			break;
		case 2:
			userInputYear = inputInt("년도를 입력하세요 : "); // 연도 입력받기
			userInputMonth = inputInt("월을 입력하세요 : "); // 월 입력받기
			super.makeCalendar(userInputYear, userInputMonth);
			break;
		}
	}

	public void start() { 
		boolean repeat = true;
		while (repeat) {
			int menu = inputInt("선택하세요(1. 특정년도   2. 특정월   3. 종료) : ");
			if (menu == 3) {
				repeat = false;
			} else if (menu < 1 || menu > 3) {
				System.out.println("===올바르지 않은 선택입니다. 다시 입력해주세요.===");
				menu = inputInt("선택하세요(1. 특정년도   2. 특정월   3. 종료) : ");
			}
			executeMenu(menu);
		}
	}

}
