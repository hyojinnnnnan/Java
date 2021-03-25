package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class Lotto extends ExtractLottoNum2{
	
	public void play() {
		Scanner sc=new Scanner(System.in);
		System.out.print("게임 횟수 입력 : ");
		int playGame=sc.nextInt();
		for(int play=1; play<=playGame ; play++) {
			System.out.print("게임 "+play+" : ");
			//super.extract1();
			///*or*/super.extract2();
			/*or*/super.extract3();
			///*or*/super.extract4();
		}
	}

}
