package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;

class Member {

}

class Car {

}

class MemInfo{
	
	private Member m;
	private Car c;
	
	MemInfo(Member m, Car c){
		this.m = m;
		this.c = c;
	}
}

class Test {
	/*
	public (타입) returnTest() { 
	 Member m = new Member(); 
	 Car c = new Car();
	 	
	 return (m과 c를 둘 다 리턴하고 싶으면?); 
	 }
	 */
	
	/* 방법 1
	public Object returnTest() {
		Member m = new Member();
		Car c = new Car();
		
		Object[] arr = new Object[2];
		arr[0]=m;
		arr[1]=c;
		
		return arr;
	}
	*/
	
	//방법 2
	public Map<String, Object> returnTest() {
		Member m = new Member();
		Car c = new Car();
		
		Map<String, Object> map = new HashMap<>();
		map.put("memeber", m);
		map.put("car", c);
		
		return map;
	}
	
	//방법 3
	public MemInfo returnTest2() {
		Member m = new Member();
		Car c = new Car();
		
		MemInfo info = new MemInfo(m,c);
		
		return info;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
