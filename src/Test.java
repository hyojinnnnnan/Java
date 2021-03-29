import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	int id;
	String name;
	String phone;

	Test() {

	}

	Test(int id, String phone) {
		this.id = id;
		this.phone = phone;
	}

	Test(String name) {
		this(1,"010-9016-6008");
		this.name = name;
	}

	public  Map<String, String> getter() { //메소드의 리턴값을 여러 개로 하고 싶으면? : Collection 객체의 Map을 활용
		Map<String, String> map = new HashMap();
		map.put("이름", this.name);
		map.put("핸드폰", this.phone);
		
		// Map의 key들을 Set에 모아서 반환
		Set<String> keys = map.keySet();
		System.out.println("출력방법 1");
		for(String key : keys) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		System.out.println("출력방법 2");
		for(Entry<String,String> e : entrySet) {
			System.out.println("key : "+e.getKey()+", value : "+e.getValue());
		}
		
		return map;
	}

	public static void main(String[] args) {
		Test t = new Test("안효진");
		System.out.println(t.getter());	
		
	}
}
