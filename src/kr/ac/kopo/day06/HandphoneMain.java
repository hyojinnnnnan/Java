package kr.ac.kopo.day06;

public class HandphoneMain { //이 예제의 핵심은 line 28

	public static void main(String[] args) {
		Handphone hp=new Handphone();
		hp.name="홍길동";
		hp.phone="010-1111-1111";
		hp.company="삼성";
		
		Handphone hp2=new Handphone();
		hp2.name="윤길동";
		hp2.phone="010-2222-2222";
		hp2.company="에플";		
		
		Handphone hp3=new Handphone();
		hp3.name="한길동";
		hp3.phone="010-3333-3333";
		hp3.company="엘지";
		
		//출력할 때 너무 불편한데?
		System.out.printf("소유주명 : %s \n핸드폰 번호 : %s \n제조사 : %s \n", hp.name, hp.phone, hp.company);
		System.out.printf("소유주명 : %s \n핸드폰 번호 : %s \n제조사 : %s \n", hp2.name, hp2.phone, hp2.company);
		System.out.printf("소유주명 : %s \n핸드폰 번호 : %s \n제조사 : %s \n", hp3.name, hp3.phone, hp3.company);
		System.out.println("======================================");
		
		//hp, hp2, hp3를 요소로 가지고 있는 배열을 만들자
		Handphone[] hpArr={hp, hp2, hp3};
		
		//출력 version 1
		for(int i=0 ; i<hpArr.length ; i++) {
			System.out.printf("소유주명 : %s \n핸드폰 번호 : %s \n제조사 : %s \n", hpArr[i].name, hpArr[i].phone, hpArr[i].company);
		}
		System.out.println("======================================");
		
		//출력 version 2
		for( Handphone h : hpArr) {
			System.out.printf("소유주명 : %s \n핸드폰 번호 : %s \n제조사 : %s \n", h.name, h.phone, h.company);
		}
	}

}
