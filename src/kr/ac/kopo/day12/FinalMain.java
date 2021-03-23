package kr.ac.kopo.day12;

import java.util.Random;

class Super{ //클래스 앞 final 사용 시 '자식 클래스 생성 불가' 
	
	private int max=100;
	private final int MAX2=101; //변수 앞 final은 '상수'
	
	public void info() {
		System.out.println("Super 클래스 메소드");
		max=50;
		//MAX2=51; 에러발생 -> The final field Super.max2 cannot be assigned
	}
	
	public final void info2() { //메소드 앞 final 사용 시 '오버라이딩 불가'
		System.out.println("Super 클래스 final 메소드");
	}
}

class Sub extends Super{
	
	@Override
	public void info() {
		System.out.println("Sub 클래스에서 Super 클래스 메소드 재정의");
	}
	
	/* 에러발생 -> Cannot override the final method from Super
	public void info2() {
		System.out.println("Sub 클래스에서 Super 클래스 final 메소드 재정의");
	}
	*/
}

class MyRandom extends Random{
	/**
	 * bound가 10일 때 1~10사이의 난수 추출
	 * @param bound 난수 범위
	 * @return 1~bound 사이의 난수
	 */
	@Override
	public int nextInt(int bound) { //Random 클래스의 nextInt 메소드를 오버라이드
		return super.nextInt(bound)+1; //원래 .nextInt(int a)는 0~a까지의 난수를 생성  
	}
	
}

public class FinalMain {

	public static void main(String[] args) {
		
		Random r=new Random(); 
		int random=r.nextInt(100)+1; //1~100사이의 난수생성
		//System.out.println("랜덤 숫자(1~100) : "+random);
		//이렇게 만들기 귀찮아서 1부터 시작하는 나만의 랜덤 숫자를 뽑아내는 클래스를 만들어 편하게 사용하려고 함 -> line 35에 있는 MyRandom 클래스
		
		r=new MyRandom();
		random=r.nextInt(3);
		System.out.println("랜덤 숫자(1~100) : "+random);

	}

}
