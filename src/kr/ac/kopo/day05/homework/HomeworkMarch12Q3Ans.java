package kr.ac.kopo.day05.homework;

import java.util.Arrays;

public class HomeworkMarch12Q3Ans {

	public static void main(String[] args) {
		//3번
		//자기 앞에 존재하는 소수로만 나누었을 때 약수가 존재하지 않으면 소수이다!
		//나는 문제를 잘못 이해하고 푼 듯! (HomeworkMarch12Q3.java)
		
		int[] prime=new int[30];// 소수만 기억하는 배열
		int loc=0; // 배열에 저장된 소수의 개수(초기화 0의 개수 제외하기 위해 loc를 이용하여 마지막으로 저장된 소수의 인덱스 번호를 저장)
		
		for(int num=2; num<=100 ; num++) { // 2~100
			boolean flag=true;
			for(int i=0; i<loc ; i++) {
				if(num%prime[i]==0) {
					flag=false;
					break;
				}
			}
			if(flag) { //flag가 true면
				prime[loc++]=num;
			}
		}
		for(int i=0; i<loc ; i++) {
			System.out.print(prime[i]+" ");
			
		}
	}

}