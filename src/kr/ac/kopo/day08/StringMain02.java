package kr.ac.kopo.day08;

public class StringMain02 {

	public static void main(String[] args) {
		
		String str=new String();
		System.out.println("str : "+str);
		
		//char[]의 요소들을 하나의 문자열로 만들기
		char[] chars= {'a','b','c','d','e'};
		String str2=new String(chars);
		String str3=new String(chars, 1, 3);
		
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
		//byte[]의 요소들을 하나의 문자열로 만들기
		byte[] bytes= {97,98,99,100,101};
		String str4=new String(bytes);
		
		System.out.println("str4 : "+str4);

	}

}
