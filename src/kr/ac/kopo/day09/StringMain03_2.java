package kr.ac.kopo.day09;

public class StringMain03_2 {

	public static void main(String[] args) {
		
		String str=new String("hello world");
		System.out.println("검색대상 : "+str);
		
		int searchIdx=str.indexOf("o");
		System.out.println("\"o\" indexOf() : "+searchIdx);
		
		searchIdx=str.indexOf("p");
		System.out.println("\"o\" indexOf() : "+searchIdx);
		//없으면 -1을 반환
		
		searchIdx=str.indexOf("o",5); //index 5번부터 끝까지 검색
		System.out.println("\"o\" indexOf(5) : "+searchIdx);
		
		searchIdx=str.lastIndexOf("o");
		System.out.println("\"o\" lastIndexOf() : "+searchIdx);
		
		System.out.println("=============");
		System.out.println(str+"에서 \"l\"의 위치 구하기");
		char ch='l';
		
		/*
		searchIdx=str.indexOf(ch);
		while(searchIdx!=-1) {
			System.out.println(searchIdx);
			searchIdx=str.indexOf(ch,searchIdx+1);
		}
		이 구문을 간소화해보자! -> line 34~37 방식으로 많이 작성*/
		
		searchIdx=-1; //-1로 초기화한 이유 : 0번째 인덱스부터 검색해야 하기 때문에
		while((searchIdx=str.indexOf(ch, searchIdx+1))!=-1) {
			System.out.println(searchIdx);
		}
		//lastIndexOf 메소드를 사용해서 9, 3, 2가 출력되는 문제 풀어보기!
		
		
	}

}
