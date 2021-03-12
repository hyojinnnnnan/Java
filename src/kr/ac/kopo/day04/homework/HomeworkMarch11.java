package kr.ac.kopo.day04.homework;
//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//개인적으로 시도한 코드 - 1,2번 통합 (배열사용) : https://mozi.tistory.com/457
		//비교하는 숫자의 개수가 늘어나면 좋은 방법이 아닐 수도 있음
		System.out.print("몇 개의 정수를 비교할까요? : ");
		int num = sc.nextInt();
		int[] intArr = new int[num]; //배열생성
		System.out.print("정수 "+num+"개 입력 : ");
		for(int i=0; i<intArr.length; i++) { //배열에 요소값 할당 
			intArr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(intArr)); //제대로 출력됬는지 확인
		
		int temp; //요소값 임시저장 변수
		

		
		
		
	}

}
