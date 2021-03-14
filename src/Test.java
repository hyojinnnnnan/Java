import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int max=4;
		int min=2;
		int num=new Random().nextInt((max - min) + 1) + min;
		System.out.println(num);
	}
}