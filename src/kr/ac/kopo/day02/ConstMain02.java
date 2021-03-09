package kr.ac.kopo.day02;

public class ConstMain02 {
	public static void main(String[] args) {
		
		char ch = 'A'; //문자 'A'를 char 타입의 변수 ch에 저장
		/*
		 * 변수에 문자가 저장되는 것 같지만, 사실은 문자가 아닌 문자의 유니코드(정수)가 저장된다.
		 * 컴퓨터는 숫자밖에 모르기 때문에 모든 데이터를 숫자로 변환하여 저장하는 것이다. 
		 * 따라서, 문자 'A'의 유니코드는 65이므로 변수 ch에는 65가 저장된다. 
		 */
		
		System.out.println("문자 : " + ch); //문자 : A
		/* 
		 * 그렇다면 위 문장에서는 왜 65가 아니라 A로 출력되지? 
		 * 문자열과 문자가 '더하기' 연산자로 연결된 경우 결과값은 문자열로 출력
		 */
		System.out.println(""+'A'+'B'); //AB
		
		char ch2 = 'B';
		System.out.printf("%c = %d(%#X)%n",ch2,(int)ch2,(int)ch2); //B = 66(0X42)
		/*
		 * %c : 'B'
		 * %d : ch2에 저장된 10진수 정수 값과
		 * %#X : 괄호 안에 'B'의 16진수 정수 값을 출력하고
		 * %n : 다음 행으로 이동
		 * (int)ch2 : 문자 'B'에 해당하는 유니코드 값을 알기 위해 ch2의 데이터 타입을 char에서 int로 명시적 형변환
		 */
		System.out.println(ch + 'B'); //131
		
		ch = 65; //문자의 코드를 직접 ch에 저장
		System.out.println("문자 : " + ch); //문자 : A
		
		//유니코드 값이 65인 문자를 ch에 저장하고 싶어
		ch = '\u0041'; //유니코드 값은 16진수 형태로 표현해야 함
		System.out.println("문자 : " + ch); //문자 : A
	}
}
