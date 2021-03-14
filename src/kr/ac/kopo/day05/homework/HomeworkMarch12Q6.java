package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMarch12Q6 {

	public static void main(String[] args) {
		//6번
		Scanner sc=new Scanner(System.in);
		int ans=(int)(Math.random()*100)+1;
		int maxNum=100;
		int minNum=0;
		
			for(int chance=1 ; chance<=5 ; chance++) {
				System.out.print(minNum+"-"+maxNum+": ");
				int num=sc.nextInt();	
				if(num==ans) { 
					System.out.println("축하합니다! 정답입니다!");
					break;
				} else if(num>ans) { //정답이 입력한 수보다 작다면
					System.out.println(num+"보다 작은 수입니다.");
					maxNum=num-1;
				} else { //정답이 입력한 수보다 크다면
					System.out.println(num+"보다 큰 수입니다.");
					minNum=num+1;
				}
				System.out.println("기회는 "+(5-chance)+"번 남았습니다.");
				if(chance==5) {
					System.out.println("\n기회를 모두 소진하셨습니다. \n정답은 "+ans+"입니다.");
				}
			}
		sc.close();
	}

}