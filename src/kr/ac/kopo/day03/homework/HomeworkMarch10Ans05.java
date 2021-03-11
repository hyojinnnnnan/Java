package kr.ac.kopo.day03.homework;

/*
	*****
	-****
	--***
	---**
	----* (5행)
	---**
	--***
	-****
	*****
	(9행5열)
*/

public class HomeworkMarch10Ans05 {
	
	public static void main(String[] args) {
		
		//for 5 + if 1
		for (int i=1; i<=9 ; i++) {
			if(i<=5) { //1, 2, 3, 4, 5 
				for(int j=1 ; j<=i-1 ; j++) { //"-" 반복횟수 : 0, 1, 2, 3, 4 
					System.out.print("-");
				}
				for(int j=1 ; j<=6-i ; j++) { //"*" 반복횟수 : 5, 4, 3, 2, 1
					System.out.print("*");					
				}
			} else {
				
			}
			System.out.println();
		}
	}

}
