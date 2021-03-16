package kr.ac.kopo.day07;

public class Method { //멤버변수는 없고 메소드만 가지고 있는 클래스 : 기능클래스
	/*
	 * 자바의 메소드가 가지는 특징 "메소드 오버로딩(Overloading)"
	 * 
	 * 같은 클래스 내에 동명의 메소드이면서
	 * 매개변수의 개수 또는 매개변수의 타입 또는 매개변수의 순서가 다른 것
	 * 
	 * 자바에서는 메소드를 구분하는 구분자가 메소드명+매개변수이기 때문에 오버로딩이 가능해진다!
	 */
	void call() { //메소드 선언
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) { 
	//line 12에 있는 메소드와 이름은 같지만 매개변수의 개수가 다르기 때문에 다른 메소드로 취급
		System.out.println("call(integer) 메소드 호출...");
	}
	
	/*
	 * 이 메소드는 에러발생
	 * 왜? 리턴타입은 메소드를 구분하는 구분자 역할을 하지 못하기 때문에 line 16의 메소드와 동일한 메소드로 취급하기 때문에
	 * 
	 * int call(int i) { 
	 * System.out.println("int call(integer) 메소드 호출...");
	 * }
	 */
	
	void call(double d) { 
		//line 16에 있는 메소드와 이름과 매개변수의 개수는 같지만 매개변수의 타입이 다르기 때문에 다른 메소드로 취급
			System.out.println("call(double) 메소드 호출...");
		}
	
	void call(String s) { 
	//line 16, 30에 있는 메소드와 이름과 매개변수의 개수는 같지만 매개변수의 타입이 다르기 때문에 다른 메소드로 취급
		System.out.println("call(string) 메소드 호출...");
	}
	
}
