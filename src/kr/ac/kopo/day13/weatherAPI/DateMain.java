package kr.ac.kopo.day13.weatherAPI;

import java.util.Date;

class Dog {
	
	private String name;
	private int age;
	
	Dog(){
		
	}
	Dog(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() { //이런 식으로 꽤 많이 사용
		return "name : "+name+", age : "+age;
	}
}

public class DateMain {
	
	public static void main(String[] args) {
		
		Dog dog=new Dog("멍이",3);
		System.out.println(dog/*.toString()이 자동 생략되어 있음*/); 
		//.toString()을 Dog 클래스에서 오버라이드 안했으면 번지(주소)값이 나오겠지만 line 18에서 오버라이드해서 내가 원하는 값이 나옴
		/*
		public String toString() {
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }
	    */
		
		
		//오늘 날짜를 출력해보자
		//다 Deprecated 된 메소드 -> Calendar 클래스에서 매개변수 또는 리턴값으로 사용되는 경우가 있어서 알아두기는 해야 함 
		Date d=new Date();
		System.out.println(d); //여기서는 번지(주소)값이 안나옴 -> Date 클래스에서 .toString() 메소드가 오버라이드 됬다는 걸 알 수 있음
		int year=d.getYear();
		System.out.println("오늘은 "+year+"년"); //2021년 기준 출력값 121년 -> 왜? getYear() 메소드는 1900년부터 1년으로 카운트
		System.out.println("오늘은 "+(year+1900)+"년");
		int month=d.getMonth();
		System.out.println("오늘은 "+month+"월"); //3월 기준 출력값 2월 -> 왜? 1월을 0으로 반환
		System.out.println("오늘은 "+(month+1)+"월"); 
		int date=d.getDate();
		System.out.println("오늘은 "+date+"일"); 
	}
}
