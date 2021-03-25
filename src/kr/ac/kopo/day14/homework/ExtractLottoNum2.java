package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/** 랜덤 로또번호 추출 */
public class ExtractLottoNum2 {
	Random r = new Random();

	/** ArrayList 알고리즘 */
	protected void extract2() { // ArrayList는 중복을 허용
		List<String> list = new ArrayList<>();
		while (list.size()<7) {
			String num = Integer.toString(r.nextInt(45) + 1);
			if (!list.contains(num))
				list.add(num);
		}
		Object[] objArr = list.toArray();
		System.out.println(Arrays.toString(objArr));
	}

	/** HashSet 알고리즘 */
	protected void extract3() { // Set은 중복을 허용하지 않기 때문에 ArrayList와 달리 중복 데이터 확인 과정이 필요 없음
		Set<String> set = new HashSet<>();
		while (set.size()<7) {
			String num = Integer.toString(r.nextInt(45) + 1);
			set.add(num);
		}
		Object[] objArr = set.toArray();
		System.out.println(Arrays.toString(objArr));
	}

	/** TreeSet 알고리즘 */
	protected void extract4() {
		Set<String> treeSet = new TreeSet<>();
		while(treeSet.size()<7) {
			String num=Integer.toString(r.nextInt(45)+1);
			treeSet.add(num);
		}
		Object[] objArr =treeSet.toArray();
		System.out.println(Arrays.toString(objArr));
	}
	
	/** Array+ArrayList 알고리즘 */
	protected void extract1() { // ArrayList로만 사용해서 충분히 해결가능 -> extract2()
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

}
