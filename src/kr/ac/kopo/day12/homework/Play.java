package kr.ac.kopo.day12.homework;

public class Play {

	/**현 게임 승패*/
	static int result;
	/**누적 승리 횟수*/
	static int win;
	/**누적 패배 횟수*/
	static int lose;
	/**누적 비김 횟수*/
	static int noWinNoLose;

	/**
	 * 1부터 원하는 숫자 사이의 랜덤숫자 생성
	 * @param limit 원하는 숫자
	 * @return 랜덤 숫자
	 */
	public int myRandom(int limit) {
		int computer = (int) (Math.random() * limit) + 1;
		return computer;
	}

	/**전체 게임 승패 출력*/
	public final void printTotalResult() { //오버라이딩 금지
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.", win, lose, noWinNoLose);
	}

}
