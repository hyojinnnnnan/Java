import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.getClass().getName()=="java.util.Scanner") {
			System.out.println("Scanner 클래스입니다.");
		}
	}
}