package kr.ac.kopo.day08;

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c=new Car();
		//만약 Car 클래스에 생성자가 하나도 없다면 JVM은 자동으로 아래와 같은 디포릍 생성자를 만든다 : Car(){}
		Car c2=new Car("소나타");
		Car c3=new Car(40000000);
		Car c4=new Car("람보르기니",400000000);
		
		c.Car();

	}

}
