package kr.ac.kopo.day10;

/**
 * 사원들의 기본정보를 관리하는 클래스
 * @author Hyojin An
 *
 */

public class Employee {
	
	/**Employee클래스의 멤버변수 : 사원번호*/
	private int no;
	/**Employee클래스의 멤버변수 : 사원명*/
	private String name;
	/**Employee클래스의 멤버변수 : 연봉*/
	private int sal;
	/**Employee클래스의 멤버변수 : 직급*/
	private String grade;
	
	/**Employee 디폴트 생성자*/
	Employee(){
		
	}
	
	/**
	 * Employee 생성자
	 * @param no 사원번호
	 * @param name 사원명
	 * @param sal 연봉
	 * @param grade 직급
	 */
	Employee(int no, String name, int sal, String grade){
		this.no=no;
		this.name=name;
		this.sal=sal;
		this.grade=grade;
	}
	
	/**사원번호, 사원명, 연봉, 직급을 출력하는 메소드*/
	void info() {
		System.out.println("사원번호 : "+no);
		System.out.println("사원명 : "+name);
		System.out.println("연봉 : "+sal);
		System.out.println("직급 : "+grade);
		System.out.println();
	}
}
