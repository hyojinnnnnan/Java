package kr.ac.kopo.day13.homework.Q2;

import java.util.InputMismatchException;

public class CalendarMain {

	public static void main(String[] args) {

		CalendarMenu pc = new CalendarMenu();
		try {
			pc.start();
		} catch (InputMismatchException e) {
			System.out.println("[날짜 입력값이 올바르지 않습니다]" + e.getMessage());
			pc.start();
		}

	}

}
