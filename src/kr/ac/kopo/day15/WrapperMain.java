package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

public class WrapperMain {

	public static void main(String[] args) {

		int i = 123;
		Integer i2 = new Integer(123);
		Integer i3 = 123; // auto boxing : 기본자료형을 클래스형 객체로 포장
		int i4 = new Integer(123); // auto unboxing

		System.out.println(i); // 123
		// Cannot invoke getClass() on the primitive type int
		System.out.println("---------");
		System.out.println(i2); // 123
		System.out.println(i2.getClass().getName());
		System.out.println("---------");
		System.out.println(i3); // 123
		System.out.println(i3.getClass().getName());
		System.out.println("---------");
		System.out.println(i4); // 123
		// Cannot invoke getClass() on the primitive type int

		List<Integer> list = new ArrayList<>();
		// auto.unboxing
		list.add(1);
		list.add(2);
		list.add(3);

		///////////////////////////////////////////////////////

		String str = "1234";
		int num = Integer.parseInt(str);
		System.out.println(num + 100);

		int num2 = Integer.valueOf(str);
		System.out.println(num + 100);

		/*
		 * parseInt와 valueOf의 차이는 리턴값
		 * parseInt : 기본자료형 int값이 리턴
		 * valueOf : 참조자료형
		 * Integer가 리턴 auto boxing, auto unboxing이 지원되기 전에는 구분해서 써야 했지만 지금은 자유롭게 쓰면 됨
		 */
	}

}
