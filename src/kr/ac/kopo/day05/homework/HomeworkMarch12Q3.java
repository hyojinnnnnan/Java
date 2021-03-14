package kr.ac.kopo.day05.homework;

import java.util.Arrays;

public class HomeworkMarch12Q3 {

	public static void main(String[] args) {
		// 3번 (3월 11일 5번 문제)
		// 소수 : 1과 자기자신 외에는 약수를 가지지 않는 1보다 큰 자연수
		int[] primeNum = new int[99];
		int index = 0;
		
		for (int judgeNum = 2; judgeNum <= 100; judgeNum++) { // judgeNum은 소수인지 아닌지 판단할 정수(판단정수)
			int factor = 0; // 판단정수의 약수개수를 저장할 변수
			for (int div = 1; div <= judgeNum; div++) { // div는 판단정수를 나누는 수
				if (judgeNum % div == 0) {
					factor++; // div가 judgeNum의 약수면 약수개수를 저장하는 변수 factor를 1증가
				}
			}
			if (factor == 2) { // 약수의 개수가 2개면
				primeNum[index] = judgeNum; // 소수를 저장하는 배열에 추가
				index++;
			}
		}
		
		//출력방법1
		int[] printArr = new int[index];
		for (int i = 0; i < index; i++) {
			printArr[i] = primeNum[i];
		}
		System.out.println(Arrays.toString(printArr));
		//출력방법2 : Arrays.copyOf(내가 복사하려는 배열, 줄이고 싶은 배열의 크기)
		primeNum = Arrays.copyOf(primeNum, index); //line 13에서 primeNum 배열이 갖고있던 주소와 다른 주소를 가지고 있음
		System.out.println(Arrays.toString(primeNum)); 

	}

}