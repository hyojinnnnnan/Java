package kr.ac.kopo.day04.homework;

//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4번
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.printf("%d는 소수입니다.", num);
		} else {
			System.out.printf("%d는 소수가 아닙니다.", num);
		}

	}
}
