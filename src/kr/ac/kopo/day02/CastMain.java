package kr.ac.kopo.day02;

public class CastMain {

	public static void main(String[] args) {
		
		System.out.println(10+20); //30
		/*
		 * int + int
		 * int형 값 30이 결과값으로 출력, 자바에서는 정수형은 int가 디폴트
		 */
		
		System.out.println('A'+20); //85
		/*
		 * 문자 + int
		 * 두 개의 타입이 다른 상황에서 더하기 연산자로 연겷했을 때 
		 * 데이터 타입이 더 큰 것을 따라가서 자동으로 'A'를 int로 묵시적 형변환
		 * System.out.println((int)'A'+20);
		 */
		
		System.out.println(12.3 + 45); //57.3
		/*
		 * double이 아닌 int로 결과값을 출력하고 싶으면?
		 * 기본적으로 큰 타입을 따라가기 때문에 명시적 형변환을 사용
		 */
		System.out.println((int)12.3 + 45); //57
		
		double num = 12;
		//int num2 = 12.34; 오류발생 double형을 int형에 넣기 위해서는 명시적 형변환을 사용 (double > int)
		int num2 = (int)12.34;
		System.out.println(num2); //12
	}

}
