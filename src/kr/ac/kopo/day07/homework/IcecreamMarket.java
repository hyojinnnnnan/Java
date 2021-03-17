package kr.ac.kopo.day07.homework;

import java.util.Scanner;

/**
 * Icecream2Ans, IcecreamMain2Ans 클래스에서 사용되는 기능클래스로
 * 
 * @author Hyojin An
 *
 */
public class IcecreamMarket {
	
	Scanner sc=new Scanner(System.in);
	
	/**Icecream2Ans는 제품명과 가격을 멤버변수로 가지고 있음*/
	Icecream02Ans[] iceArr;
	
	/**
	 * 원하는 메세지를 출력한 뒤 int형 자료를 입력받는 메소드
	 * @param msg 함께 출력할 메세지
	 * @return 입력한 int형 데이터
	 */
	int inputInt(String msg) {
		System.out.print(msg);
		int num=sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	/**
	 * 원하는 메세지를 출력한 뒤 String형 자료를 입력받는 메소드
	 * @param msg 함께 출력할 메세지
	 * @return 입력한 String형 데이터
	 */
	String inputString(String msg) {
		System.out.print(msg);
		String str=sc.nextLine();
		return str;
	}
	
	/**
	 * 아이스크림의 구매정보를 입력받고 해당 정보를 모두 출력하는 메소드
	 */
	void doSomething() {
		//손님 아이스크림 구매
		this.buy();
		
		//구매정보 출력
		this.info();
	}
	
	/**아이스크림의 구매정보를 입력받는 메소드*/
	void buy() {
		int count=inputInt("아이스크림 몇 개 구입할래? : ");
		iceArr=new Icecream02Ans[count];
		for(int i=0 ; i<iceArr.length ; i++) {
			System.out.printf("====%d번째 아이스크림 구매정보==== \n", i+1);
			iceArr[i]=new Icecream02Ans();
			String name= inputString("제품명 : ");
			int price = inputInt("가격 : ");
			iceArr[i].set(name, price);
		}
	}
	
	void info() {
		System.out.printf("====총 %d개의 아이스크림 구매정보 출력==== \n", iceArr.length);
		System.out.printf("번호 \t 제품명 \t 가격 \n");
		int no=1; 
		for(Icecream02Ans ice : iceArr) {
			//System.out.printf("%d \t %s \t %d \n", no++ , ice.name, ice.price);
			//.멤버변수 형식으로 접근하는 방식은 좋은 방식이 아님 -> 메소드의 리턴값으로 접근하자 -> getName()과 getPrice()를 만들고 아래처럼 고쳐보자
			System.out.printf("%d \t %s \t %d \n", no++ , ice.getName(), ice.getPrice());
		}
	}
}
