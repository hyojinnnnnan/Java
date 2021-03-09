package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // ctrl + shift + o : 자동 import
		/*
		 * System.out : 표준 출력장치 (모니터) System.in : 표준 입력장치 (키보드)
		 */

		// 1단계 : "정수를 입력하세요" 문장 출력
		System.out.print("정수를 입력하세요 : ");

		// 2단계 : 키보드로 정수를 입력받아 -> 변수에 저장
		int num = sc.nextInt();

		// 3단계 : 결과 출력
		boolean result = false;
		/*
		 * 초기화 : 객체를 선언하고 값을 '최초'로 할당하는 것 https://wakestand.tistory.com/92 자바에서 초기화 하는
		 * 이유는? 클래스 영역에서 선언할 경우에는 컴파일러가 자동으로 값 할당하기 때문에 초기화를 생략할 수 있지만 메소드 영역에서 선언할 경우에는
		 * 자동으로 값이 할당되지 않기 때문에 초기화를 하지 않으면 에러가 발생한다.
		 */
		if (num > 0 && num % 2 == 0) { // ( )안의 조건이 참이라면
			result = true; // 해당 구문 실행
		} // ( )안의 조건이 거짓이라면 { } 안의 구문을 실행X

		System.out.println(num + "의 짝수 유무 : " + result);

	}

}
