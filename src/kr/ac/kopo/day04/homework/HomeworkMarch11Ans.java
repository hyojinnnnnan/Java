package kr.ac.kopo.day04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeworkMarch11Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1번
		System.out.print("정수 3개 입력 : ");
		int q1num = sc.nextInt();
		int q1num2 = sc.nextInt();
		int q1num3 = sc.nextInt();
		
		int min=0;
		int max=0;
		if(q1num>q1num2) {
			min=q1num2;
			max=q1num;
		}
		
		if(q1num3>max) { //num3가 제일 큰 수
			System.out.println(q1num3+","+max+","+min);
		}else if(q1num3<min) { //num3가 제일 작은 수
			System.out.println(max+","+min+","+q1num3);
		}else {
			System.out.println(max+","+q1num3+","+min);			
		}
		
		////////////////////////////////////////////////
		
		//2번
		Random r = new Random();
		
		int q2num = r.nextInt(100)+1; 
		/* 
		line 37를 분리해서 살펴보면
		int q2num=r.nextInt(100); //0~99
		q2num += 1; //1~100
		*/
		int q2num2 = r.nextInt(100)+1; 
		int q2num3 = r.nextInt(100)+1; 
		int q2num4 = r.nextInt(100)+1; 
		
		
		System.out.println(q2num+","+q1num2+","+q2num3+","+q2num4);
		
		//방법1
		int q2max = q2num>q2num2 ? q2num : q2num2;
		if(q2max<q2num3) {
			q2max=q2num3;
		}
		if(q2max<q2num4) {
			q2max=q2num4;
		}
		
		/* 방법2
		int q2max1 = q2num>q2num2 ? q2num : q2num2;
		int q2max2 = q2num3;
		if(q2num4>q2num3) {
			q2max2=q2num4;
		} 
		*/
		
		/* 입력한 값을 기억할 필요가 없을 때는 다음과 같은 방법을 사용할 수 있음
		 * 이렇게만 작성하면 음수일 때 제대로 된 결과값을 출력하지 못함
		
		System.out.print("4개의 정수를 입력 : ");
		int max=0;
		for(int i=0 ; i<4 ;i++){
			int number = sc.nextInt();
				max=number;
		}
		System.out.println("가장 큰 수 : "+max);
		*/
		
		/*음수를 제대로 출력하고 싶다면
		 * 
		System.out.print("4개의 정수를 입력 : "); 
		int max=0;
		for(int i=0 ; i<4 ;i++){
			int number = sc.nextInt();
			if(i==0 || max<number) { //이 부분을 추가해야 함 : 첫번째로 입력받는 수는 무조건 max값으로 할당
				max=number;
			}
		}
		*/
		
		////////////////////////////////////////////////
		
		//3번 
		System.out.print("정수를 입력하세요 : ");
		int q3num = sc.nextInt();
		
		//1과 자기자신을 제외한 약수개수 구하기 (소수의 경우 0개)
		int count=0;
		for(int i=2 ; i<=q3num-1 ; i++) {
			if(q3num%i==0) {
				count++;
			}
		}
		if(q3num>1 && count==0) {
			System.out.println(q3num+" : 소수");
		}else {
			System.out.println(q3num+" : 소수아님");
		}
		
		////////////////////////////////////////////////
		
		//3번 _ version2
		//1과 자기자신을 제외한 제일 작은 약수의 후보는 2이고, 그럼 가장 큰 약수의 후보는 자기자신에서 2를 나눈 수 
		System.out.print("정수를 입력하세요 : ");
		q3num = sc.nextInt();
		
		//1과 자기자신을 제외한 약수개수 구하기 (소수의 경우 0개)
		count=0;
		for(int i=2 ; i<=q3num/2 ; i++) {
			if(q3num%i==0) {
				count++;
				break; //소수면 더 이상 비교할 필요가 없기 때문에
			}
		}
		if(q3num>1 && count==0) {
			System.out.println(q3num+" : 소수");
		}else {
			System.out.println(q3num+" : 소수아님");
		}
		
		////////////////////////////////////////////////
		
		//3번 _ version3
		//1과 자기자신을 제외한 제일 작은 약수의 후보는 2이고, 그럼 가장 큰 약수의 후보는 자기자신에서 2를 나눈 수 
		System.out.print("정수를 입력하세요 : ");
		q3num = sc.nextInt();
		
		//1과 자기자신을 제외한 약수개수 구하기 (소수의 경우 0개)
		boolean bool = true; //약수가 존재한다 존재하지 않는다라는 판단을 하고 싶기 때문에 int형보다는 bool형을 많이 사용
		//false로 초기화하면 : 약수가 존재하지 않는다
		//true로 초기화하면 : 나는 소수입니다
		for(int i=2 ; i<=q3num/2 ; i++) {
			if(q3num%i==0) {
				bool = false; //나 소수 아니야
				break;
			}
		}
		if(q3num>1 && bool) { //q3num>1 && boo1==true와 같은 의미
			System.out.println(q3num+" : 소수");
		}else {
			System.out.println(q3num+" : 소수아님");
		}
		
	}

}
