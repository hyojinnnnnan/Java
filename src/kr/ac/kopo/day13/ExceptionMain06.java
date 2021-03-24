package kr.ac.kopo.day13;

import java.util.Scanner;

public class ExceptionMain06 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("등록할 ID를 입력하세요 : ");
		String id=sc.nextLine();
		
		/*예외처리 미포함
		if(id.length()>8) {
			System.out.println("ID는 최대 8글자만 가능합니다.");
		}else {
			System.out.println("ID를 등록하였습니다.");			
		}
		*/
		
		/*예외처리 포함
		try {
			if(id.length()>8) {
				//throw new Exception(); -> 원래 에러가 '아닌데' 사용자가 throw를 통해 java.lang.Exception을 발생시킴 -> 그래서 e.getMessage()을 출력하면 NULL이 나옴
				throw new Exception("[ERROR] ID는 최대 8글자만 가능합니다.");
			}
			System.out.println("ID를 등록하였습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		//사용자 정의 예외 클래스를 사용 : CheckIDException.java
		try {
			if(id.length()>8) {
				throw new CheckIDException("[ERROR] ID는 최대 8글자만 가능합니다.");
			}
			System.out.println("ID를 등록하였습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
