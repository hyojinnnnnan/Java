package kr.ac.kopo.day13.homework.Q1;

import java.util.Scanner;

public class Lotto {

	static void lotto() throws LottoNumberException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1 || num > 45) {
			throw new LottoNumberException("LottoNumberException : 1 - 45 사이만 가능합니다. " + num + "은 올바르지 않습니다.");
		}

		System.out.println(num + "를 포함해서 로또번호들을 추출하겠습니다.");
		
	}
}
