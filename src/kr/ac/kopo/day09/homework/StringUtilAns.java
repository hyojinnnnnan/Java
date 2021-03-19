package kr.ac.kopo.day09.homework;

public class StringUtilAns {

	/**
	 * 문자열을 거꾸로 변경하는 메소드
	 * 
	 * @param 변경할 문자열 (예. ABC)
	 * @return 변경될 문자열 (예. CBA)
	 */
	public String reverseString(String str) {
		
		//내가 처음 작성한 코드와 동일한 방법을 사용한 코드는 '방법1'
		
		/*방법1 : char[] -> String은 변하지 않는 고정된 문자열이기 때문에 원본 자체를 수정할 수 없어서 배열을 사용
		char[] chars = new char[str.length()];
		for (int i = str.length() - 1, j = 0; i >= 0; i++) {
			chars[j++] = str.charAt(i); //charAt(i)는 수정x 조회o
		}
		return new String(chars);
		*/
		
		/*방법2 : StringBuffer
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1, j = 0; i >= 0; i++) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
		*/
		
		//방법3
		int length=str.length();
		char[] chars = new char[length];
		str.getChars(0, str.length(), chars, 0);
		for(int i=0, j=length-1 ; i<length/2 ; i++, j--) { //메소드가 반복적으로 호출되는 경우 변수로 선언하는 것이 좋음 -> int length=str.length();
			char temp=chars[i];
			chars[i]=chars[j];
			chars[j]=temp;
		}
		return new String(chars);
	}
	
	public String toUpperString(String str) {
		byte[] bytes=new byte[str.length()];
		for(int i=0 ; i<str.length() ; i++) {
			byte b=(byte)str.charAt(i);
			if(b>='a'&&b<='z') { //소문자라면?
				b=(byte)(b-('a'-'A'));
			}
			bytes[i]=b;  //int보다 byte가 더 작기 때문에 강제 형변환을 계속 해줘야 함
		}
		return new String(bytes);
	}

}
