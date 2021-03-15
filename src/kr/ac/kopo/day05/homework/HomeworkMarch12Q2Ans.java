package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMarch12Q2Ans {

	public static void main(String[] args) {
		// 2번 : even, odd 배열을 각각 만들지 않고 하나의 배열로 해결하는 방법
		Scanner sc=new Scanner(System.in);
		
		System.out.print("짝수 : ");
		int evenNum=sc.nextInt();
		System.out.print("홀수 : ");
		int oddNum=sc.nextInt();
		int[] nums=new int[evenNum+oddNum]; //짝수개수+홀수개수 크기의 배열 생성
		
		int evenIdx=0; //짝수는 배열의 왼쪽부터 저장 -> nums[0] ~ nums[evenNum-1]
		int oddIdx=nums.length-1; //홀수는 배열의 오른쪽부터 저장 -> nums[eveNum] ~ nums[nums.lenght-1]
		
		for(int i=0;i<nums.length;i++) { //짝수개수+홀수개수 만큼 반복
			System.out.print("num "+(i+1)+" : "); //숫자 입력받기
			int num=sc.nextInt(); 
			
			if(num%2==0 && evenIdx<evenNum) { //짝수일 때
				nums[evenIdx]=num; //후위증가
				evenIdx+=1;
			}else if(num%2!=0 && oddIdx>=evenNum){ //홀수일 때
				nums[oddIdx--]=num; //후위감소
			}else {
				i--; //조건에 만족하지 않으면 i번째에 해당하는 숫자를 다시 입력할 수 있도록 i-1 -> i-1+1=i
			}
			
		}
		System.out.printf("<총 %d개 정수 출력> \n",nums.length);
		for(int repeat:nums) {
			System.out.print(repeat+ " ");
		}
	}

}