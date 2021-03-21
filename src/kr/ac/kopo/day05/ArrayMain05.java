package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		//shallow copy 
		int[] a = {10,20,30};
		int[] b;
		
		//shallow copy : 주소값을 복사
		b=a;
		
		//주소값 동일
		System.out.println("a 주소값 : "+a); //a 주소값 : [I@41a4555e
		System.out.println("b 주소값 : "+b); //b 주소값 : [I@41a4555e
		
		System.out.println("a : "+Arrays.toString(a)); //a : [10, 20, 30]
		System.out.println("b : "+Arrays.toString(b)); //b : [10, 20, 30]
		
		++b[0]; //배열 b의 0번째 인덱스 값 10을 10+1로 변경
		System.out.println("배열 b의 0번째 인덱스 값 10을 10+1로 변경");
		System.out.println("a : "+Arrays.toString(a)); //a : [11, 20, 30]
		System.out.println("b : "+Arrays.toString(b)); //b : [11, 20, 30]
		//배열 b의 요소를 변경했는데 a도 함께 영향을 받은 것을 확인할 수 있음
		
		System.out.println("======================");
		//deep copy : heap영역에 있는 배열공간을 복사
		b=new int[a.length]; 
		for(int i=0 ; i<b.length ; i++) { //배열의 길이만큼 반복하며
			b[i]=a[i]; //a 요소값을 b 요소값으로 복사 
		}
		//int[a.length] : 3개짜리 빈 공간이 만들어짐 (0으로 자동 초기화되어 있는 상태) 
		//b = : 3개짜리 빈 공간의 주소값을 stack영역에 존재하는 참조변수 b에 저장 
		
		//주소값 다름
		System.out.println("a 주소값 : "+a); //a 주소값 : [I@41a4555e
		System.out.println("b 주소값 : "+b); //b 주소값 : [I@3830f1c0
		
		System.out.println("a : "+Arrays.toString(a)); //a : [11, 20, 30]
		System.out.println("b : "+Arrays.toString(b)); //b : [11, 20, 30]
		
		++b[0]; //배열 b의 0번째 인덱스 값 11을 11+1로 변경
		
		System.out.println("배열 b의 0번째 인덱스 값 11을 11+1로 변경");
		System.out.println("a : "+Arrays.toString(a)); //a : [11, 20, 30]
		System.out.println("b : "+Arrays.toString(b)); //b : [12, 20, 30]
		//배열 b의 요소를 변경했지만 a는 영향을 받지 않음
		
		
		

	}

}
