package kr.ac.kopo.day09;

public class StringMain03_3 {

	public static void main(String[] args) {
		
		String str=new String("hello world");
		
		System.out.println("str : "+str);
		
		String subStr=str.substring(1,5);
		System.out.println("substring(1,5) : "+subStr);
		System.out.println("str : "+str);
		
		subStr=str.substring(6);
		System.out.println("substring(6) : "+subStr);
		
		System.out.println("========================");
		String str2=new String("!!!");
		String concatStr=str.concat(str2);
		System.out.println("str : "+str);
		System.out.println("str2 : "+str2);
		System.out.println("str.concat(str2) : "+concatStr);
		System.out.println("str+str2 : "+str+str2);
		
		System.out.println("========================");
		str=str.replace("ll", "rr");
		System.out.println("str.replace(\"ll\", \"rr\") : "+str);
		
		System.out.println("========================");
		str="            hi hyojin           ";
		System.out.println("str : "+str);
		str=str.trim();
		System.out.println("str.trim() : "+str); //문자열 중간의 공백은 제거되지x
		
		System.out.println("========================");
		str="Hello WorLd!!";
		System.out.println("str : "+str);
		System.out.println("toLowerCase() : "+str.toLowerCase());
		System.out.println("toUpperCase() : "+str.toUpperCase());
	}

}
