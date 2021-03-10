package kr.ac.kopo.day03;

public class LoopMain04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.print("=========\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.print("=========\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j + 1);
			}
			System.out.println();
		}

		System.out.print("=========\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j < 10; j++) {
				System.out.print(j - i);
			}
			System.out.println();
		}

		System.out.print("=========\n");
		
		for (int i = 0; i < 9; i++) { // [i] 0 1 2 3 4 5 6 7 8
			if (i < 5) { // [i] 0 1 2 3 4
				for (int j = 0; j < i + 1; j++) { // [*개수] 1 2 3 4 5
					System.out.print("*");
				}
			} else { // [i] 5 6 7 8
				for (int j = 0; j < 9 - i; j++) { // [*개수] 4 3 2 1
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.print("=========\n");

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
		}

		System.out.print("=========\n");
		//역피라미드 version 1
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
		}
		
		System.out.print("=========\n");
		//역피라미드 version 2
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
		}
		
		System.out.print("=========\n");
		
	}
}
