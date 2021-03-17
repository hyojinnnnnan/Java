package kr.ac.kopo.day07.homework;

import java.util.Scanner;

import kr.ac.kopo.day06.homework.Icecream;

/**
 * 아이스크림 입출력 관련 기능클래스
 * @author Hyojin An
 *
 */
public class Icecream02 {
	
	Scanner sc=new Scanner(System.in);
	/**제품명*/
	String name;
	/**가격*/
	int price; 
	/**아이스크림 가격의 합*/
	int totalPrice;
	/**제품과 가격 정보를 가지고 있는 아이스크림을 저장하는 배열*/
	Icecream02[] iceArr;

	/**멤버변수로 저장된 제품명을 반환*/
	String getName() {
		return name;
	}
	
	/**멤버변수로 저장된 가격을 반환*/
	int getPrice() {
		return price;
	}
	
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
		String str=sc.next();
		sc.nextLine();
		return str; 
	}
	
	/**
	 * 아이스크림 정보(제품명, 가격)를 입력받는 메소드
	 * @param num 아이스크림 개수
	 * @return num개의 아이스크림 정보를 가지고 있는 배열
	 */
	Icecream02[] inputIceCream(int num) {
		iceArr=new Icecream02[num];
		for(int i=0 ; i<num ; i++) {
			System.out.printf("====%d번째 아이스크림 구매정보==== \n", i+1);
			iceArr[i]=new Icecream02(); //이 부분 이해 안가면 package kr.ac.kopo.day06 -> HandPhoneMain02 확인하기
			iceArr[i].name = inputString("제품명 : ");
			iceArr[i].price = inputInt("가격 : ");	
		}
		System.out.println();
		return iceArr;
	}
	
	/**
	 * 아이스크림 정보를 입력하고 전체 출력하는 메소드
	 * @param num 아이스크림 개수
	 */
	void printAll(int num) {
		iceArr=this.inputIceCream(num);
		System.out.printf("====총 %d개의 아이스크림 구매정보 출력==== \n", num);
		System.out.printf("번호 \t 제품명 \t 가격 \n");
		for(int i=0 ; i<iceArr.length ; i++) {
			//System.out.printf("%d \t %s \t %d \n", i+1 , iceArr[i].name, iceArr[i].price);
			//.멤버변수 형식으로 접근하는 방식은 좋은 방식이 아님 -> 메소드의 리턴값으로 접근하자 -> IcecreamMarket.java와 Icecream2Ans.java 확인하기
			System.out.printf("%d \t %s \t %d \n", i+1 , iceArr[i].getName(), iceArr[i].getPrice());
			totalPrice+=iceArr[i].price;
		}
		System.out.println("총 금액 : "+totalPrice);
	}
	
}
