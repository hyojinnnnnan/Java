package kr.ac.kopo.day10.homework.Q1;

import java.util.Scanner;

public class Icecream extends Product {

	Scanner sc = new Scanner(System.in);
	
	private static int count;
	private static int totalPrice;
	
	private Product[] icecream;

	public int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public String inputString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}

	public void buy() {
		int num = inputInt("아이스크림 몇 개 구입할래? : ");
		Icecream.count += num;
		icecream = new Icecream[num];
		for (int i = 0; i < icecream.length; i++) {
			System.out.println((i + 1) + "번");
			icecream[i] = new Icecream();
			String name = inputString("아이스크림 명 : ");
			int price = inputInt("아이스크림 가격 : ");
			icecream[i].setName(name);
			icecream[i].setPrice(price);
			Icecream.totalPrice += price;
		}
	}

	public void printTotalInfo() {
		System.out.println("판매된 아이스크림 총 개수 : " + Icecream.count);
		System.out.println("판매된 아이스크림 총 금액 : " + Icecream.totalPrice);
	}

}
