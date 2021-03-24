package kr.ac.kopo.day13;

import java.util.Scanner;

public class ExceptionMain07 {

	static void register() throws CheckIDException {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 ID를 입력하세요 : ");
		String id = sc.nextLine();

		if (id.length() > 8) {
			throw new CheckIDException("ID는 최대 8글자만 가능합니다.");
		}

		System.out.println("ID를 등록하였습니다.");
	}

	public static void main(String[] args) {

		try {
			register();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
