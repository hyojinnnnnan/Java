package kr.ac.kopo.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
	public static void main(String[] args) {
	
	System.out.println("HashSet");
	Set<String> set2 = new HashSet<>();

	boolean bool=set2.add("adf"); //add() 메소드의 리턴타입은 bool -> 새로운 값을 넣는 것에 성공하면 true 반환
	System.out.println("\"a\" 데이터 삽입 성공여부 : "+(bool? "성공" : "실패")); //성공
	set2.add("cdf");
	set2.add("bdf");
	set2.add("edf");
	set2.add("ddf");
	bool=set2.add("adf");
	System.out.println("\"a\" 데이터 삽입 성공여부 : "+(bool? "성공" : "실패")); //실패 -> set은 중복을 허용하지 않기 때문에
	
	/*
	set의 전체 데이터 출력방식
	방법1. 1.5버전의 for문
	방법2. iterator() 이용
	방법3. toArray() 메소드 이용 : 배열로 저장해서 출력
	(set은 순서가 없기 때문에 인덱스를 이용한 출력방식은 사용불가)
	*/
	for(String str:set2) {
		System.out.println(str);
	}
	System.out.println();
	
	Iterator<String> ite = set2.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	System.out.println();
	
	Object[] arr =set2.toArray();
	System.out.println(Arrays.toString(arr));
	System.out.println();
}
}