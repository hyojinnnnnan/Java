package kr.ac.kopo.day05.homework;

import java.util.Arrays;

public class HomeworkMarch12Q4 {

	public static void main(String[] args) {
		// 4번
		// 1) 99개의 정수를 저장할 수 있는 배열을 생성
		int[] arr = new int[99];
		// 2) 2~100까지 값을 할당
		for (int i = 0; i < 99; i++) {
			arr[i] = i + 2;
		}
		System.out.println(Arrays.toString(arr));
		// 3) 소수의 배수는 소수가 아니라는 점을 이용하여 소수가 아닌 수를 0으로 바꾸기
		for (int i = 0; i < 99; i++) { // arr[0] ~ arr[98]
			int factor = 0; // 약수의 개수를 저장하는 변수
			for (int j = 1; j <= arr[i]; j++) { // j는 arr[i]를 나눌 수
				if (arr[i] % j == 0) { // j가 arr[i]의 약수라면
					factor++; // 약수의 개수를 1 증가
				}
			}
			if (factor == 2) { // arr[i]의 약수의 개수가 2개(1과 자기자신)라면
				for (int k = i + 1; k < 99; k++) { // arr[k]=arr[i+1] ~ arr[k]=arr[98] 중에서
					if (arr[k] != 0 && arr[k] % arr[i] == 0) { // 요소값이 0이 아니고 arr[i]의 배수인 것을 찾아
						arr[k] = 0; // 0으로 바꾸기
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}