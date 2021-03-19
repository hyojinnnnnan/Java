package kr.ac.kopo.day09.homework;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil { //최대한 java가 제공하는 기본 메소드를 사용하지 않고 로직을 구현하는데 초점
	
	Scanner sc=new Scanner(System.in);
	static char result;
	static int num1;
	static int num2;
	static String sentence;
	
	/**
	 * 원하는 메세지를 출력한 뒤 String 문자열 입력받는 메소드
	 * @param msg 원하는 메세지
	 * @return 입력한 문자열
	 */
	public String inputStr(String msg) {
		System.out.print(msg);
		String str=sc.nextLine();
		return str;
	}
	
	/**
	 * 원하는 메세지를 출력한 뒤 String 문자열 입력받아 0번째 인덱스를 char형으로 변환하는 메소드
	 * @param msg 원하는 메세지
	 * @return char형으로 변환된 String 문자열의 첫번째 글자
	 */
	public char strToChar(String msg) {
		System.out.print(msg);
		String str=sc.nextLine();
		char sToC=str.charAt(0);
		return sToC;
	}
	
	/**
	 * String 문자열을 char 배열로 변환하는 메소드
	 * @return char 배열로 변환된 String 문자열
	 */
	public char[] strToCharArr(String str) {
		char[] charArr=new char[str.length()]; //입력받은 문자열 크기만큼의 char 배열을 생성 
		for(int i=0; i<str.length() ; i++) { //문자열의 각 글자를 char 배열에 할당
			charArr[i]=str.charAt(i);
		}
		return charArr;
	}
	
	/**
	 * 원하는 메세지를 출력한 뒤 String 문자열 입력받아 int형으로 변환하는 메소드
	 * @param msg 원하는 메세지
	 * @return int형으로 변환된 String 문자열
	 */
	public int strToInt(String msg) {
		System.out.print(msg);
		String str=sc.nextLine();
		int sToI=Integer.valueOf(str);
		return sToI;
	}
	
	/**2개의 숫자를 각각 입력받는 메소드*/
	public void printTwicestrToInt() {
		num1=this.strToInt("첫번째 숫자를 입력하세요 : ");
		num2=this.strToInt("두번째 숫자를 입력하세요 : ");
	}
		
	/**
	 * 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 메소드
	 * @param c 입력한 char형 데이터
	 * @return 대문자 여부(T/F)
	 */
	public boolean isUpperChar(char c) {
		if(c>=65 && c<=90) { //아스키 코드 사용
			return true;
		}
		return false;
	}
	
	/**
	 * 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 메소드
	 * @param c 입력한 char형 데이터
	 * @return 소문자 여부(T/F)
	 */
	public boolean isLowerChar(char c) {
		if(c>=97 && c<=122) { //아스키 코드 사용
			return true;
		}
		return false;
	}
	
	/**
	 * 두개의 숫자를 입력받아 큰수를 반환하는 max(int i, int j) 메소드
	 * @param i 숫자1
	 * @param j 숫자2
	 */
	public void max(int i, int j) {
		int max=0;
		if(i>j) { //i가 더 크면
			max=i;
		}else if(j>i){ //j가 더 크면
			max=j;
		}else {
			System.out.println("동일한 숫자로 크기비교 불가");
		}
		System.out.println("더 큰 수는 "+max);
	}
	
	/**
	 * 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드
	 * @param i 숫자1
	 * @param j 숫자2
	 */
	public void min(int i, int j) {
		int min=0;
		if(i>j) { //i가 더 크면
			min=j;
		}else if(j>i){ //j가 더 크면
			min=i;
		}else {
			System.out.println("동일한 숫자로 크기비교 불가");
		}
		System.out.println("더 작은 수는 " +min);
	}
	
	/**
	 * 문자열을 거꾸로 변경하는 reverseString( String str ) 메소드
	 * @param str 거꾸로 변경하고 싶은 문자열
	 */
	public void reverseString(String str) { //char배열을 만들어서 String 문자열의 각 문자를 하나씩 할당
		char[] charArr=new char[str.length()];
		int idx=0;
		for(int i=str.length()-1; i>=0 ; i--) { //문자열의 각 글자를 char 배열에 할당
			charArr[idx]=str.charAt(i);
			idx++;
		}
		System.out.println(Arrays.toString(charArr));
	}
	
	/*
	public String reverseString(String str) { //빈 문자열에 기존 문자열을 거꾸로 붙이기
		String emptyStr="";
		for(int i=0; i<str.length() ; i++) {
			emptyStr+=str.charAt(str.length()-1-i);
		}
		return emptyStr;
	}
	*/
	
	/**
	 * 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드
	 * @param str 대문자로 변경하고 싶은 문자열
	 */
	public String  toUpperString( String str ) {
		char[] charArr=this.strToCharArr(str); //str.getChars(0, str.length(), charArr, 0);
		for(int i=0 ; i<str.length() ; i++) {
			if(this.isLowerChar(charArr[i])) { //소문자면
				charArr[i]=(char)((int)charArr[i]-32); //소문자에서 32를 빼면 대문자
			}
		}
		//System.out.println(Arrays.toString(charArr));
		return new String(charArr);
	}
	
	/**
	 * 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드
	 * @param str 소문자로 변경하고 싶은 문자열
	 */
	protected String toLowerString( String str ) {
		char[] charArr=this.strToCharArr(str);
		for(int i=0 ; i<charArr.length ; i++) {
			if(this.isUpperChar(charArr[i])) { //대문자면
				charArr[i]=(char)((int)charArr[i]+32); //대문자에서 32를 더하면 소문자
			}
		}
		//System.out.println(Arrays.toString(charArr)); 
		return new String(charArr);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**1번 문제 : 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환*/
	public void q1() {
		result=this.strToChar("대문자 판별을 원하는 문자 1개를 입력하세요 : "); 
		System.out.println("판별결과 : "+this.isUpperChar(result));
	}
	
	/**2번 문제 : 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환*/
	public void q2() {
		result=this.strToChar("소문자 판별을 원하는 문자 1개를 입력하세요 : ");
		System.out.println("판별결과 : "+this.isLowerChar(result));
	}
	
	/**3번 문제 : 두개의 숫자를 입력받아 큰수를 반환*/
	public void q3() {
		this.printTwicestrToInt();
		this.max(num1, num2);
	}
	
	/**4번 문제 : 두개의 숫자를 입력받아 작은수를 반환*/
	public void q4() {
		printTwicestrToInt();
		this.min(num1, num2);
	}
	
	/**5번 문제 : 문자열을 입력받아 거꾸로 변경*/
	public void q5() {
		sentence=this.inputStr("거꾸로 바꾸고 싶은 문자열을 입력하세요 : ");
		this.reverseString(sentence);
	}
	
	/**6번 문제 : 문자열을 입력받아 대문자로 변경*/
	public void q6() {
		sentence=this.inputStr("대문자로 바꾸고 싶은 문자열을 입력하세요 : ");
		System.out.println(this.toUpperString(sentence));
	}
	
	/**7번 문제 : 문자열을 입력받아 소문자로 변경*/
	public void q7() {
		sentence=this.inputStr("소문자로 바꾸고 싶은 문자열을 입력하세요 : ");
		this.toLowerString(sentence);
	}
	
}
