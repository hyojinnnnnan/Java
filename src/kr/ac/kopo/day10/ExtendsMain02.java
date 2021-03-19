package kr.ac.kopo.day10;

public class ExtendsMain02 {

	public static void main(String[] args) {
		
		
		Employee e=new Employee(100, "홍길동", 4_000, "사원");
		Employee e2=new Employee(200, "고길동", 4_200, "대리");
		Employee e3=new Employee(300, "차길동", 4_400, "과장");
		e.info();
		e2.info();
		e3.info();

		Employee[] empList= {e,e2};
		Manager m=new Manager(1,"안효진", 5000, "관리자", empList);
		m.info();
		
	}

}
