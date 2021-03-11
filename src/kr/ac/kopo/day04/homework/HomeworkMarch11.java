package kr.ac.kopo.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 비교할까요? : ");
		int num = sc.nextInt();
		int[] intArr = new int[num]; //배열생성
		for(int i=0; i<intArr.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요 : ");
			intArr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(intArr));
		
		//1번. 3개의 정수를 입력받아 큰수에서 작은수 순으로 출력
		//1. 배열생성
		int[] arr = new int[3]; 
		//2. 사용자 숫자입력
		for(int i=0; i<3; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		//3. 크기비교
		int max; //큰 값 
		int mid; //중간값
		int min; //작은값
        if (arr[0] >= arr[1] && arr[0] >= arr[2]) {
            max = arr[0];
            if(arr[1] >= arr[2]) {
            	mid=arr[1];
            	min=arr[2];
            }else {
            	mid=arr[2];
            	min=arr[1];
            }
        } else if (arr[1] >= arr[0] && arr[1] >= arr[2]) {
            max = arr[1];
            if(arr[0] >= arr[2]) {
            	mid=arr[0];
            	min=arr[2];
            }else {
            	mid=arr[2];
            	min=arr[0];
            }
        } else {
            max = arr[2];
            if(arr[1] >= arr[0]) {
            	mid=arr[1];
            	min=arr[0];
            }else {
            	mid=arr[0];
            	min=arr[1];
            }
        }
        System.out.println(max+","+mid+","+min);
	}
	
	//2번. 

}
