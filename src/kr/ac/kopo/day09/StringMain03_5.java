package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain03_5 {

	public static void main(String[] args) {
		
		int num=123;
		
		//int형 123을 String형으로 바꾸려면?
		//String strNum=num+""; -> 이 방법은 꼼수
		String strNum=String.valueOf(num);
		System.out.println("strNum의 데이터 타입 : "+strNum.getClass().getName());
		
		//boolean bool=String.valueOf(true);
		//위 문장 에러발생 -> Type mismatch: cannot convert from String to boolean
		//true는 boolean형이지만 String.valueOf()로 인해 String형으로 바뀐 상태이기 때문
	}

}
