package kr.ac.kopo.day07;

public class MethodMain01 {

	//메소드 정의
	/**한 줄에 임의의 문자를 원하는 개수만큼 출력하는 메소드
	 * @param c 출력할 문자의 종류(char)
	 * @param cnt 출력횟수(int)
	 * 
	 * @author Hyojin An
	 * */
	
	/*step 1 : 매개변수 0개
	static void printStar() { 
		//메소드명 : printStar
		//매개변수 : (현재 필요없음)
		//반환형 : void(피호출자가 호출자에게 넘겨줄 값이 없어요! 라는 의미)
		//모든 메소드에 static을 붙이지 않음 (오늘 안배움, 일단 넘어가자!)
		
		System.out.println("**********");
	}
	*/ 
	
	/*
	//step 2 : 매개변수 1개
	static void printStar(int cnt) { 
		//매개변수 : int cnt
		for(int i=0; i<cnt ; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	*/
	
		//step 3 : 매개변수 2개
		static void printStar(char c, int cnt) { 
			//매개변수 : char c, int cnt
			for(int i=0; i<cnt ; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
	
		//step 4 : 반환값과 return
		//
		static int printStar2(char c, int cnt) {
			for(int i=0; i<cnt ; i++) {
				System.out.print(c);
			}
			System.out.println();
			return 10;
		}


	public static void main(String[] args) {
		
		/*step 1
		//메소드 호출 : printStar() 메소드가 가지고 있는 문장을 수행해!
		printStar();
		System.out.println("Hello");
		printStar();
		System.out.println("Hi");
		printStar();
		System.out.println("Hyojin :)");
		printStar();
		
		//별(*)이 아니라 =을 10개 출력하고 싶을 때 수정하기 매우 쉬워짐
		 */
		
		/*
		//메인 메소드가 printStar()를 호출하면서 찍어내는 별의 개수를 쥐락펴락 하고 싶으면?
		//호출자가 피호출자에게 대화를 시도 : 매개변수
		//step 2
		printStar(1);
		System.out.println("Hello");
		printStar(2);
		System.out.println("Hi");
		printStar(3);
		System.out.println("Hyojin :)");
		printStar(4);
		*/
		
		//메인 메소드가 printStar()를 호출하면서 찍어내는 문자와 개수를 쥐락펴락 하고 싶으면?
		//호출자가 피호출자에게 대화를 시도 : 매개변수
		//step 3
		printStar('*',1);
		System.out.println("Hello");
		printStar('!',2);
		System.out.println("Hi");
		printStar('&',3);
		System.out.println("Hyojin :)");
		printStar('#',4);
		
		//step 4
		int data=printStar2('^',5);
		
	}

}
