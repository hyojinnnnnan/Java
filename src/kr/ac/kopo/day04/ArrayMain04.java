package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		/*
		String s = new String("폴리텍");
		String s2 = new String("데이터분석");
		String s3 = new String("자바");
		
		이걸 배열로 간단하게 정리하면 -> line 17
		*/
		
		String[] strArr = {"폴리텍","데이터분석","자바"};
		
		/*
		line 17을 문법적으로 제대로 맞춰서 쓰면 
		String[] strArr= {new String("폴리텍"), new String("데이터"), new String("자바")}
		*/
		
		System.out.println("배열의 크기 : "+strArr.length); //3
		System.out.println();
		
		//strArr에 있는 3개의 문자열을 출력
		//방법1
		for(int i=0 ; i<strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();
		
		//방법2
		for(String str : strArr) {
			System.out.println(str);			
		}
		System.out.println();
		
		//방법3
		System.out.println(Arrays.toString(strArr));

	}

}
