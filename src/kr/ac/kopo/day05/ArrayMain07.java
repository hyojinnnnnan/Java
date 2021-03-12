package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50};
		
		for(int i=0 ; i<a.length ; i++) {
			a[i]+=100;
		}
		System.out.println(Arrays.toString(a));
		//[110, 120, 130, 140, 150]
		
		//1.5 버전의 반복문
		for(int num : a) { //한 번 for문 돌 때 int num = a[0~4] 하라는 의미
			num+=100; //num이라는 변수를 stack영역에 생성해서 a배열의 요소값 하나씩 복사해서 저장
			//num은 배열이 아니라 int형 단일변수!
			System.out.println(num); //따라서 출력하고 다시 반복문이 반복되면 다음 요소값이 num에 저장
		}
	
		System.out.println(Arrays.toString(a));
		//[110, 120, 130, 140, 150] -> 왜 100이 추가된 [210, 220, 230, 240, 250]이 아니지?
		//1.5 버전의 반복문은 값을 변경할 수 있는 용도가 아니라 출력하는 용도라고 생각하면 쉬움
	}

}
