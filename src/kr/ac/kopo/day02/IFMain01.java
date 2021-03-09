package kr.ac.kopo.day02;

import java.util.Scanner;

public class IFMain01 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		// System.out.println("MAX : " + (a>b ? a : b));
		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
		
		System.out.print("====================="+"\n");
		
		// System.out.println("MAX : " + (c>d ? c : (c < d ? d : 0)));
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int c = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int d = sc.nextInt();
		
		if (c>d) { //c>d
			System.out.println(c+"는 "+d+"보다 큽니다.");
		}else { //c<=d
			if (c==d) { //c==d
				System.out.println("먼저 입력한 수 "+c+"와 다음으로 입력한 수 "+d+"는 동일한 수입니다.");
			}else { //c==d가 아닌 경우 남는 경우는 c<d인 경우 밖에 없음!
				System.out.println(c+"는 "+d+"보다 작습니다.");
			}
		}

	}

}
