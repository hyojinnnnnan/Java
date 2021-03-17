package kr.ac.kopo.day08;

public class Car {
/*
 * 생성자의 특징
 * 1) 클래스 명과 동일
 * 2) 반환형이 존재하지 않음
 * 3) 디폴트 생성자 지원 : 클래스 내부에 생성자가 '하나도' 없을 때 JVM이 자동 생성
 * 4) 객체의 초기화 담당
 * 4) 생성자 오버로딩 지원
*/
	
	Car(){
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String str){
		System.out.println("Car(String) 생성자 호출");		
	}
	
	Car(int integer){
		System.out.println("Car(int) 생성자 호출");		
	}
	
	Car(String str, int integer){
		System.out.println("Car(String, int) 생성자 호출");		
	}
	
	void Car() { 
		//클래스명과 동일해서 생성자라고 생각할 수도 있지만 반환형(void)가 있기 때문에 메소드임! 
		//왠만하면 명령규칙을 지켜서 다른 이름의 메소드명으로 바꾸는 것이 best임!
		System.out.println("생성자가 아닌 메소드 Car() 호출");
	}
}
