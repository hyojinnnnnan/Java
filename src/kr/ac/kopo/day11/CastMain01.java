package kr.ac.kopo.day11;

public class CastMain01 { 
	
	/*
	아래 3가지 메소드 모두 info메소드를 호출하고 있으며 Child01와 Child02는 Parent와 상속관계이며
	public static void print(Child01 c) {
		c.info();
	}
	public static void print(Child02 c) {
		c.info();
	}
	public static void print(Parent p) {
		p.info();
	}
	*/
	
	//위 3가지(오버로딩)를 객체 형변환을 통해 1가지로 단축가능
	public static void print(Parent p) { //매개변수에서 이미 묵시적 형변환이 일어나고 있음 -> Parent p=new Child01();
		p.info(); //오버라이드 된 메소드가 호출됨
		//p.study(); -> 오류 : The method study() is undefined for the type Parent / study()는 오버라이드된 메소드가 아님
		
		System.out.println("p instance of Child01 : "+(p instanceof Child01));
		System.out.println("p instance of Child02 : "+(p instanceof Child02));
		System.out.println("p instance of Parent : "+(p instanceof Parent));
		//같은 타입, 상속관계일 때만 instance of 사용가능 (결과값 : true / false), p가 child01 타입의 객체를 가리키고 있니?
		
		//명시적 형변환
		if(p instanceof Child01) {
			Child01 c=(Child01)p;
			c.sleep();
			c.study();
		}else if(p instanceof Child02) {
			Child02 c=(Child02)p;
			c.sing();
			c.play();
		}
		
	}

	public static void main(String[] args) {
		Child01 c01=new Child01();
		print(c01);
		
		Child02 c02=new Child02();
		print(c02);
		
		Parent p=new Parent();
		print(p);

	}

}
