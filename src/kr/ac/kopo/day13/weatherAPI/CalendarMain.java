package kr.ac.kopo.day13.weatherAPI;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //static 메소드 접근방식 : 클래스명.메소드명
		System.out.println(c);
		/* Calendar 클래스(->추상 클래스)와 getInstance 메소드는 다음과 같은구성을 가질 것
		abstract class Calendar{
			static Calendar getInstrance() { //추상클래스는 구현된 일반 메소드도 가질 수 있음 (인터페이스와의 차이점)
				return new GregorianCalendar();
			}
		}
		*/
		
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH); //0~11
		int date=c.get(Calendar.DAY_OF_MONTH); //DAY_OF_MONTH 대신 DATE도 가능
		int day=c.get(Calendar.DAY_OF_WEEK); //일요일(1) ~ 토요일(7)
		String[] dayArr= {" ","일", "월", "화", "수", "목", "금", "토"};
		System.out.println(year+"년 "+(month+1)+"월 "+date+"일 "+dayArr[day]+"요일");
		
		//2021년 5월 5일은 무슨요일?
		c.set(2021, 4, 5);
		day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021년 5월 5일 "+dayArr[day]+"요일");
		
		//2021년 5월의 마지막 날은 몇일?
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("5월은 "+lastDay+"일로 구성되어 있습니다!");
		
		//2021년 2월의 마지막 날은 몇일?
		c.set(c.MONTH, 2-1);
		lastDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2월은 "+lastDay+"일로 구성되어 있습니다.");
		
		
				
	}

}
