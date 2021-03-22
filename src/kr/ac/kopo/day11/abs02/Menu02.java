package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu02 {
	
	public int selectMenu() { //5번
		Scanner sc=new Scanner(System.in);
		System.out.println("[Level 2-2]");
		System.out.print("프린터를 입력하세요 (1.LG  2.삼성  3.HP) : ");
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
			p=new LG(); //묵시적 형변환
			break;
		case 2:
			p=new Samsung();
			break;
		case 3:
			//p=new HPInkjet();
			p=new HPLaser(); //변화에 둔감
			break;
		}
		
		if(p!=null) {
			p.startPrinter();
			p.print();			
		}else {
			System.out.println("올바르지 않은 선택값입니다.");
		}
		
	}
}
