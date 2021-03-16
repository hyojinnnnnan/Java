package kr.ac.kopo.day07.homework;

import java.util.Scanner;

/**
 * 사칙연산 관련 기능클래스
 * 
 * @author Hyojin An
 *
 */
public class Calculator {

	Scanner sc = new Scanner(System.in);

	/**
	 * 원하는 메세지를 출력한 뒤 float형 자료를 입력받는 메소드
	 * 
	 * @param msg 함께 출력할 메세지
	 * @return 입력한 float형 데이터
	 */
	int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	/**
	 * 더하기
	 * 
	 * @param num1 정수1
	 * @param num2 정수2
	 */
	void plus(int num1, int num2) {
		System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
	}

	/**
	 * 빼기
	 * 
	 * @param num1 정수1
	 * @param num2 정수2
	 */
	void min(int num1, int num2) {
		System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
	}

	/**
	 * 나누기 (결과값은 소수점 첫번째 자리까지 출력)
	 * 
	 * @param num1 정수1
	 * @param num2 정수2
	 */
	void div(int num1, int num2) {
		float result = (float) num1 / num2;
		System.out.printf("%d * %d = %.1f \n", num1, num2, result);
	}

	/**
	 * 곱하기
	 * 
	 * @param num1 정수1
	 * @param num2 정수2
	 */
	void mul(int num1, int num2) {
		System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
	}

	/**
	 * 정수 2개를 이용한 사칙연산 수행 및 결과값 출력
	 * 
	 * @param num1 정수1
	 * @param num2 정수2
	 */
	void print(int num1, int num2) {
		plus(num1, num2);
		min(num1, num2);
		mul(num1, num2);
		div(num1, num2);
	}

	/**
	 * num이 소수인지 아닌지 확인하는 메소드
	 * @param num 확인하고 싶은 숫자
	 */
	void primeNum(int num) {
		boolean result = true;
		for (int i=2 ; i < num ; i++) { // 2~num
			if (num % i == 0) {
				result = false;
				break;
			}
		}
		System.out.println(num+" 소수체크 : "+result);
	}
}
