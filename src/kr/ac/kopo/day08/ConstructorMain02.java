package kr.ac.kopo.day08;

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m=new Member();
		m.Member();
		//이름 : 알 수 없음, 나이 : -1, 혈액형 : 알 수 없음
		
		Member m2=new Member("안효진");
		m2.Member();
		//이름 : 안효진, 나이 : -1, 혈액형 : 알 수 없음
		
		Member m3=new Member("안효진",25);
		m3.Member();
		//이름 : 안효진, 나이 : 25, 혈액형 : 알 수 없음
		
		Member m4=new Member("안효진",25,"O형");
		m4.Member();
		//이름 : 안효진, 나이 : 25, 혈액형 : O형
	}

}
