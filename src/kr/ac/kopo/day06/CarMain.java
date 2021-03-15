package kr.ac.kopo.day06;

public class CarMain {

	public static void main(String[] args) {
		
		Car c=new Car(); //JVM은 메인메소드에서 마주치는 클래스(Car)를 실행시킴
		//new Car() -> heap영역에 name, price, company를 갖는 공간을 만듦
		//Car c -> 참조변수 c를 통해 주소값으로 heap영역의 공간에 접근
		
		//new키워드를 통해 만들어진 객체는 자동으로 초기화됨 (String은 null로, int는 0으로)
		System.out.println("c.name : "+c.name); //null
		System.out.println("c.price : "+c.price); //0
		System.out.println("c.company : "+c.company); //null
		
		c.name="소나타";
		c.price=3200;
		c.company="현대";
		
		System.out.println("c.name : "+c.name); //벤츠
		System.out.println("c.price : "+c.price); //3200
		System.out.println("c.company : "+c.company); //현대
		
		Car c2=new Car();
		//heap영역에 name, price, company를 갖는 공간이 새롭게 생성!
		//참조변수 c2를 통해 c로 접근할 수 있는 공간과 다른 새롭게 생성된 공간에 접근할 수 있음
		
		System.out.println("c2.name : "+c2.name); //null
		System.out.println("c2.price : "+c2.price); //0
		System.out.println("c2.company : "+c2.company); //null

	}

}
