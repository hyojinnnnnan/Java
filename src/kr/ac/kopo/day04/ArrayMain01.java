package kr.ac.kopo.day04;

import java.util.Scanner;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] arr;
		
		arr=new int[5]; //배열의 크기 = 5, arr[0] ~ arr[4]
		
		System.out.println("arr : "+arr); //arr배열의 시작 주소값
		
		System.out.print("====================\n");
		
		for(int i=0 ; i<arr.length ; i++) { //마지막 인덱스 번호 = 배열의 크기-1
			System.out.println((i+1)+"번째 정수 "+"arr["+i+"] : "+arr[i]); 
			//new 키워드를 통해 heap에 만들어진 영역은 초기화 없이도 디폴트 값으로 자동 초기화
		}
		
		System.out.print("====================\n");
		
		arr=new int[3]; //line 8에서 heap 영역에 만들어진 공간을 쓰는 것이 아니라, 새로운 공간을 생성 
		for(int i=0 ; i<arr.length ; i++) { //마지막 인덱스 번호 = 배열의 크기-1
			System.out.println((i+1)+"번째 정수 "+"arr["+i+"] : "+arr[i]); 
			//new 키워드를 통해 heap에 만들어진 영역은 초기화 없이도 디폴트 값으로 자동 초기화
		}
		
		System.out.print("====================\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int arrLength = sc.nextInt();
		arr = new int[arrLength];
		for(int i=0 ; i<arr.length ; i++) { //마지막 인덱스 번호 = 배열의 크기-1
			System.out.println((i+1)+"번째 정수 "+"arr["+i+"] : "+arr[i]); 
			//new 키워드를 통해 heap에 만들어진 영역은 초기화 없이도 디폴트 값으로 자동 초기화
		}
		
	}

}
