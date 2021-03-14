package kr.ac.kopo.day04.homework;

//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 2번
		System.out.print("정수 4개 입력 : ");
		int max = 0;
		for (int i = 1; i <= 4; i++) {
			int num = sc.nextInt();
			if (i == 1 || max < num) { // 첫번째로 입력받는 수는 무조건 max값으로 할당
				max = num;
			}
		}
		System.out.println("max : " + max);

	}
}
