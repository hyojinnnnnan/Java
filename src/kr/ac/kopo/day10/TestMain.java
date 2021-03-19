package kr.ac.kopo.day10;

import kr.ac.kopo.day09.homework.StringUtil;

public class TestMain {

	public static void main(String[] args) {
		
		StringUtil su=new StringUtil(); 

		System.out.println(su.toUpperString("hEllO")); //public 메소드이기 때문에 다른 패키지에서 접근가능
		
		//System.out.println(su.toLowerString("hEllO")); 
		//에러 : The method toLowerString(String) from the type StringUtil is not visible
		//toLowerString 메소드는 proteced형이기 때문에 다른 패키지의 클래스에서 사용하려면 상속관계여야 사용가능
		
	}

}
