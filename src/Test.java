public class Test {
	int id;
	Test(){
		
	}
	Test(int x){
		this.id=x;
	}
	public void set(int x) {
		this.id=x;
	}
	public int get() {
		return this.id;
	}
	
	public static void main(String[] args) {
		Test obj1= new Test(3);
		Test obj2 = new Test();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.get());
		System.out.println(obj2.get());
		System.out.println();
		
		obj1=obj2;
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.get());
		System.out.println(obj2.get());
		System.out.println();
		
		obj1.set(1);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.get());
		System.out.println(obj2.get());
		System.out.println();
	}
}
