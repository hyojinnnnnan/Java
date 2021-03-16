package kr.ac.kopo.day07;

import java.util.Scanner;

/**
 * 구구단과 관련된 메소드를 모아놓은 기능클래스
 * @author Hyojin An
 *
 */
public class Gugudan {
	
	Scanner sc=new Scanner(System.in);
	
	//print라는 메소드의 리턴값은 없음(출력한 다음에 결과값을 다시 알려줄 필요가 없기 때문에) : 메소드의 반환값은 void
	
	/**
	 * 특정 단의 구구단을 출력
	 * @param dan 출력하고자 하는 단(int)
	 */
	void print(int dan) { 
		System.out.printf("====%d단==== \n", dan);
		for(int i=1 ; i<=9 ; i++) {
			System.out.printf("%d * %d = %d \t \n", dan, i, dan*i);
		}
		System.out.println();
	}
	
	/**
	 * 전체 구구단을 출력
	 */
	void print() { //메소드 오버로딩 : line 13의 메소드와 메소드명은 동일하지만 매개변수가 다름
		/*
		for(int dan=2 ; dan<=9 ; dan++) {
			System.out.printf("====%d단==== \n", dan);
			for(int i=1 ; i<=9 ; i++) {
				System.out.printf("%d * %d = %d \t \n", dan, i, dan*i);
			}
			System.out.println();
		}
		*/
		
		/*
		//line 15의 메소드를 이용하여 line 28~34를 아래와 같이 줄일 수 있음	
		for(int dan=2 ; dan<=9 ; dan++) {
			this.print(dan); 
			//객체명=this -> 자기참조 객체 (this. 은 생략가능)
			//print()를 호출할 때 사용하는 객체와 동일한 객체를 사용하기 때문에 this를 사용
		}
		*/
		
		//line 55의 메소드를 이용하여 line 38~43을 아래와 같이 줄일 수 있음
		this.print(2,9); 
		
	}
	
	/**
	 * 시작단에서 종료단까지 구구단을 출력
	 * @param startDan 시작단
	 * @param endDan 종료단
	 */
	void print(int startDan, int endDan) {
		for(int dan=startDan ; dan<=endDan ; dan++) {
			print(dan); //this. 은 생략
		}
	}
	
	/**
	 * 원하는 단을 입력
	 * @param msg 함께 출력할 메세지
	 * @return 입력한 단
	 */
	int getDan(String msg) {
		System.out.print(msg);
		//Scanner sc=new Scanner(System.in); -> Gugudan 클래스를 쓰는 동안에는 반복해서 쓰이기 때문에 멤버변수로 선언하는 것이 더 나음 (line 12) 
		int dan=sc.nextInt();
		sc.nextLine();
		return dan;
	}
}
