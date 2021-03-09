package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test01 {
	/*
	 * 집에서 출발한 시간이 
	 * - 8시 이전이면 : 걸어서 
	 * - 8시 15분 이전이면 : 버스타고 
	 * - 8시 15분 이후면 : 택시타고
	 * 
	 * 집에서 출발한 시간 입력 양식 - 예) 8시 5분이면 : 805 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("집에서 출발한 시간 : ");
		int time = sc.nextInt();

		if (time <= 805) {
			System.out.println("도보이용");
		} else if (time <= 815) {
			System.out.println("버스이용");
		} else {
			System.out.println("택시이용");
		}

	}
}