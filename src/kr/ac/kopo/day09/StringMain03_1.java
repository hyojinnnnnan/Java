package kr.ac.kopo.day09;

public class StringMain03_1 {

	public static void main(String[] args) {

		System.out.println("new 키워드를 통해 생성");
		String str1 = new String("hello");
		String str2 = new String("hello");
		// str3와 str4는 new키워드를 통해 생성 -> 각각의 공간을 가리킴

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		// 주소비교
		if (str1 == str2) {
			System.out.println("str1==str2");
		} else {
			System.out.println("str1!=str2");
		}

		System.out.println("======================");

		// 주소비교가 아니라 같은 문자열을 가지고 있는지 비교하고 싶기 때문에 -> boolean equals(Objectstr), boolean
		// equalsIgnoreCase(String str)

		System.out.println("new 키워드를 통해 생성");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		boolean bool = str1.equals(str2);
		if (bool) {
			System.out.println("equals() : str1==str2");
		} else {
			System.out.println("equals() : str1!=str2");
		}

		System.out.println("======================");

		str1 = new String("Hello");
		str2 = new String("hello");

		System.out.println("new 키워드를 통해 생성");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		bool = str1.equals(str2);
		if (bool) {
			System.out.println("equals() : str1==str2");
		} else {
			System.out.println("equals() : str1!=str2");
		}

		System.out.println("======================");

		System.out.println("new 키워드를 통해 생성");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		bool = str1.equalsIgnoreCase(str2);
		if (bool) {
			System.out.println("equalsIgnoreCase() : str1==str2");
		} else {
			System.out.println("equalsIgnoreCase() : str1!=str2");
		}

		System.out.println("======================");

		System.out.println("new 키워드를 사용하지 않음");
		String str3 = "hello";
		String str4 = "hello";
		// str3과 str4는 new를 사용하지 않음 -> 하나의 공간을 같이 가리킴

		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);

		// 문자열 비교
		if (str3 == str4) {
			System.out.println("str1==str2");
		} else {
			System.out.println("str1!=str2");
		}

		System.out.println("======================");

		str1 = "hello!!";
		str2 = "Hello world";
		// str1과 str2가 hello로 시작되는지 알고 싶을 때 -> boolean startsWith(String str)

		String sub = "hello";

		// str1에 들어있는 문자열이 sub에 들어있는 문자열로 생성되니?
		bool = str1.startsWith(sub);

		if (bool) {
			System.out.println(str1 + "은 " + sub + "로 시작합니다.");
		} else {
			System.out.println(str1 + "은 " + sub + "로 시작하지 않습니다.");
		}

		// str2에 들어있는 문자열이 sub에 들어있는 문자열로 생성되니?
		bool = str2.startsWith(sub);

		if (bool) {
			System.out.println(str2 + "은 " + sub + "로 시작합니다.");
		} else {
			System.out.println(str2 + "은 " + sub + "로 시작하지 않습니다.");
		}

		// file의 확장자가 .txt인지 알고 싶을 때
		String fileName = new String("hello.txt");
		bool = fileName.endsWith(".txt");
		if (bool) {
			System.out.println(fileName + "의 확장자는 .txt 입니다.");
		} else {
			System.out.println(fileName + "의 확장자는 .txt 가 아닙니다.");
		}

		// 길이 비교가 아닌 알파벳 순으로 문자 순서를 비교하고 싶을 때(쉽게 생각해서 사전)
		str1 = "boat";
		str2 = "board";
		int compare = str1.compareTo(str2);
		if (compare == 0) {
			System.out.println(str1 + "은 " + str2 + "과 동일함");
		} else if (compare < 0) {
			System.out.println(str1 + "은 " + str2 + "보다 사전 상 앞에 위치");
		} else { // compare>0
			System.out.println(str1 + "은 " + str2 + "보다 사전 상 뒤에 위치");
		}

		System.out.println("======================");

		String[] names = { "강길동", "홍길동", "홍길순", "김길동", "윤길동", "박홍철", "홍길동" };

		int personCount = 0;
		System.out.println(">>>이름이 홍길동인 사람을 검색합니다<<<");
		// Arrays.toString을 사용하기에는 올바르지 않음
		for (int i = 0; i < names.length; i++) { // names는 배열이기 때문에 .length()가 아닌 .length
			if (names[i].equals("홍길동")) {
				personCount++;
				System.out.println(names[i]);
			}
		}
		System.out.println("홍길동은 총 " + personCount + "명 존재합니다.");
		System.out.println();

		personCount = 0;
		System.out.println(">>>성이 홍인 사람을 검색합니다<<<");
		for (String name : names) {
			if (name.startsWith("홍")) {
				personCount++;
				System.out.println(name);
			}
		}
		System.out.println("홍씨는 총 " + personCount + "명 존재합니다.");
		System.out.println();

		personCount = 0;
		System.out.println(">>>이름이 길동인 사람을 검색합니다<<<");
		for (String name : names) {
			if (name.endsWith("길동")) {
				personCount++;
				System.out.println(name);
			}
		}
		System.out.println("이름이 길동인 사람은 총 " + personCount + "명 존재합니다.");
		System.out.println();

		personCount = 0;
		System.out.println(">>이름에 홍이 포함된 사람을 검색합니다<<");
		for (String name : names) {
			if (name.contains("홍")) {
				personCount++;
				System.out.println(name);
			}
		}
		System.out.println("이름에 홍이 포함된 사람은 총 " + personCount + "명 존재합니다.");
		System.out.println();
	}

}
