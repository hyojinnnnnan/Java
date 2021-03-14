package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch12Q1 {

	public static void main(String[] args) {
		// 1번
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		System.out.println(a + " : " + Arrays.toString(a));
		// [I@79b4d0f : [0, 0, 0, 0, 0] -> 0으로 자동 초기화된 상태

		int indexNum = 0; // 0번 인덱스부터 값을 대입하기 위해 0으로 초기화
		while (indexNum < a.length) {
			System.out.print((indexNum + 1) + "'s 정수 : ");
			int inputNum = sc.nextInt();
			if (inputNum >= 0 && inputNum < 100) { // 입력받은 수가 0~99 사이에 있으면
				a[indexNum] = inputNum; // 해당 인덱스 번호에 값 대입
				indexNum++; // 인덱스 번호 증가
			} else { // 0~99사이의 수가 아니면
				System.out.println("0~99사이의 정수만 입력하세요!");
				// 인덱스 번호 증가 X
			}
		}
		System.out.println(a + " : " + Arrays.toString(a));

		// a배열 거꾸로 출력하기
		int[] b = new int[a.length]; // new 키워드를 사용한 deep copy
		for (int i = 0; i < b.length; i++) { // 배열의 길이만큼 반복하며
			b[i] = a[(a.length - 1) - i]; // a 요소값을 b 요소값으로 복사
		}
		System.out.println(b + " : " + Arrays.toString(b));
		
		sc.close();

	}

}