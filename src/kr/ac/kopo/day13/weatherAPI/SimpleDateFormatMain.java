package kr.ac.kopo.day13.weatherAPI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatMain {

	public static void main(String[] args) {

		String pattern = "yy-MM-dd"; //"yyyy년 MM월 dd일 HH시 mm분 ss초 (E)"
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(new Date()); 
		//.format()의 매개변수로는 Date형만 가능 -> Calendar형을 Date형으로 변경 .getTime()
		Calendar c = Calendar.getInstance();
		c.set(c.MONTH, 2-1); //2월로 설정
		Date d=c.getTime();
		data=sdf.format(d);
		
		System.out.println(data);

	}

}
