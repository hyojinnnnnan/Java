package kr.ac.kopo.day10.homework.Q1;

import java.util.Scanner;

public class Customer {

	Scanner sc = new Scanner(System.in);
	private Icecream ice;
	private static int countCustomer;

	public void newCustomer() {
		Customer.countCustomer += 1;
		ice = new Icecream();
		ice.buy();
		System.out.print("계속 구매할래? (y/n) : ");
		String ans = sc.next();
		if (ans.equalsIgnoreCase("y")) { //대소문자를 구분하지 않고 알파벳이 같은지만 보려면 equalsIgnoreCase()를 사용
			System.out.println();
			this.newCustomer();
		}
	}

	public void printTotalInfo() {
		System.out.println("총 " + Customer.countCustomer + "명의 고객이 아이스크림을 구매했습니다.");
		ice.printTotalInfo();
	}
}
