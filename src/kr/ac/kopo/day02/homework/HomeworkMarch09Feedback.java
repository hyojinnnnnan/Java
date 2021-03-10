package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMarch09Feedback {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1번 문제
		System.out.print("첫번째 정수 : ");
		int q1num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int q1num2 = sc.nextInt();
		
		System.out.println(q1num1+" + "+q1num2+" = "+(q1num1+q1num2));
		System.out.println(q1num1+" - "+q1num2+" = "+(q1num1-q1num2));
		System.out.println(q1num1+" * "+q1num2+" = "+(q1num1*q1num2));
		
		//나누기의 결과값은 소수점 두번째 자리까지 출력
		double result = (double)q1num1/q1num2; //q1num1, q1num2 중 둘 중 하나만 형변환 double로 형변환해도 됨
		System.out.printf("%d / %d = %.2f%n", q1num1, q1num2, result);
		
		System.out.println(q1num1+" % "+q1num2+" = "+(q1num1%q1num2));
		
		System.out.print("==============="+"\n");
		
		//4번 문제
		System.out.print("첫번째 정수 : ");
		int q4num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int q4num2 = sc.nextInt();
		System.out.print(q4num1+"은 "+q4num2+"의 배수? : ");
		
		if (q4num2>0 && q4num1>0) {
			int remainder = q4num1%q4num2;
			if (remainder==0) {
				System.out.print("참");
			} else {
				System.out.print("거짓");
			}
			System.out.print(", "+ ((remainder==0) ? true : false));
			System.out.println(", "+(q4num1%q4num2==0));
		}else {
			System.out.print("0 또는 음수로는 배수 판단을 할 수 없습니다.");
		}
		
	}

}
