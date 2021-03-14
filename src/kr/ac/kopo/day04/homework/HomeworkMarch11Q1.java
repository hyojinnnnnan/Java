package kr.ac.kopo.day04.homework;

//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1번
		System.out.print("정수 3개 입력 : ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();

		int min = one;
		int max = two;

		if (one > two) {
			min = two;
			max = one;
		}

		if (three > max) {
			System.out.printf("%d > %d > %d \n", three, max, min);
		} else if (min > three) {
			System.out.printf("%d > %d > %d \n", max, min, three);
		} else {
			System.out.printf("%d > %d > %d \n", max, three, min);
		}

	}
}
