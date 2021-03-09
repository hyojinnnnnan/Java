package personal.thisisjava.ch02;

public class LiteralExample {

	public static void main(String[] args) {
		//리터럴 : 소스 코드 내에서 직접 입력된 값 
		
		//1. 정수 리터럴 
		//소수점이 없는 정수 리터럴은 10진수로 간주
		int var1 = 10; //10진수
		System.out.println(var1); //10
		
		//0으로 시작되는 리터럴은 8진수로 간주
		int var2 = 010; //8진수
		System.out.println(var2); //1*8^1 + 0*8^0 = 8
		
		//0x 또는 0X로 시작하고 +  0~9 숫자나 A~F, a~f 로 구성된 리터럴은 16진수로 간주
		int var3 = 0x10; //16진수 
		System.out.println(var3); //1*16^1 + 0*16^0 = 16
		
		//2. 실수 리터럴
		//소수점이 있는 리터럴은 10진수 실수로 간주
		double var4 = 0.25; //10진수
		System.out.println(var4); //0.25
		
		//E 또는 e가 있는 리터럴은 10진수의 지수와 가수로 간주
		double var5 = 2e5; //10진수의 지수와 가수
		System.out.println(var5); //2*10^5 = 200000.0 
		
		//3. 문자 리터럴
		
	}

}
