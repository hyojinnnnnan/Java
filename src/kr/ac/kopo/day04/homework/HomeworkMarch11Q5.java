package kr.ac.kopo.day04.homework;

//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 5번
		for (int judgeNum = 2; judgeNum <= 100; judgeNum++) { // judgeNum은 소수인지 아닌지 판단할 정수(판단정수)
			int factor = 0; // 판단정수의 약수개수를 저장할 변수
			for (int div = 1; div <= judgeNum; div++) { // div는 판단정수를 나누는 수
				if (judgeNum % div == 0) {
					factor++; // div가 judgeNum의 약수면 약수개수를 저장하는 변수 factor를 1증가
				}
			}
			if (factor == 2) { // 약수의 개수가 2개면
				System.out.printf("%d \t", judgeNum);
			}
		}
	}
}
