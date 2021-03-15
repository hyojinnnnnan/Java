package kr.ac.kopo.day05.homework;

import java.util.Arrays;

public class HomeworkMarch12Q4Ans {

	public static void main(String[] args) {
		//4번
		int[] nums=new int[99]; //총 99개의 정수를 저장할 배열 생성
		for(int i=0; i<nums.length ; i++) { //2~100까지 값을 할당
			nums[i]=i+2;
		}
		
		for(int i=0 ; i<nums.length ; i++) { //i는 nums 배열의 인덱스 : 0~98
			//System.out.printf("num[%d]:%d \n", i, nums[i]);
			if(nums[i]!=0) { //nums[i]가 0이 아니라면 즉, nums[i]가 소수라면(소수가 아닌 수를 0으로 바꾸는 작업을 하고 있기 때문에)
				for(int j=i+1 ; j<nums.length ; j++) { //배열의 i+1번째부터 끝까지 확인하면서(배수를 찾는 작업이기 때문에 i번째 이전의 값은 확인할 필요가 없음)
					if(nums[j]%nums[i]==0) { //nums[j]가 nums[i]의 배수라면
						nums[j]=0; //0으로 바꾸기
					}
				}
			}
		}
		for(int i:nums) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
	}

}