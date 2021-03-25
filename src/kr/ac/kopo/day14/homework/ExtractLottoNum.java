package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/** 랜덤 로또번호 추출 */
public class ExtractLottoNum {
	Random r = new Random();

	/** ArrayList를 이용한 알고리즘 */
	protected void extract1() {
		List<String> list = new ArrayList<>(); // 리스트 생성
		while (true) { // 무한반복 (종료조건 line 17)
			String num = Integer.toString(r.nextInt(45) + 1); // 1~45 사이의 랜덤숫자 추출해서 String형으로 강제 형변환
			// POINT. 리스트는 중복을 허용하기 때문에 if조건을 통한 중복제거 과정이 필요
			if (!list.contains(num)) // 만약 리스트에 동일한 데이터가 없으면
				list.add(num); // 리스트에 추가
			// POINT. 리스트는 가변적인 배열이기 때문에 크기가 지정되지 않은 상황 -> 원소개수를 확인해서 7개면 종료하는 조건이 필요
			if (list.size() == 7) // 리스트의 총 원소개수가 7개면
				break; // 무한반복 종료
		}
		for (String str : list) // 1.5 버전의 for문을 이용한 출력
			System.out.print(str + "  ");
		System.out.println();
	}

	/** Array+ArrayList를 이용한 알고리즘 */
	protected void extract2() {
		int[] arr = new int[7];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;
		}
		List<String> list = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			String num = Integer.toString(arr[i]);
			if (!list.contains(num))
				list.add(num);
		}
		if (list.size() != 7) {
			while (true) {
				String num = Integer.toString(r.nextInt(45) + 1);
				if (!list.contains(num))
					list.add(num);
				if (list.size() == 7)
					break;
			}
		}
		for (String str : list)
			System.out.print(str + "  ");
		System.out.println();
	}

	/** HashSet을 이용한 알고리즘 */
	protected void extract3() {
		// Set은 순서가 없고 중복을 허용하지 않기 때문에 ArrayList처럼 별도의 중복제거 과정은 필요가 없음
		Set<String> set = new HashSet<>();
		while (true) {
			String num = Integer.toString(r.nextInt(45) + 1); // 1~45 사이의 랜덤숫자 추출해서 String형으로 강제 형변환
			set.add(num);
			// Set에서 add() 메소드의 반환값은 boolean
			// set은 중복을 허용하지 않기 때문에 중복된 데이터가 이미 존재한다면 false를 반환하고 set에 추가하지 않는다.
			if (set.size() == 7)
				break;
		}
		for (String str : set)
			System.out.print(str + "  ");
		System.out.println();
		/*
		 * line 69 -> 출력방법 2 
		 * Object[] objArr =set.toArray();
		 * System.out.println(Arrays.toString(objArr));
		 */
	}

	/** TreeSet을 이용한 알고리즘 */
	protected void extract4() {
		Set<String> treeSet = new TreeSet<>();
		while(treeSet.size()<7) {
			String num=Integer.toString(r.nextInt(45)+1);
			treeSet.add(num);
		}
		Object[] objArr =treeSet.toArray();
		System.out.println(Arrays.toString(objArr));
	}

}
