package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][4];
		
		//int[][] arr = new int[2][]; //만 쓰면 -> java.lang.NullPointerException
		/*아래 2줄과 함께 작성해야 함
		  arr[0] = new int[5];
		  arr[1] = new int[3];*/
		
		System.out.println("arr : "+arr);
		System.out.println();
				
		System.out.println("arr.length : "+arr.length); //2
		for(int i=0 ; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]); //주소값
			System.out.println("arr["+i+"].length : "+arr[i].length);
			System.out.println();
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("arr["+i+"]["+j+"] : "+arr[i][j]); //주소값
			}
			System.out.println();
		}
		
	}

}