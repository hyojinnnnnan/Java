package kr.ac.kopo.day12.homework;

public class ScissorsRockPaper extends Play implements Game {

	final static int SCISSORS = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	int computer = myRandom(3); // 1~3 사이의 난수생성

	public ScissorsRockPaper() {
		System.out.print("가위바위보 게임입니다.\n가위바위보 중 하나를 선택하세요. (1:가위, 2:바위, 3:보) \n>>");
	}

	@Override
	public int startGame(int user) {
		if (computer == SCISSORS) {
			switch (user) {
			case ROCK:
				result = 1;
				break;
			case PAPER:
				result = 0;
				break;
			}
		} else if (computer == ROCK) {
			switch (user) {
			case SCISSORS:
				result = 0;
				break;
			case PAPER:
				result = 1;
				break;
			}
		} else if (computer == PAPER) {
			switch (user) {
			case SCISSORS:
				result = 1;
				break;
			case ROCK:
				result = 0;
				break;
			}
		}

		if (computer == user) {
			result = 2;
		}

		return result;
	}

	@Override
	public void printResult() {
		if (result == 0) {
			lose++;
			System.out.println("You Lose :(");
		} else if (result == 1) {
			win++;
			System.out.println("You Win :)");
		} else {
			noWinNoLose++;
			System.out.println("No Winner!!!");
		}
	}

}
