package personal.inflearn.objectCasting;

public class Main {

	public static void main(String[] args) {
		
		//Upcating
		Animal ani=new Cat();
		
		ani.eat(); 
		//컴파일시점 -> Animal : .eat()가 Animal에 있기 때문에 오류가 발생하지 않는 것
		//하지만 자식클래스에 오버라이드가 되어 있기 때문에 Cat에 잇는 .eat()가 실행된다. 

	}

}
