package kr.ac.kopo.day11.abs01;

import java.util.Scanner;

public class Menu {
	
	public int selectMenu() { //5번
		Scanner sc=new Scanner(System.in);
		System.out.println("[Level 1]");
		System.out.print("프린터를 입력하세요 (1.LG  2.삼성) : ");
		int no=sc.nextInt();
		sc.nextLine();
		return no;
	}
	
	public void choice() { //3번
		int type=selectMenu(); //4번
		print(type); //6번
	}
	
	public void print(int no) { //7번
		switch(no) {
		case 1:
			LG lg=new LG();
			lg.lgPrint();
			break;
		case 2:
			Samsung sam=new Samsung();
			sam.samPrint();
			break;
		}
	}
}
