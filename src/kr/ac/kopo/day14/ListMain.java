package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
List : 순서(o), 중복(o)
인터페이스 List의 구현 클래스 : ArrayList, LinkedList
주요 메소드 : add, get, remove, size, clear, isEmpty, contains
*/

public class ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //묵시적 객체 형변환, 1.7 버전의 Generic 
		//1.5 버전의 Generic -> new ArrayList<String>()

		System.out.println("리스트의 원소 총 개수 : "+list.size());
		
		//입력한 순서대로 데이터가 저장됨 -> 리스트가 순서를 가지고 있다는 의미가 여기서 나옴
		list.add("one");
		//list.add(1); 에러 -> The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("four"); //리스트는 데이터의 중복허용
		
		System.out.println("add()를 통한 리스트 추가 작업 후 원소 총 개수 : "+list.size());
		
		System.out.println("============================================");
		
		/*
		리스트 전체 데이터 출력방법
		방법1. index를 이용한 get() 메소드
		방법2. 1.5 버전의 for문을 이용
		방법3. toArray() 메소드 : 리스트가 갖고 있는 모든 원소들을 고정된 길이의 배열로 저장
		방법4. iterator() 메소드
		*/
		
		//방법1
		System.out.println("<get()을 이용한 리스트 전체 데이터 출력>");
		for(int i=1; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//방법2
		System.out.println("<1.5버전의 for문을 이용한 리스트 전체 데이터 출력>");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println();
		
		//방법3 - 리스트에서 이 경우는 거의 사용하지 않음 
		System.out.println("<toArray()을 이용한 리스트 전체 데이터 출력>");
		//String[] arr = list.toArray(); 에러 -> Type mismatch: cannot convert from Object[] to String[]
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//방법4
		System.out.println("<iterator()을 이용한 리스트 전체 데이터 출력>");
		Iterator<String> ite = list.iterator(); //ite는 list에 접근하는게 목적
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("============================================");
		
		String searchStr="two";
		if(list.contains(searchStr)) {
			System.out.println(searchStr+"은 존재합니다.");
		}else {
			System.out.println(searchStr+"은 존재하지 않습니다.");
		}
		
		boolean bool=list.remove("two");
		System.out.println("remove : "+bool);
		System.out.println("<\"two\"삭제 후 리스트 전체 데이터 출력>");
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("============================================");
		
		System.out.println("첫번째 문자열 :"+list.get(0));
		String removeStr=list.remove(0);
		System.out.println("삭제된 문자열 : "+removeStr);
		System.out.println("remove(0) 후 첫번째 문자열 : "+list.get(0));
		
		System.out.println("원소 총 개수 : "+list.size());
		list.clear();
		System.out.println("clear() 후 원소 총 개수 :"+list.size());
	}

}
