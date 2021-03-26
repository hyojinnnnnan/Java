package kr.ac.kopo.day15.inputOutputAPI;


public class Dog{
	private String name;
	private int age;
	private String kind;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, int age, String kind) {
		super();
		this.name=name;
		this.age=age;
		this.kind=kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	//Source -> Generate toString()
	@Override
	//오버라이딩 안하면 Object의 toString() 메소드가 호출되서 line 32에 주소값이 출력될 것 
	public String toString() { 
		return "Dog [name=" + name + ", age=" + age + "]";
	}
}
