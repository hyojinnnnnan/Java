package kr.ac.kopo.day13.homework.Q1;

public class LottoMain {

	public static void main(String[] args) {
		
		try {
			Lotto.lotto(); // lotto( ) 메소드는 static 메소드로 선언
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
