package kr.ac.kopo.day13.homework.Q2;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar { //복습겸 2차원 배열을 써서 깔끔하게 출력해보자

	Calendar c = Calendar.getInstance();

	public int inputInt(String msg) { // 사용자가 원하는 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}

	public void makeCalendar(int userInputYear) { // 원하는 연도의 1월부터 12월까지 달력출력
		for (int repeatMonth = 0; repeatMonth <= 11; repeatMonth++) { // 월별 반복 : 0(1월)~11(12월)
			
			c.set(userInputYear, repeatMonth, 1); // 연도, 월, 1일로 설정
			//월별 날짜 채우기
			int[][] monthCalendar=inputNumToCalendar();
			// 월별 출력
			printCalendar(userInputYear, (repeatMonth + 1), monthCalendar);

		} // 1개월 반복 끝
	}

	public void makeCalendar(int userInputYear, int userInputMonth) { // 원하는 연도의 원하는 달의 달력출력
		c.set(userInputYear, userInputMonth - 1, 1); // 연도, 월, 1일로 설정
		//월별 날짜 채우기
		int[][] monthCalendar =inputNumToCalendar();
		// 사용자 입력 월 출력
		printCalendar(userInputYear, userInputMonth, monthCalendar);
	}

	public void printCalendar(int userInputYear, int userInputMonth, int[][] monthCalendar) { // 달력 출력
		System.out.println("<<" + userInputYear + "년 " + userInputMonth + "월 >>");
		System.out.println("일\t\t월\t\t화\t\t수\t\t목\t\t금\t\t토");
		
		for (int i = 0; i < monthCalendar.length; i++) {
			for (int num : monthCalendar[i]) {
				if (num == 0) {
					System.out.print(" " + "\t\t");
				} else {
					System.out.print(num + "\t\t");
				}
			}
			System.out.println();
		}
	}

	public int[][] inputNumToCalendar() { // 월별 날짜 채우기
		int day = c.get(Calendar.DAY_OF_WEEK); // 월별 1일은 무슨요일? (일요일(1) ~ 토요일(7))
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 월의 마지막 날은 몇일?
		int oneDay = 1; // 1일, 2일, 3일, ... 해당 월의 마지막 날

		int[][] monthCalendar = new int[6][7]; // 월별 달력을 위한 2차원 배열 (5행 7열)
		loop: for (int week = 0; week <= 5; week++) {
			if (week == 0) {
				for (int days = day - 1; days <= 6; days++) {
					monthCalendar[week][days] = oneDay++;
				}
			} else {
				for (int days = 0; days <= 6; days++) {
					monthCalendar[week][days] = oneDay++;
					if (oneDay > lastDay) { // 마지막 날을 넘어가면 월별 날짜 그만 채우기
						break loop;
					}
				}
			}
		}
		return monthCalendar;
	}

}