package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch12Q2 {

	public static void main(String[] args) {
		// 2번
		Scanner sc = new Scanner(System.in);

		System.out.print("짝수 몇개 입력 : ");
		int[] even = new int[sc.nextInt()];
		System.out.print("홀수 몇개 입력 : ");
		int[] odd = new int[sc.nextInt()];

		int inputCount = even.length + odd.length;
		int oddIndex = 0;
		int evenIndex = 0;

		for (int i = 1; i <= inputCount; i++) {
			System.out.print("num" + i + " : ");
			int num = sc.nextInt();

			if (num % 2 == 0) { // 입력받은 수가 짝수면 even으로
				if (evenIndex == even.length - 1) { // 짝수를 모두 입력했다면?
					System.out.println("짝수를 모두 입력하셨습니다.");
				}
				even[evenIndex] = num;
				evenIndex++;
			} else { // 입력받은 수가 홀수면 odd로
				if (oddIndex == odd.length - 1) { // 홀수를 모두 입력했다면?
					System.out.println("홀수를 모두 입력하셨습니다.");
				}
				odd[oddIndex] = num;
				oddIndex++;
			}
		}
		System.out.println(even + " : " + Arrays.toString(even));
		System.out.println(odd + " : " + Arrays.toString(odd));

		// 짝수배열 먼저 출력 후 + 홀수 배열 출력
		int[] evenOdd = new int[even.length + odd.length];
		System.arraycopy(even, 0, evenOdd, 0, even.length);
		System.arraycopy(odd, 0, evenOdd, even.length, odd.length);
		System.out.println(evenOdd + " : " + Arrays.toString(evenOdd));
		
		sc.close();

	}

}