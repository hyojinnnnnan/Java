package kr.ac.kopo.day08;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str="Hello World!";
		
		char[] chars=new char[str.length()];
		System.out.println("char[] chars : "+Arrays.toString(chars));
		for(int i=0; i<str.length() ; i++) { //.length() -> 문자열의 길이를 반환
			chars[i]=str.charAt(i); //.charAt(i) -> 문자열 중에서 i번째 문자를 반환
		} 
		//를 단축시키면 -> str.getChars(0,str.length(),chars,0);
		//.getChars(int sourceStart, int sourceEnd, char target[], int targetStart) -> 문자열의 일부를 문자배열로(target[]) 제공
		
		System.out.println(str+"의 길이 : "+str.length());
		System.out.println("0번째 위치한 문자 : "+str.charAt(0));
		System.out.println("7번째 위치한 문자 : "+str.charAt(7));
	}

}
