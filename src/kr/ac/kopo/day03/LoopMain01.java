package kr.ac.kopo.day03;

public class LoopMain01 {

	public static void main(String[] args) {
		
		//while문 
		int loop = 0; 
		while (loop<5) { //5번 반복
			//loop값이 5가 되기 전까지 반복
			System.out.println(loop);
			++loop; //loop값 1 증가
		}
		
		System.out.print("======="+"\n");
		
		//for문
		for (int loop2=0;loop2<5;++loop2) { //5번 반복
			System.out.println(loop2);			
		}
		
		System.out.print("======="+"\n");
		
		for (int loop2=1;loop2<=5;++loop2) { //5번 반복
			System.out.println(loop2);			
		}
		
		System.out.print("======="+"\n");
		
		for (int loop2=4;loop2>=0;--loop2) { //5번 반복
			System.out.println(loop2);						
		}
		
	}

}
