package kr.ac.kopo.day12.homework;

public class Dice extends Play implements Game {

	int computer = myRandom(6); // 1~6 사이의 난수 생성

	public Dice() {
		System.out.print("주사위 값 맞추기 게임입니다.\n1~6 사이의 값 중 하나를 선택하세요. \n>>");
	}

	@Override
	public int startGame(int user) {
		if (user == computer) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}

	@Override
	public void printResult() {
		if (result == 0) {
			super.lose++;
			System.out.println("You Lose :(");
		} else {
			super.win++;
			System.out.println("You Win :)");
		}
	}

}
