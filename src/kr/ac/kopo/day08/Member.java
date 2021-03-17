package kr.ac.kopo.day08;

public class Member {
	
	/**이름*/
	String name;
	/**나이*/
	int age;
	/**혈액형*/
	String bloodType;
	
///////////////////////////////////////////////////////////////////////////////////////
	
	//매개변수가 있는 생성자를 만들려면 매개변수가 없는 디폴트 생성자를 먼저 만드는 습관을 들일 것!
	
	/* 아래 생성자는 모두 3개의 변수를 초기화하고 있음 간단하게 만들어보자
	Member(){
		name="알 수 없음";
		age=-1;
		bloodType="알 수 없음";
	}
	
	Member(String name){
		this.name=name; //멤버변수와 지역변수의 이름이 동일해서 서로 구분하지 못할 때는 멤버변수에 this 키워드를 사용 
		age=-1;
		bloodType="알 수 없음";
	}
	
	Member(String name, int age){
		this.name=name; //멤버변수와 지역변수의 이름이 동일해서 서로 구분하지 못할 때는 멤버변수에 this 키워드를 사용 
		this.age=age;
		bloodType="알 수 없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name=name; //멤버변수와 지역변수의 이름이 동일해서 서로 구분하지 못할 때는 멤버변수에 this 키워드를 사용 
		this.age=age;
		this.bloodType=bloodType;
	}
	*/
	
	/* 음...이렇게 해도 -1과 "알 수 없음"이 거슬리네.. 더 간단하게 만들어보자!
	Member(String name, int age, String bloodType){
		this.name=name; //멤버변수와 지역변수의 이름이 동일해서 서로 구분하지 못할 때는 멤버변수에 this 키워드를 사용 
		this.age=age;
		this.bloodType=bloodType;
	}
	
	Member(){
		//여기에 sysout 구문 있으면 오류 발생 -> 왜? this구문이 생성자 내에서 첫번째 구문에 위치해야 하기 때문
		this("알 수 없음", -1, "알 수 없음");
	}
	
	Member(String name){
		this(name, -1, "알 수 없음");
	}
	
	Member(String name, int age){
		this(name, age, "알 수 없음");
	}
	*/
	
	//이 방법은 유지보수는 쉽지만 메소드(생성자이지만 편하게 메소드로 표기)를 계속 호출해서 속도가 느려진다는 단점이 있음
	Member(){
		this("알 수 없음");
	}
	
	Member(String name){
		this(name,-1);
	}
	
	Member(String name, int age){
		this(name, age, "알 수 없음");
	}
	
	Member(String name, int age, String bloodType){
		this.name=name; //멤버변수와 지역변수의 이름이 동일해서 서로 구분하지 못할 때는 멤버변수에 this 키워드를 사용 
		this.age=age;
		this.bloodType=bloodType;
	}
	
///////////////////////////////////////////////////////////////////////////////////////
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getBloodType() {
		return bloodType;
	}
	
	/**이름, 나이, 혈액형 출력*/
	void Member() { //반환타입이 있기 때문에 메소드
		System.out.println("이름 : "+getName()+", 나이 : "+getAge()+", 혈액형 : "+getBloodType());
	}

}
