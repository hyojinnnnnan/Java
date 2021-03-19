package kr.ac.kopo.day10;

/**
 * 관리자를 생성하기 위한 클래스
 * 
 * @author Hyojin An
 *
 */

public class Manager extends Employee { // 관리자 클래스

	private Employee[] empList; // 관리대상 사원목록

	Manager() {

	}

	Manager(int no, String name, int sal, String grade, Employee[] empList) {
		// 눈에 보이지 않지만 super()를 호출하고 있기 때문에 Employee 클래스에 디폴트 생성자가 반드시 존재해야 함
		super(no, name, sal, grade); // Employee 클래스에서 4개의 매개변수(int, String, int, String)를 가지고 있는 생성자를 호출
		/*super(no, name, sal, grade); 를 풀어서 쓰면 
		 * this.no=no; -> this.no가 가리키는 것은 부모클래스에 있는 멤버변수 no 즉, super.no과 동일함 
		 * this.name=name; 
		 * this.sal=sal; 
		 * this.grade=grade;
		 */
		this.empList = empList;
	}

	/**기본 사원정보와 관리사원 리스트를 출력하는 메소드*/
	@Override
	void info() { // 메소드 오버라이딩 : 상속관계에서만 발생!, 부모클래스의 메소드의 이름과 매개변수 타입과 매개변수 개수가 동일하지만 내용부가 다른 것
					// (재정의)
		// 메소드 오버로딩 : 동일한 클래스 내에 메소드 명은 같지만 매개변수의 타입이나 개수가 다른 것
		System.out.println("====================");
		// info(); 이렇게만 적으면 Manager 클래스의 info()를 호출해서 java.lang.StackOverflowError
		// this 키워드도 없도 super키워드도 없으면 this가 생략되어 있는 것 -> this는 자기참조!
		super.info();
		System.out.println("-----관리사원 리스트-----");
		System.out.println();
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("====================");
	}

}
