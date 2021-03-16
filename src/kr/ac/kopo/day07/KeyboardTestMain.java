package kr.ac.kopo.day07;

import java.util.Scanner;

public class KeyboardTestMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//출력
		System.out.print("문자 : ");
		//입력
		String str=sc.next();
		// 띄어쓰기가 포함된 문자열을 넣고 싶다면?
		sc.nextLine();
		
		//출력
		System.out.print("정수 : ");
		//입력
		int num=sc.nextInt();
		
		//출력 
		System.out.println("str : "+str);
		System.out.println("num : "+num);
	}

}
