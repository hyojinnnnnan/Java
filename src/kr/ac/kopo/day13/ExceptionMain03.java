package kr.ac.kopo.day13;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("[version 1]\n");
		System.out.println("===main start...===");

		for (int i = -2; i < 3; i++) {
			System.out.println(i + "번째 반복문 수행 중...");
			try {
				System.out.println(10 / i); // / by zero 애러발생 가능
			} catch (ArithmeticException ae) {
				System.out.println("(Error)" + ae.getMessage());
				break; // 예외가 발생하는 순간 for문 탈출 -> line 19로 이동
			}
			System.out.println("===ongoing...===");
		} // for문 끝
		System.out.println("===main end...===");

		System.out.println();
		
		System.out.println("[version 2]\n");
		System.out.println("===main start...===");

		for (int i = -2; i < 3; i++) {
			System.out.println(i + "번째 반복문 수행 중...");
			try {
				System.out.println(10 / i); // / by zero 애러발생 가능
			} catch (ArithmeticException ae) {
				System.out.println("(Error)" + ae.getMessage());
				break; // 예외가 발생하는 순간 for문 탈출 -> line 19로 이동
			}finally {
				System.out.println("===ongoing...==="); 
				//version 1과 다른점 : 해당 출력문이 finally 구문 안에 있음 -> catch에서 break를 통해 for문을 빠져나와도 finally 안 구문은 무조건 수행된다.				
			}
		} // for문 끝
		System.out.println("===main end...===");
	}

}
