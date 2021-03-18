package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain03_4 {

	public static void main(String[] args) {
		
		String str=new String("홍길동전:허균:조선시대");
		String[] strArr=str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		//활용예제. ip를 구분해보자
		String ip="192.168.5.203";
		String[] ipArr=ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));
		
	}

}
