package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch12Q2Feedback {

	public static void main(String[] args) {
		// 2번
		Scanner sc = new Scanner(System.in);
		
		//짝수를 저장할 배열과 홀수를 저장할 배열을 별도로 생성
		System.out.print("짝수 몇개 입력 : ");
		int evenNum=sc.nextInt();
		int[] even = new int[evenNum];
		System.out.print("홀수 몇개 입력 : ");
		int oddNum = sc.nextInt();
		int[] odd = new int[oddNum];

		int inputCount = evenNum + oddNum; //짝수개수+홀수개수 
		int evenIndex = 0; //짝수배열의 인덱스
		int oddIndex = oddNum-1; //홀수배열의 인덱스 (배열의 끝에서부터 저장)
/////////////////////////////////////////////////////////////////////////////////////
		for (int i = 1; i <= inputCount; i++) { //짝수개수+홀수개수만큼 반복
			
			System.out.print("num" + i + " : ");
			int num = sc.nextInt(); //원하는 숫자 입력
			
			if (num % 2 == 0) { // 입력받은 수가 2로 나누어 떨어지면 even으로
				if(evenIndex==evenNum) { //이미 짝수를 모두 입력했다면
					System.out.println("짝수를 모두 입력하셨습니다.");
					i--; //해당 번째 숫자를 다시 입력받을 수 있도록 i를 1감소 (반복문으로 다시 올라가면 1이 증가되기 때문에)
				}else { 
					even[evenIndex] = num;
					evenIndex++;					
				}
				
			} else { // 입력받은 수가 2로 나누어 떨어지지 않으면 odd로
				if(oddIndex==-1) { //이미 홀수를 모두 입력했다면 
					System.out.println("홀수를 모두 입력하셨습니다.");
					i--; //해당 번째 숫자를 다시 입력받을 수 있도록 i를 1감소 (반복문으로 다시 올라가면 1이 증가되기 때문에)
				}else { 
					odd[oddIndex] = num;
					oddIndex--;					
				}
			}
			
		}
/////////////////////////////////////////////////////////////////////////////////////	
		System.out.println(even + " : " + Arrays.toString(even));
		System.out.println(odd + " : " + Arrays.toString(odd));

		// 짝수 배열 + 홀수 배열을 합친 새로운 배열
		int[] evenOdd = new int[even.length + odd.length];
		// System.arraycopy(복사하고자 하는 원본, 원본의 어디부터 읽어올지, 붙여넣으려는 대상(복사본),붙여넣을 위치, 복사되는 길이)
		System.arraycopy(even, 0, evenOdd, 0, even.length);
		System.arraycopy(odd, 0, evenOdd, even.length, odd.length);
		System.out.println(evenOdd + " : " + Arrays.toString(evenOdd));
		
		sc.close();

	}

}