package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class IcecreamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구입할꺼야? : ");
		int num=sc.nextInt();
		System.out.println();
		
		Icecream[] iceArr=new Icecream[num];
		for(int i=0 ; i<iceArr.length ; i++) {
			iceArr[i]=new Icecream(); //제품명, 가격을 특징으로 갖는 객체를 num개 생성
			System.out.printf("<%d번째 아이스크림 구매정보 입력>\n", (i+1));
			System.out.print("제품명 : ");
			iceArr[i].name = sc.next();
			System.out.print("가격 : ");
			iceArr[i].price = sc.nextInt();
			System.out.println();
		}
		int totalPrice=0;
		System.out.printf("<총 %d개의 아이스크림 구매정보 출력>\n",num);
		System.out.printf("번호 \t 제품명 \t 가격 \n");
		for(int i=0 ; i<iceArr.length ; i++) {
			System.out.printf("%d \t %s \t %d \n", i+1 , iceArr[i].name, iceArr[i].price);
			totalPrice+=iceArr[i].price;
		}
		System.out.println("총 금액 : "+totalPrice);
	}
}
