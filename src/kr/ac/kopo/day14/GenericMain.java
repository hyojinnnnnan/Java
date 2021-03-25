package kr.ac.kopo.day14;

import java.util.Random;

class A{
	private Object obj;
	
	public A(Object obj) {
		this.obj=obj;
	}
	
	public void setObj(Object obj) {
		this.obj=obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : "+obj);
	}
}

class B<T>{ //객체를 만나면 <>안의 타입으로 만들어
	
private T obj; // line 65 -> 각각 String/Random형의 obj가 됨
	
	public B(T obj) {
		this.obj=obj;
	}
	
	public void setObj(T obj) {
		this.obj=obj;
	}
	
	public T getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : "+obj);
	}
}

public class GenericMain {

	public static void main(String[] args) {
		A a01=new A(new String("hello")); //묵시적 형변환 : String도 되고 (부모 Object, 자식 String)
		A a02=new A(new Random()); //묵시적 형변환 : Random도 됨 (부모 Object, 자식 Random)
		
		a01.info();
		a02.info();
		
		//System.out.println("길이 : "+a01.getObj().length()); 
		//a01.getObj()는 Object형이기 때문에 String 클래스 메소드인 .length()에서 오류발생
		System.out.println("길이 : "+((String)a01.getObj()).length()); //명시적 형변환 
		
		//System.out.println("길이 : "+((String)a02.getObj()).length());
		//컴파일만 하면 오류x, 실행하면 오류 -> 객체 형변환은 상속관계에서만 가능한데 String과 Random은 상속관계가 아님
		System.out.println("난수 : "+((Random)a02.getObj()).nextInt());
		
		//어떨 때는 Random으로 어떨 때는 String으로 형변환 -> 안좋음 -> Generic을 통해 해결 -> class B 참고
		
		B<String> b01 = new B<String>(new String("Hello")); //line 27
		B<Random> b02 = new B<Random>(new Random()); //line 27
		
		b01.info();
		b02.info();
		
		//명시적 형변환을 할 필요가 없이 Generic이 알아서 해줌
		System.out.println("길이 : "+b01.getObj().length());
		System.out.println("난수 : "+b02.getObj().nextInt());
	}

}
