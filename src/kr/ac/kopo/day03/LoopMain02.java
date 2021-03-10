package kr.ac.kopo.day03;

public class LoopMain02 {

	public static void main(String[] args) {
		
		/*
		 * 내가 출력하고 싶은 문장의 형태
		 * System.out.println("*****\n");
		 * System.out.println("*****\n");
		 * System.out.println("*****\n");
		 * 
		 * 생각 1단계 : 3줄 반복
		 * for(int i=1;i<=3;++i){
		 * 	System.out.println("*****\n");
		 * }
		 * 
		 * 생각 2단계
		 * for(int i=1;i<=3;++i){
		 * 	System.out.print("*");
		 *  System.out.print("*");
		 *  System.out.print("*");
		 *  System.out.print("*");
		 *  System.out.print("*");
		 *  System.out.println(); 
		 * }
		 * 
		 * 생각 3단계 : *이 5개씩 반복
		 * for(int i=1;i<=3;++i){
		 * 	for(int j=1;j<=5;++j{
		 * 		System.out.print("*");
		 * 	}
		 * 	System.out.println(); 
		 * }
		 */
		
		//행 우선 방식 
		for(int i=0;i<=2;++i) { //행
			for(int j=0;j<=4;++j) { //열
				System.out.print("*");
			}
			System.out.println();
		}

	}
}