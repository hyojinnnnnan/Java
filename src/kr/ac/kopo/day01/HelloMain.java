package kr.ac.kopo.day01;

import java.lang.System; //System.out.println

public class HelloMain {
	public static void main(String[] args) { // 이클립스 단축키 : 'main'+ctrl+space
		/*
		 * 출력 메소드 : 상수(정수,실수,문자,문자열,논리값)를 화면에 출력하는 것이 목표 
		 * 1) System.out.println() : 출력 후 enter
		 * 2) System.out.print() 
		 * 3) System.out.printf()
		 * 		%[-][간격]알파벳 
		 * 		%[전체자리수][.소수점이하자리수]f
		 * 		정수 : %d
		 * 		실수 : %f
		 * 		문자 : %c
		 * 		문자열 : %s
		 * 		논리값 : %b
		 */
		
		System.out.print(10+"\n"+20); 
		System.out.print("\n");
		System.out.printf("%d%c%d", 10,'\n',20);
		System.out.println();
		System.out.println();
		
		System.out.println("빼빼로"+"\t"+1500); // 5칸 기준으로 간격이 나누어져 있음 -> tab을 사용하여 다음 간격으로 이동 
		System.out.println("빠다코코넛"+"\t"+2000);
		System.out.println("허니버터맛 아몬드"+"\t"+2000);
		System.out.println();
		
		System.out.printf("%15s%d\n", "빼빼로", 1500);
		System.out.printf("%15s%d\n", "빠다코코넛", 1500);
		System.out.printf("%15s%d\n", "허니버터맛 아몬드", 1500);
		System.out.println();
		
		System.out.printf("%-15s%d\n", "빼빼로", 1500);
		System.out.printf("%-15s%d\n", "빠다코코넛", 1500);
		System.out.printf("%-15s%d\n", "허니버터맛 아몬드", 1500);
		System.out.println();
		
		System.out.printf("%-15s\t%d\n", "빼빼로", 1500);
		System.out.printf("%-15s\t%d\n", "빠다코코넛", 1500);
		System.out.printf("%-15s\t%d\n", "허니버터맛 아몬드", 1500);
		System.out.println();

		
	}
}
