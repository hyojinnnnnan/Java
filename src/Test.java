import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 3;
		double result = (double)num1/num2; 
		
		//3.6666666666666665을 소수점 2번째 자리까지만 출력해보자!
		//방법1 : printf()
		System.out.printf("%d / %d = %.2f%n",num1,num2,result);
		//방법2 : String.format()
		String stringFormatResult = String.format("%.2f", result);
		System.out.println(num1+" / "+num2+" = "+stringFormatResult);
		//방법3 : Math.round()
		double mathRoundResult = Math.round(result*100)/100.0;
		System.out.println(num1+" / "+num2+" = "+mathRoundResult);
		
	}
}