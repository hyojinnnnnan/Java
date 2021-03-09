package kr.ac.kopo.day02;

public class OperationMain02 {

	public static void main(String[] args) {

		int a = 1;
		int b = -1;
		int c = 0;

		boolean bool = ++a > 0 && ++b > 0 && ++c > 0;
		// T F (뒤에꺼 안봄)

		System.out.println("bool : " + bool); // false
		System.out.println("a : " + a); // 2
		System.out.println("b : " + b); // 0
		System.out.println("c : " + c); // 0

		boolean bool2 = a++ > 0 || b++ > 0 || c++ > 0;
		// a=3, T (뒤에꺼 안봄) (뒤에꺼 안봄)
		System.out.println("bool2 : " + bool2);
		System.out.println("a : " + a); // 3
		System.out.println("b : " + b); // 0
		System.out.println("c : " + c); // 0

	}

}
