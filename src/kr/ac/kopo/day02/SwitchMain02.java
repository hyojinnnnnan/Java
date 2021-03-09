package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 계절 : ");
		String season = sc.nextLine(); //.nextLine() : 문자열 입력받기
		
		if (season == "spring") {
			System.out.println("봄");			
		} else if (season == "summer") {
			System.out.println("여름");			
		} else {
			System.out.println("가을 또는 겨울");			
		}
		/*
		 * spring 또는 summer을 입력해도 출력되는 값은 "가을 또는 겨울"
		 * String은 참조 자료형!
		 * 참조 자료형의 데이터 값은 동등비교(==) 불가
		 * 동등비교는 기본 자료형만 가능!
		 * 
		 * if문을 사용하기 위해서는 다음과 같이 입력해야 함
		 */
		
		System.out.print("====================="+"\n");
		
		if (season.equals("spring")) {
			System.out.println("봄");			
		} else if (season.equals("summer")) {
			System.out.println("여름");			
		} else {
			System.out.println("가을 또는 겨울");			
		}
		
		System.out.print("====================="+"\n");
		
		//switch-case로 작성하면
		switch(season) {
		case "spring":
			System.out.println("봄");
			break;
		case "summer":
			System.out.println("여름");
			break;		
		default:
			System.out.println("가을 또는 겨울");		
		}
		
	}

}
