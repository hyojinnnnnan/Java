package kr.ac.kopo.day03.homework;

public class HomeworkMarch10 {

	public static void main(String[] args) {
		
		//첫번째 행의 번호를 0, 두번째 행의 번호를 1 ... 이라고 가정하며 문제를 풀었습니다!
		
		//1번
		for (int i = 0 ; i < 5 ; i++) { //5행
			for (int j = 0 ; j < 5 ; j++) { //5열
				System.out.print(i+j+1);
			}
			System.out.println(); //다음 행으로 이동
		} //1번 끝
		
		System.out.print("=========\n");
		
		//2번 : 방법1
		for (int i = 0 ; i < 5 ; i++) { //5행, [i] 0 1 2 3 4 5
			for(int j = 0 ; j < 5 ; j++) { //5열, [j] 0 1 2 3 4
				System.out.print(j+5-i);
				/*
				 * 행이 바뀔 때마다 행에 속하는 열의 값이 행의 번호 값만큼 감소
				 * 행 번호 0 : (0+5)-0 (1+5)-0 (2+5)-0 (3+5)-0 (4+5)-0
				 * 행 번호 1 : (0+5)-1 (1+5)-1 (2+5)-1 (3+5)-1 (4+5)-1
				 * 행 번호 2 : (0+5)-2 (1+5)-2 (2+5)-2 (3+5)-2 (4+5)-2
				 */
			}
			System.out.println();
		} //2번 : 방법1 끝
		
		System.out.print("=========\n");
		
		//2번 : 방법2 
		for (int i = 0 ; i < 5 ; i++) { //5행
			for (int j = 5 ;  j < 10 ; j++) {  //5열, [j] 5 6 7 8 9
				System.out.print(j-i);  
				/*
				 * 행이 바뀔 때마다 행에 속하는 열의 값이 행의 번호 값만큼 감소
				 * 행 번호 0 : 5-0 6-0 7-0 8-0 9-0
				 * 행 번호 1 : 5-1 6-1 7-1 8-1 9-1
				 * 행 번호 2 : 5-2 6-2 7-2 8-2 9-2
				 */
			}
			System.out.println();
		} //2번 : 방법2 끝
		
		System.out.print("=========\n");
		
		//3번
		for (int i = 0 ; i < 5 ; i++) { //5행
			for (int j = 0 ; j < 5-i ; j++) { //5열
				System.out.print("*");  
				/*
				 * 열이 반복되는 횟수가 행이 바뀔 때마다 5 4 3 2 1 로 감소
				 * 5를 기준으로 행의 번호 값만큼 감소한다는 사실을 알 수 있음
				 * 행 번호 0 : 5번 반복
				 * 행 번호 1 : 5-1=4번 반복
				 * 행 번호 2 : 5-2=3번 반복
				 */
			}
			System.out.println();
		} //3번 끝
		
		System.out.print("=========\n");
		
		//3번 : 응용1 
		for (int i = 0 ; i < 5 ; i++) { //5행
			for (int j = 0 ; j < 5-i ; j++) { //5열
				System.out.print("*");  
				/*
				 * 열이 반복되는 횟수가 행이 바뀔 때마다 5 4 3 2 1 로 감소
				 * 5를 기준으로 행의 번호 값만큼 감소한다는 사실을 알 수 있음
				 * 행 번호 0 : 5번 반복
				 * 행 번호 1 : 5-1=4번 반복
				 * 행 번호 2 : 5-2=3번 반복
				 */
			}
			for (int j=0 ; j < i ; j++) {
				System.out.print("^");
				/*
				 * 행 번호 0 : 0번 반복
				 * 행 번호 1 : 1번 반복
				 * 행 번호 2 : 2번 반복
				 */
			}
			System.out.println();
		} //3번 : 응용1 끝
		
		System.out.print("=========\n");
		
		//3번 : 응용2
		for (int i = 0 ; i < 5 ; i++) { //5행
			for (int j = 0 ; j < 4-i ; j++) { //5열
				System.out.print("^");  
				/*
				 * 행 번호 0 : 4번 반복
				 * 행 번호 1 : 3번 반복
				 * 행 번호 2 : 2번 반복
				 */
			}
			for (int j=0 ; j < i+1 ; j++) {
				System.out.print("*");
				/*
				 * 행 번호 0 : 1번 반복
				 * 행 번호 1 : 2번 반복
				 * 행 번호 2 : 3번 반복
				 */
			}
			System.out.println();
		} //3번 : 응용2 끝
		
		System.out.print("=========\n");
		
		//4번 : for 3 + if 1
		for (int i = 0 ; i < 9 ; i++) { //9행 : 1~5행(*증가), 6~9행으로 분리(*감소)
				if ( i < 5 ) { //1~5행, [i] 0 1 2 3 4
					for (int j = 0 ; j < i+1 ; j++) {
						System.out.print("*");
						/*
						 * 행 번호 0 : 1번 반복
						 * 행 번호 1 : 2번 반복
						 * 행 번호 2 : 3번 반복
						 * 행 번호 3 : 4번 반복
						 * 행 번호 4 : 5번 반복
						 */
					}
				} else { //6~9행, [i] 5 6 7 8
					for (int j = 0 ; j < 9-i ; j++) {
						System.out.print("*");
						/*
						 * i + 반복 횟수 = 9
						 * 행 번호 5 : 4번 반복
						 * 행 번호 6 : 3번 반복
						 * 행 번호 7 : 2번 반복 
						 * 행 번호 8 : 1번 반복
						 */
					}
				}
			System.out.println();
		} //4번 : for 3 + if 1 끝
		
		//4번 ; for 2 + if 1 방식으로도 풀어보기 :)
		
		System.out.print("=========\n");
		
		//5번 : for 5 + if 1 :)
		for (int a = 0; a < 9; a++) { // [a] 0 1 2 3 4 5 6 7 8
			if (a < 5) { // [a] 0 1 2 3 4
				for (int b = 0; b < a; b++) { // [공백] 0 1 2 3 4
					System.out.print("^");
				}
				for (int c = 0; c < 5 - a; c++) { // [*] 5 4 3 2 1
					System.out.print("*");
				}
			} else { // [a] 5 6 7 8 , 공백감소
				for (int b = 0; b < 8 - a; b++) { // [공백] 3 2 1 0
					System.out.print("^");
				}
				for (int c = 0; c < a - 3; c++) { // [*] 2 3 4 5
					System.out.print("*");
				}
			}
			System.out.println();
		} //5번 : for 5 + if 1 끝
		
		//5번 : for 3 + if 2, for 3 + if+1, for 2 + if 2 방식으로도 풀어보기 :)
		
		System.out.print("=========\n");
		
		//6번 : 방법1 :)
		for (int a = 0; a < 5; a++) { // [a] 0 1 2 3 4
			for (int b = 0; b < a; b++) { 
				System.out.print("^");
			}
			for (int c = 0 ; c < 5-a ; c++) { 
				System.out.print("*");
			}
			for (int c = 0 ; c < 4-a ; c++) { 
				System.out.print("*");
			}
			for (int b = 0; b < a; b++) { 
				System.out.print("^");
			}
			System.out.println();
		} //6번 : 방법1 끝
		
		System.out.print("=========\n");
		
		//6번 : 방법2 :)
		for (int a = 0; a < 5; a++) { // [a] 0 1 2 3 4
			for (int b = 0; b < a; b++) { 
				System.out.print("^");
			}
			for (int c = 0 ; c < 9-(a*2) ; c++) { 
				// a가 0일 때 c는 9번 반복, a가 1일 때 c는 7번 반복, a가 2일 때 c는 5번 반복 ...  a가 4일 때 c는 1번 반복 
				System.out.print("*");
			}
			for (int b = 0; b < a; b++) { 
				System.out.print("^");
			}
			System.out.println();
		} //6번 : 방법2 끝
		
	} //메인 메소드 끝

} //클래스 끝
