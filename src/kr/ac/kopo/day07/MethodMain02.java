package kr.ac.kopo.day07;

public class MethodMain02 {
	
	public static void main(String[] args) {
		//call() 메소드가 있는 Method 클래스의 객체를 만들고
		Method m = new Method();
		//만든 객체를 이용하여call() 메소드를 호출한다
		m.call();
		m.call(1);
		m.call("a"); //call(string) 메소드 호출...
		
		//character 타입을 매개변수로 갖는 메소드를 찾고 -> 없다면 -> 문자 a를 묵시적 형변환 할 수 있는 타입을 찾음
		//char<int<long<float<double
		m.call('a'); //call(integer) 메소드 호출...
		//만약 call(int i) 메소드가 없다면 출력값은 "call(double) 메소드 호출..."이 될 것
	}	
}
