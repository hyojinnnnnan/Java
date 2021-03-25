package kr.ac.kopo.day14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
	
	System.out.println("TreeSet");
	Set<String> set = new TreeSet<>();

	boolean bool=set.add("adf"); //add() 메소드의 리턴타입은 bool -> 새로운 값을 넣는 것에 성공하면 true 반환
	System.out.println("\"a\" 데이터 삽입 성공여부 : "+(bool? "성공" : "실패")); //성공
	set.add("cdf");
	set.add("bdf");
	set.add("edf");
	set.add("ddf");
	bool=set.add("adf");
	System.out.println("\"a\" 데이터 삽입 성공여부 : "+(bool? "성공" : "실패")); //실패 -> set은 중복을 허용하지 않기 때문에
	
	//TreeSet에서 문자열은 사전 순으로 자동 출력됨
	/*
	set의 전체 데이터 출력방식
	방법1. 1.5버전의 for문
	방법2. iterator() 이용
	방법3. toArray() 메소드 이용 : 배열로 저장해서 출력
	(set은 순서가 없기 때문에 인덱스를 이용한 출력방식은 사용불가)
	*/
	for(String str:set) {
		System.out.println(str);
	}
	System.out.println();
	
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	System.out.println();
	
	Object[] arr =set.toArray();
	System.out.println(Arrays.toString(arr));
	System.out.println();
}
}