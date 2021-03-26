package kr.ac.kopo.day15;

//주차타워에서 사람과 차를 관리하려고 한다.

import java.util.HashMap;
import java.util.Map;

class Member2 { //사람
	private String name;
	private String phone;
	
	public Member2(){
		super();
	}
	
	public Member2(String name, String phone){
		super();
		this.name=name;
		this.phone=phone;
	}

	/*
	//Source -> Override/Implement Methods
	@Override
	public boolean equals(Object obj) { //.equals(m2) -> Member2 m2 = new Member2("가길동", "010.1234.5678"); -> Object obj = = new Member2("가길동", "010.1234.5678");의 묵시적 형변환이 일어나고 있음 (line 115)
		boolean matchResult=false; //다르다
		
		//this.name.equals(obj.name); -> 이렇게 쓰면 오류 : Object의 자식 클래스인 Member의 멤버변수인 name을 접근하기 위해서는 명시적 형변환이 필요함
		Member2 mem = (Member2)obj; //명시적 형변환 
		if(name.equals(mem.name) && phone.equals(phone)) {
			matchResult=true;
		}
		return matchResult;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+phone.hashCode();
	}
	*/
	
	//Source -> Generate hashCode() and equals() 로 line 24 ~ line 40 과정 축소가능
	//이름과 전화번호가 같아야만 같은사람이라고 인식하는 걸로 만들었음
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member2 other = (Member2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

}

class Car2 { //차
	private String model;
	private String id;
	
	public Car2(){
		
	}
	
	public Car2(String model, String id) {
		super();
		this.model = model;
		this.id = id;
	}
}

public class MapMain02_2 {

	public static void main(String[] args) {
		
		Map<Member2, Car2> carList = new HashMap<Member2, Car2>();
		
		carList.put(new Member2("가길동", "010.1234.5678"), new Car2("소나타", "12가3456"));
		carList.put(new Member2("나길동", "010.1234.5678"), new Car2("제네시스", "34나5678"));
		carList.put(new Member2("다길동", "010.1234.5678"), new Car2("카니발", "56다7890"));		
		System.out.println("등록대수 : "+carList.size()); //3
		
		//line 22~41을 안만들면
		//가길동이 차를 바꾸면 -> 키 중복 허용 안함 -> 같은 키를 갖는 데이터가 중복되면 최신값으로 업데이트 
		carList.put(new Member2("가길동", "010.1234.5678"), new Car2("SM3", "12가0000"));
		System.out.println("등록대수 : "+carList.size()); //근데 중복된 값 체크 못하고 값이 증가하지? -> put은 주소값을 체크 중 -> 근데, new로 인해 주소값이 달라짐 -> 다른 사람으로 인식
		//만든 다음에는 제대로 3라고 나옴 
		
		//키의 주소가 아닌 키의 값을 비교해야 함 -> equals() 사용 
		//즉, 주소 값이 아닌 그 안의 멤버변수의 값을 비교할 때는 == 이 아니라 Object의 equals()를 오버라이딩해서 사용해야 함 (Object의 equals()는 주소값을 비교하는 메소드로 구현되어 있음) -> line 24
		//서로가 같다고 인식하려면 equals()가 true이면서 해시코드 값도 같아야 함 -> line 37
		//(번외. String 클래스는 equals()를 이미 이렇게 구현해 놓은 상태)
		Member2 m = new Member2("가길동", "010.1234.5678");
		Member2 m2 = new Member2("가길동", "010.1234.5678");
		if(m.equals(m2)) {
			System.out.println("같은 사람");			
		}else {
			System.out.println("다른 사람");
		}
		
	}

}
