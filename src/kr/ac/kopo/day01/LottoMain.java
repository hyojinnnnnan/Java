package kr.ac.kopo.day01;

public class LottoMain {

	public static void main(String[] args) { //LottoMain : 메인 메소드를 가지고 있는 실행클래스
		
		LottoUtil util = new LottoUtil();
		
		util.todayLotto();
		
		int randomNum = util.getNum();
		System.out.println(randomNum);

	}

}
