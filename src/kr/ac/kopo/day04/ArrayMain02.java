package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		//1, 2, 3, 4, 5를 가지는 배열 arr 생성
		int[] arr = new int[5];
		
		//방법1
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//방법2
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		//방법3
		System.out.println(Arrays.toString(arr));
	}

}
