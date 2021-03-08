package kr.ac.kopo.day01;

/*
 * 상수의 종류는 5가지 ('문자'와 "문자열"은 다름)
 * 	1) 정수형 : 10, 20, -678
 * 	2) 실수형 : 1.2, 3.45678
 * 	3) 문자형 : '3', 'A', 'm', '!','가'
 * 	4) 문자열 : "abc", "A", "가나"
 * 	5) 논리형 : true, false
 */

public class ConstMain {

	public static void main(String[] args) {
		
		boolean bool = false;
		bool = true;
		
		//line 15, 16처럼 변수의 값이 변하는 것이 아니라 고정시키려면? : 상수변수 (final)
		final boolean BOOL = false; //상수변수명은 대문자로 작성
		
		System.out.println(bool);
		System.out.println(BOOL);

	}

}
