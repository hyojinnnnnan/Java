package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMarch12Q5 {

	public static void main(String[] args) {
		//5번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 라인 수 : ");
		int line=sc.nextInt();
		
		if(line%2==0) {
			line-=1;
		} 
		int point=(line/2)+1; //구분점
	
		for(int i=0 ; i<point ; i++) {
			for(int j=0; j<point-i ; j++) { //1번째 라인부터 구분점까지 * 감소
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0 ; i<line-point ; i++) { //구분점 이후 * 증가
			for(int j=0 ; j<2+i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	
		sc.close();
	}

}