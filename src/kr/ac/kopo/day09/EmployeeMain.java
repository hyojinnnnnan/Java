package kr.ac.kopo.day09;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.printTotalEmployee(); 
		//객체가 만들어지지 않은 상태에서도 사용가능 -> 총 사원 수 : 0명 -> 이 출력됨
		
		System.out.println("===사원 입사 ↓ ===");
		
		Employee e=new Employee("고길동",5000,"과장");
		e.printOneInfo();
		
		Employee e2=new Employee("홍길동",4000,"대리");
		e2.printOneInfo();
		e2.setSal(4500);
		System.out.println(e2.getName()+"의 연봉 수정 : "+e2.getSal()+"\n");
		e2.printOneInfo();
		
		Employee e3=new Employee("차길동",3000,"사원");
		e3.setGrade("차장");
		System.out.println(e3.getName()+"의 직급 수정 : "+e3.getGrade()+"\n");
		e3.printOneInfo();
		
		Employee.printTotalEmployee(); 
		
	}

}
