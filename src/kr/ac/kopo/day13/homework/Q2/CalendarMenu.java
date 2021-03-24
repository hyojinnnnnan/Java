package kr.ac.kopo.day13.homework.Q2;

public class CalendarMenu extends MyCalendar {

	public void executeMenu(int menu) { // 선택한 메뉴 실행
		int userInputYear;
		int userInputMonth;
		switch (menu) {
		case 1:
			userInputYear = this.inputInt("년도를 입력하세요 : "); // 연도 입력받기
			super.makeCalendar(userInputYear);
			break;
		case 2:
			userInputYear = this.inputInt("년도를 입력하세요 : "); // 연도 입력받기
			userInputMonth = this.inputInt("월을 입력하세요 : "); // 월 입력받기
			super.makeCalendar(userInputYear, userInputMonth);
			break;
		}
	}

	public void start() { 
		boolean repeat = true;
		while (repeat) {
			int menu = super.inputInt("선택하세요(1. 특정년도   2. 특정월   3. 종료) : ");
			if (menu == 3) {
				repeat = false;
			} else if (menu < 1 || menu > 3) {
				System.out.println("===올바르지 않은 선택입니다. 다시 입력해주세요.===");
				menu = super.inputInt("선택하세요(1. 특정년도   2. 특정월   3. 종료) : ");
			}
			executeMenu(menu);
		}
	}

}
