package kr.ac.kopo.day09;

public class Employee {
	
	//멤버변수는 private으로 메소드는 public으로 만드는 습관을 들여봅시당

	/**사원명*/
	private String name; 
	/**연봉*/
	private int sal; 
	/**직급*/
	private String grade; 
	/**총 사원 수*/
	private static int totalEmployee=0;

	/**정보가 없는 사원*/
	Employee(){
		this.name="알 수 없음";
		this.grade="알 수 없음";
		this.sal=0;
		++Employee.totalEmployee;
	}
	
	/**
	 * 새로운 사원정보를 입력
	 * @param name 사원명
	 * @param sal 연봉
	 * @param grade 직급
	 */
	Employee(String name, int sal, String grade){
		this.name=name;
		this.sal=sal;
		this.grade=grade;
		++Employee.totalEmployee;
	}
	
	/**이름 반환*/
	public String getName() {
		return this.name;
	}
	
	/**연봉 반환*/
	public int getSal() {
		return this.sal;
	}
	
	/**연봉 수정*/
	public void setSal(int sal) {
		this.sal=sal;
	}
	
	/**직급 반환*/
	public String getGrade() {
		return this.grade;
	}
	
	/**직급 수정*/
	public void setGrade(String grade) {
		this.grade=grade;
	}
	
	/**사원정보 출력*/
	public void printOneInfo() {
		System.out.println("사원이름 : "+getName());
		System.out.println("연봉 : "+getSal()+"만원");
		System.out.println("직급 : "+getGrade());
		System.out.println();
	}
	
	/**총 사원 수 출력*/
	public static void printTotalEmployee() {
		System.out.println("총 사원 수 : "+Employee.totalEmployee+"명");
	}
}
