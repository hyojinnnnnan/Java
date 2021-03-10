package kr.ac.kopo.day03;

public class LoopMain04 {

	public static void main(String[] args) {
		for(int i=1;i<=5;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("=========\n");
		
		for(int i=0;i<5;++i) { 
			for(int j=0;j<i+1;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("=========\n");
		
		for(int i=0;i<5;++i) { 
			for(int j=0;j<5-i;++j) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("=========\n");
		
		for(int i=0;i<5;++i) { 
			for(int j=0;j<5;j++) { 
				System.out.print(i+j+1);
			}
			System.out.println();
		}
		
		System.out.print("=========\n");
		
		for(int i=0;i<5;++i) { 
			for(int j=5;j<10;j++) {
				System.out.print(j-i);
			}
			System.out.println();
		}
		
		System.out.print("=========\n");
		
		//for3+if1
		for(int i=0;i<9;++i) { //[i] 0 1 2 3 4 5 6 7 8
			if (i<5) { //[i] 0 1 2 3 4
				for(int j=0;j<i+1;j++) { //[*개수] 1 2 3 4 5
					System.out.print("*");
				}
			}else { //[i] 5 6 7 8
				for(int j=0;j<9-i;++j) { //[*개수] 4 3 2 1
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.print("=========\n");
		
		//for5+if1
		//for3+if2
		//for3+if1
		//for2+if2
		
		for(int i=0;i<9;++i) { //[i] 0 1 2 3 4 5 6 7 8
			if (i<5) {//[i] 0 1 2 3 4
				for(int j=0;;++j) {//[*개수] 5 4 3 2 1
					
				}
			}else { //[i] 5 6 7 8
				for(int j=0;;++j) {//[*개수] 2 3 4 5
					
				}
			}
		}
		

	}

}
