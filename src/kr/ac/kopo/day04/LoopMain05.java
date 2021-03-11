package kr.ac.kopo.day04;

public class LoopMain05 {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[4];
	
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		[출력값]
		12345
		12345
		12345
		*/
		
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if (j==3) {
					break;
					//반복문이 중첩되었을 경우 break를 만나면 가장 가까운 반복문을 강제적으로 종료한다.
					//20번째 반복문까지 빠져나가고 싶으면? -> line 38부터 코드를 보자!
				}
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		[출력값]
		12
		12
		12
		*/
		
		//중첩된 반복문을 한 번에 빠져 나오자!
		loop01: for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if (j==3) {
					break loop01; //break를 만나면 loop1이라는 이름의 블록을 벗어난다. 
				}
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		[출력값]
		12
		*/
		
		 
	}

}
