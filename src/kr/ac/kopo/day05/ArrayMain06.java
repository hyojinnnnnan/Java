package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain06 {

	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		int[] b = {5,7,8,9,20,23};
		//원하는 출력값 {10,20,30,5,7,7,8,9,20,23}
		
		//deep copy!!!!!
		int[] c = new int[a.length + b.length]; //new를 사용하는 이유를 잘 생각해보자
		
		/*요소값 복사방법 1
		for(int i=0 ; i<a.length ; i++) {
			c[i] = a[i];
		}
		
		for(int i=0 ; i<b.length ; i++) {
			c[a.length+i]=b[i];
		}
		*/
		
		/*요소값 복사방법 2
		int loc=0;
		for(int i=0; i<a.length ; i++) {
			c[loc++] = a[i];
		}
		for(int i=0 ; i<b.length ; i++) {
			c[loc++] = b[i];
		}
		*/
		
		//요소값 복사방법 3
		//System.arraycopy(원본배열,원본배열의 복사시작 위치, 복사할 배열, 복사 받을 시작 위치, 총 복사할 갯수(전체면 생략))
		System.arraycopy(a, 0, c, 0, a.length);
		System.out.println("c : "+Arrays.toString(c));
		//출력값은 c : [10, 20, 30, 0, 0, 0, 0, 0, 0]
		//요소값이 복사되지 않은 곳은 자동으로 초기화 된 0 값이 존재한다는 것을 알 수 있다.
		//이제 b배열의 요소값을 복사해서 0인 곳에 넣어보자
		System.arraycopy(b, 0, c, a.length, b.length); //a의 크기가 3이라면 c 배열에는 인덱스 2번까지 값이 복사된 상태
		System.out.println("c : "+Arrays.toString(c));
		//출력값은 c : [10, 20, 30, 5, 7, 8, 9, 20, 23]

	}

}
