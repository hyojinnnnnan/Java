package kr.ac.kopo.day07.homework;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		int num1=cal.inputInt("정수1 : ");
		int num2=cal.inputInt("정수2 : ");
		System.out.println();
		
		cal.print(num1, num2);
		System.out.println();
		
		cal.primeNum(num1);
		cal.primeNum(num2);
	}

}
