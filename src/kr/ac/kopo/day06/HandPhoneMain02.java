package kr.ac.kopo.day06;

public class HandPhoneMain02 {

	public static void main(String[] args) {
		Handphone[] hpArr=new Handphone[3];
		for(int i=0 ; i<hpArr.length ; i++) {
			//System.out.println(hpArr[i].name); 만 쓰면 예외발생 
			//문법적으로는 가능하지만 NullPointerException 발생
			//왜? 현재 가리키고 있는 값이 없기 때문에  
			
			//그럼 어떻게 써야 하지?
			hpArr[i]=new Handphone();
			//name, phone, company를 갖는 객체가 생성됨
		}
		
		/*
		 * line 6~15까지 한 번에 정리하면
		 * Handphone[] hpArr = new Handphone[]{new Handphone(), new Handphone(), new Handphone()};
		 */
		
		System.out.println(hpArr[2].name); //null
		hpArr[2].name="홍길동";
		System.out.println(hpArr[2].name); //홍길동
		System.out.println("===================");
		
		for(Handphone hp : hpArr) {
			System.out.printf("소유주명 : %s \n핸드폰 번호 : %s \n제조사 : %s \n", hp.name, hp.phone, hp.company);
			System.out.println("===================");
		}

	}

}
