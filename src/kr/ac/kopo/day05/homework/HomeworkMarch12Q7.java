package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeworkMarch12Q7 {

	public static void main(String[] args) {
		//6번
		Scanner sc=new Scanner(System.in);
		int max=100;
		int min=1;
		boolean bool=false;
		while(bool==false) {
			int num=new Random().nextInt((max - min) + 1) + min;
			System.out.print("사용자가 생각하는 숫자가 ["+num+"]입니까? \n맞으면 0, 작은 수면 1, 큰 수면 2 : ");
			int ans=sc.nextInt();
			
			switch(ans) {
			case 0:
				bool=true;
				break;
			case 1:
				max=num-1;
				break;
			case 2:
				min=num+1;
				break;
			}
			/* switch문 대신 if문을 쓰려면
			if(ans==0) {
				break;
			} else if(ans==1) {
				max=num-1;
			} else if(ans==2) {
				min=num+1;
			}*/
		}
		sc.close();
	}
}