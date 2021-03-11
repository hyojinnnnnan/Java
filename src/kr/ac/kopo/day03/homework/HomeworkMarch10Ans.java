package kr.ac.kopo.day03.homework;

public class HomeworkMarch10Ans {
	// 스터디 겸용 :
	// https://www.notion.so/hyojinan/_3-12-bb02a9e3b568435b942974185671fb5a

	public static void main(String[] args) {
		/*
		 * https://github.com/jiyooLee/2021_kopo_java/blob/master/java/src/kr/ac/kopo/day04/exam/ExamMaIn02.java
		 * 문제1. 다이아몬드 찍기 (9행 9열) 
		 * 1행 : - 4개, * 1개 
		 * 2행 : - 3개, * 3개 
		 * 3행 : - 2개, * 5개 
		 * 4행 : -1개, * 7개 
		 * 5행 : - 0개, * 9개 (구분점) 
		 * 6행 : - 1개, * 7개 
		 * 7행 : - 2개, * 5개 
		 * 8행 : - 3개, * 3개 
		 * 9행 : - 4개, * 1개
		 */

		// 내 코드
		int k = 1;
		////////////////////////////////////////////////////
		for (int i = 1; i <= 9; i++) { // i는 행
			System.out.print(i + "행, k=" + k);
			if (i <= 5) { // 1~5행, if문 시작
				for (int j = 1; j <= 5 - i; j++) { // 규칙 : i+j=5
					System.out.print("-"); // j는 - 반복횟수
				}
				for (int j = 1; j <= (2 * i) - 1; j++) { // 규칙 : j=(2*i)-1
					System.out.print("*"); // j는 * 반복횟수
				}
				////////////////////////////////////////////////////
			} else { // 6~9행, if문 끝, else문 시작
				for (int j = 1; j <= i - 5; j++) { // 규칙 : j+5=i
					System.out.print("-"); // j는 - 반복횟수
				}
				for (int j = 1; j <= 9 - (2 * k); j++) { // 규칙 : 7 5 3 1
					// k값 초기화를 0으로 하면 j <= 7 - (2 * k)
					System.out.print("*"); // j는 * 반복횟수
				}
				k++;
			} // else문 끝
				////////////////////////////////////////////////////
			System.out.println(); // 다음 행으로!
		}

		System.out.print("============\n");

		// 교수님 코드분석_version1 : * 기준 
		int n = 1;
		////////////////////////////////////////////////////
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "행, n=" + n);
			for (int j = 1; j <= 5 - n; j++) {
				System.out.print('-');
			}
			for (int j = 1; j <= 2 * n - 1; j++) {
				System.out.print('*');
			}
			////////////////////////////////////////////////////
			// 다음 행을 위한 준비! : i는 현재 행을 나타내고 이미 출력된 상태
			if (i < 5) { // i<=5가 아닌 i<5인 이유는?
				n++; // 4행에서 5행으로 넘어갈 때는 n값이 증가해야 하지만
			} else {
				n--; // 5행에서 6행으로 넘어갈 때부터는 n값이 감소하기 때문에
			}
			////////////////////////////////////////////////////
			System.out.println(); // 다음 행으로!
		}

		// 교수님 코드분석_version2 : - 기준

		System.out.print("============\n");

		/*
		 * 문제2. 나비넥타이 찍기
		 * https://github.com/jiyooLee/2021_kopo_java/blob/master/java/src/kr/ac/kopo/day04/exam/ExamMain03.java
		 */

		// 교수님 코드분석

		// 내 코드

	}

}
