package kr.ac.kopo.day13.homework.Q2.Ans;

import java.util.Scanner;

public class CalendarView {
	
	private int getInt(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(msg);
		int command = sc.nextInt();
		return command;
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		/*loop:*/ while(true) {
			int command = getInt("선택하세요(1. 특정년도   2. 특정월   3. 종료) :"); //이전달, 다음달, 현재달, 종료
			int year, month;
			switch(command) {
			case 1:
				year= getInt("년도를 입력하세요 : ");
				util.showDayByYear(year);
				break;
			case 2:
				year= getInt("년도를 입력하세요 : ");
				month= getInt("년도를 입력하세요 : ");
				util.showDayByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램 종료");
				/*break loop;*/
				System.exit(0); //메인 메소드 { } 끝에 도달하지 않아도 프로그램 실행 종료
				//exit() 메소드 : System 클래스에 위치한 public static 메소드
			}
		}
	}

}
