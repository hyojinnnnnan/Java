package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {

		int num = 10;
		/*
		 * num = num + 1; 우선순위 : 산술연산자 > 대입연산자 num이라는 변수를 한 번만 쓸 수는 없을까?
		 */

		// 더한 다음에 대입할거야! : 복합대입연산자의 등장
		num += 1; // num = 11
		num -= 1; // num = 10
		num /= 2; // num = 5
		num %= 2; // num = 1

		System.out.println(++num); // 2, 출력하래 -> 뭘? -> 1을 더한 num을! -> (출력됨)
		System.out.println(num++); // 2, 출력하래 -> 뭘? -> num이라는 변수를! -> (출력됨) -> 거기다가 1을 더하래
		System.out.println(num); // 3
		// 속도(빠른쪽 >) : ++num > num++

	}

}
