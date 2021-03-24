package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//인터페이스나 추상클래스에서 추상메소드를 정의할 때 간접 예외처리를 많이 사용 

abstract class Parent {
	public abstract void print();
	
	// public abstract void scan(); -> 오버라이딩을 통해 각 클래스에서 scan() 메소드를 통해 각각의 데이터를 읽어올 때 문제가 생길 수 있을 것 같은데?
	public abstract void scan() throws Exception;
}

class Child extends Parent {

	@Override
	public void print() {
		
	}

	@Override
	public void scan() throws Exception {

	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////

public class ExceptionMain05 {

	public static void a() {
		System.out.println("a() 메소드 호출...");
		// 직접처리 방법
		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("a() 메소드 예외처리 : " + fnfe.getMessage());
		}
	}

	public static void b() throws Exception /* Exception 대신 -> NullPointerException, ArithmeticException 붙여서 쓸 수 있음 */ { // 간접처리 방법
		System.out.println("b() 메소드 호출...");
		String str = null;
		System.out.println(str.charAt(0)); // 실행시점의 예외발생 : NullPointerException
		System.out.println(1 / 0); // 실행시점의 예외발생 : ArithmeticException

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) /* throws Exception을 붙여서 JVM으로 오류를 다시 떠넘길 수는 있지만 좋은 방법은 아님 */ {

		a(); //a()메소드에 대한 예외처리를 a()메소드가 정의된 클래스 안에 구현되어 있음

		System.out.println();

		try { // b()메소드를 호출하는 곳에서 예외처리
			b();
		} catch (Exception e) {
			System.out.println("b() 메소드 예외처리 : " + e.getMessage());
		}

		/////////////////////////////////////////////////////////////////////////////////////////////////

		Child obj = new Child();
		obj.print();
		// obj.scan(); -> Unhandled exception type Exception
		try {
			obj.scan();
		} catch (Exception e) {
			System.out.println("scan() 메소드 예외처리 : " + e.getMessage());
		}

	}

}
