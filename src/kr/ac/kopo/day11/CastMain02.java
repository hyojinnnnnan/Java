package kr.ac.kopo.day11;

public class CastMain02 { //명시적 형변환

	public static void main(String[] args) {
		//case 1 : 컴파일 오류 
		//Child01 c=new Parent(); 
		
		//case 2 : 실행오류
		//Child01 c=(Child01) new Parent();
		
		Parent p=new Child02(); //묵시적 형변환 
		p.info(); //Child02 클래스에서 재정의된 메소드
		//p.play(); 에러발생
		Child02 c=(Child02) p; //오버라이딩 되지 않은 메소드도 호출하고 싶으면
		c.info();
		c.sing();
		c.play();
		

	}

}
