package kr.ac.kopo.day07.homework;

import kr.ac.kopo.day06.homework.Icecream;

/**
 * 제품명과 가격을 멤버변수로 갖고 있는
 * 아이스크림 입출력 관련 기능클래스(교수님 코드)
 * @author Hyojin An
 *
 */
public class Icecream02Ans {
	
	/**제품명*/
	String name;
	/**가격*/
	int price; 
	
	/**
	 * 매개변수로 입력받은 제품명과 가격을 Icecream2Ans의 멤버변수인 제품명과 가격에 할당
	 * @param name 사용자로부터 입력받은 제품명
	 * @param price 사용자로부터 입력받은 가격
	 */
	void set(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	/**멤버변수로 저장된 제품명을 반환*/
	String getName() {
		return name;
	}
	
	/**멤버변수로 저장된 가격을 반환*/
	int getPrice() {
		return price;
	}
	
}
