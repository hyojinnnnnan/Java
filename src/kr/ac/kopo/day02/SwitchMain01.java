package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수 : ");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("ONE");
		} else if(num==2) {
			System.out.println("TWO");
		} else if(num==3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		
		//위에 처럼 동등비교인 경우 switch - case문을 사용
		
		System.out.print("====================="+"\n");
		switch(num)
		{
		case 1 :
			System.out.println("ONE");
		case 2 :
			System.out.println("TWO");
		case 3 :
			System.out.println("THREE");
		default : 
			System.out.println("ERROR");
		}
		/*
		 * 사용자가 입력한 수가 2면 swith case문이 끝날 때까지 모든 명령문 수행
		 * 즉, num이 2라면 출력값은 아래 값이 모두 출력됨
		 * 	TWO
		 * 	THREE
		 * 	ERROR
		 * 
		 * 그렇다면 num이 2라면 2만 출력하게 할 수는 없는걸까? -> break
		 * break를 만나는 순간 switch문의 가장 } 로 이동함
		 */
		
		System.out.print("====================="+"\n");
		switch(num)
		{
		case 1 :
			System.out.println("ONE");
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
		default : // case문을 모두 수행한 뒤 수행됨 
			System.out.println("ERROR");
		}
		/*
		 * num이 2라면 출력값은 TWO
		 * 하지만, num이 3이라면 출력값은 아래 값이 모두 출력됨
		 * 	THREE
		 * 	ERROR
		 */
		
		System.out.print("====================="+"\n");
		switch(num)
		{
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		default : // case 사이에 있어도 case문을 모두 수행한 뒤 수행됨 
			System.out.println("ERROR");
		case 3 :
			System.out.println("THREE");
			break;
		
		}

	}

}
