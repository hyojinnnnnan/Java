package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu {
	
	public int selectMenu() { //5번
		Scanner sc=new Scanner(System.in);
		System.out.println("[Level 2-1]");
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
		
		Printer p=null;
		//자식의 인스턴스 객체의 주소값을 부모가 가질 수 있다
		
		switch(no) {
		case 1:
			//LG lg=new LG();
			p=new LG();
			/* [객체 형변환]
			 * LG lg=new LG();일 때와 p=new LG(); 일 때 차이점은?
			 */
			
			//lg.print();
			p.print();
			
			break;
		case 2:
			//Samsung sam=new Samsung();
			p=new Samsung();
			
			//sam.print();
			p.print();
			
			break;
		}
	}
}
