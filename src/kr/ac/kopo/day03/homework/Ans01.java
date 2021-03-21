package kr.ac.kopo.day03.homework;

public class Ans01 {

	public static void main(String[] args) {
		
		int startCol = 1;
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= 5; j++) {
				if (j < startCol) {
					System.out.print('^');
				} else {
					System.out.print('*');
				}
			} 
			
			System.out.println();
			if (i < 5) {
				startCol++;
			} else {
				startCol--;
			}
			
		} 

	}

}
