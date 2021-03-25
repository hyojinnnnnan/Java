package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapMain {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap();

		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");

		// id가 aaa인 사람이 비밀번호를 1111에서 1234로 바꾸려고 함
		System.out.println(">>>비밀번호 변경을 시작합니다.<<<");

		// 사용자가 입력한 id 존재여부 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		if (!map.containsKey(id)) { // containsKey() 메소드 리턴값의 타입은 boolean
			System.out.println(">>>id가 존재하지 않습니다.<<<");
			System.out.println(">>>서비스를 종료합니다.<<<");
			System.exit(0);
		}
		System.out.println(">>>ID가 확인되었습니다.<<<");

		// id에 해당하는 비밀번호인지 key에 대한 value값 확인
		System.out.print("현재 패스워드 입력 :");
		String pw = sc.nextLine();
		if (!map.get(id).equals(pw)) {
			System.out.println(">>>패스워드가 일치하지 않습니다.<<<");
			System.out.println(">>>서비스를 종료합니다.<<<");
			System.exit(0);
		}
		System.out.println(">>>패스워드가 확인되었습니다.<<<");

		// key에 대한 value값 변경하기
		System.out.print("변경할 패스워드 입력 : ");
		String newPw = sc.nextLine();
		// set은 중복된 데이터가 있는 경우 입력을 허용하지 않지만, map은 key에 대한 중복을 허용하지 않는다.
		// key에 대한 중복된 데이터가 있으면 마지막으로 입력한 즉, 새로운 값으로 대체하고 기존 값을 반환한다.
		map.put(id, newPw);
		System.out.println(">>>패스워드가 변경되었습니다.<<<");

		System.out.println("=======================");
		System.out.println(">>>전체 회원정보 출력<<<");

		Set<Map.Entry<String, String>> entrySet = map.entrySet(); // entrySet은 set형
		for (Entry<String, String> e : entrySet) {
			System.out.println("ID : " + e.getKey() + ", PW : " + e.getValue());
		}
		
		System.out.println("-----------------------");
		// Map의 key들을 Set에 모아서 반환
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println("ID : " + key + ", PW : " + map.get(key));
		}

	}
}
