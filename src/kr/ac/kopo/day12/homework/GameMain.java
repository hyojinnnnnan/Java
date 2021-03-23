package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game;
		String menu;
		int userChoice;

		do {
			System.out.print("게임을 선택하세요 \nA. 가위바위보 \nB. 주사위 값 맞추기 \nC. 종료 \n>> ");
			menu = sc.next();
			sc.nextLine();
			System.out.println();
			
			switch (menu) {
			case "A":
				game = new ScissorsRockPaper();
				userChoice = sc.nextInt();
				game.startGame(userChoice);
				game.printResult();
				break;
			case "B":
				game = new Dice();
				userChoice = sc.nextInt();
				game.startGame(userChoice);
				game.printResult();
				break;
			case "C":
				System.out.println("게임을 종료합니다.");
				Play p = new Play();
				p.printTotalResult();
				break;
			}
			System.out.println();
		} while (!menu.equals("C"));

	}

}
