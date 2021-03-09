package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMarch09 {

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
		float result = (float)q1num1/q1num2; //3.6666667
		//방법1 : String.format() -> String 클래스의 format 메소드를 이용하여 출력할 형식을 지정, f앞에 숫자+1한 소숫점 자리를 반올림해서 출력
		String stringFormatResult = String.format("%.2f",result);
		System.out.println(q1num1+" / "+q1num2+" = "+stringFormatResult);
		//방법2 : Math.round() -> 소수점 첫번째 자리를 반올림하여 정수값을 리턴하는 함수
		System.out.println(q1num1+" / "+q1num2+" = "+Math.round(result*100)/100.0);
		/* 
		 *  Math.round(result) -> 4
		 *  Math.round(result*100) -> 367
		 *  Math.round(result*100)/100.0 -> 3.67
		 *  Math.round(result*100)/100 -> 3
		 */
		
		System.out.println(q1num1+" % "+q1num2+" = "+(q1num1%q1num2));
		
		
		System.out.print("==============="+"\n");
		
		//2번 문제
		System.out.print("반지름 : ");
		int q2num1 = sc.nextInt(); //반지름
		double area = Math.PI*Math.pow(q2num1,2); //넓이
		//Math.pow(밑,지수) 함수의 경우 함수의 입출력이 모두 실수형인 double형이기 때문에 결과값을 정수로 구하려면 형변환이 필요 
		double cir = 2*Math.PI*q2num1; //둘레
		System.out.println("반지름이 "+q2num1+"일 때 원 넓이는 "+area+", 원 둘레는 "+cir);
		
		System.out.print("==============="+"\n");
		
		//3번 문제
		System.out.print("물건값 : ");
		int q3num1 = sc.nextInt();
		System.out.print("지불한 금액 : ");
		int q3num2 = sc.nextInt();
		int charge = q3num2-q3num1; 
		
		if (charge<0) {
			//물건값보다 지불한 금액이 더 적으면
			System.out.println(-charge+"원이 부족합니다.");
		} else {
			System.out.println("거스름돈 : "+charge);
			int coin1000 = charge/1000;
			charge%=1000;
			if (coin1000!=0) {
				System.out.println("1000원 : "+coin1000);
			}
			
			int coin500 = charge/500;
			charge%=500;
			if (coin500!=0) {
				System.out.println("500원 : "+coin500);
			}
			
			int coin100 = charge/100;
			charge%=100;
			if (coin100!=0) {
				System.out.println("100원 : "+coin100);
			}
		
			int coin50 = charge/50;
			charge%=50;
			if (coin50!=0) {
				System.out.println("50원 : "+coin50);
			}
				
			int coin10 = charge/10;
			charge%=10;
			if (coin10!=0) {
				System.out.println("10원 : "+coin10);
			}			
		} 
		
		System.out.print("==============="+"\n");
		
		//4번 문제 - if문 version
		System.out.print("첫번째 정수 : ");
		int q4num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int q4num2 = sc.nextInt();
		System.out.print(q4num1+"은 "+q4num2+"의 배수? : ");
		
		int remainder = q4num1%q4num2;
		if (remainder==0) {
			System.out.print("참");
		} else {
			System.out.print("거짓");
		}
		
		//4번 문제 - 조건연산자 version
		System.out.println(", "+ ((remainder==0) ? "true" : "false"));
		
	}

}
