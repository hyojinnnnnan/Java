import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) { //static 메소드 영역
		char[] charArr= {'t','d','e','f','D','F'};
		for(int i=0 ; i<charArr.length ; i++) {
			if((int)charArr[i]>=97 && (int)charArr[i]<=122) { //소문자면
				charArr[i]=(char) ((int)charArr[i]-32);
			}
		}
		System.out.println(Arrays.toString(charArr));
		
	}
}