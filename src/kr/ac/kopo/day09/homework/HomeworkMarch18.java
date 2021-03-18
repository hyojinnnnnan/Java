package kr.ac.kopo.day09.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch18 {

	Scanner sc = new Scanner(System.in);

	public char strToChar(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		char sToC = str.charAt(0);
		return sToC;
	}

	public static int checkChar(String strData, char ch) {
		int count = 0;
		for (int i = 0; i < strData.length(); i++) {
			if (strData.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static String removeChar(String oriStr, char delChar) {
		String emptyStr = "";
		for (int i = 0; i < oriStr.length(); i++) {
			if (oriStr.charAt(i) != delChar) {
				emptyStr += oriStr.charAt(i);
			}
		}
		return emptyStr;
	}

	public static void main(String[] args) {

		HomeworkMarch18 hw = new HomeworkMarch18();

		// 주어진 문자열에서 특정 문자 찾기
		char ch = hw.strToChar("주어진 문자열에서 검색할 문자를 입력하세요 : ");
		System.out.println(hw.checkChar("Hello World Java", ch));

		// 주어진 문자열에서 특정 문자 제거하기
		ch = hw.strToChar("주어진 문자열에서 삭제할 문자를 입력하세요 : ");
		System.out.println(hw.removeChar("Hello World Java", ch));
	}

}
