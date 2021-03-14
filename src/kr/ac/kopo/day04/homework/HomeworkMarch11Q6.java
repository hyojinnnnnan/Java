package kr.ac.kopo.day04.homework;

//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] odd = new int[10]; //홀
		int[] even = new int[10]; //짝
		int oddTotal=0;
		int oddIndex=0;
		int evenTotal=0;
		int evenIndex=0;

		// 6번
		for(int i=1 ; i<=10 ; i++) {
			System.out.printf("%d's 정수 : ",i);
			int num=sc.nextInt();
			if(num%2==0) { //짝
				evenTotal+=num;
				even[evenIndex]=num;
				evenIndex++;
			}else { //홀
				oddTotal+=num;
				odd[oddIndex]=num;
				oddIndex++;
			}
		}
		even=Arrays.copyOf(even, evenIndex);
		System.out.println("짝수 : "+Arrays.toString(even));
		System.out.printf("짝수 총합 : %d \n", evenTotal);
		odd=Arrays.copyOf(odd, oddIndex);
		System.out.println("홀수 : "+Arrays.toString(odd));
		System.out.printf("홀수 총합 : %d", oddTotal);
	}
}
