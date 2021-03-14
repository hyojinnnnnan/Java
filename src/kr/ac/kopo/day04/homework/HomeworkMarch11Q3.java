package kr.ac.kopo.day04.homework;

//마지막 문제를 제외하고 배열사용x
//https://github.com/jiyooLee/2021_kopo_java/blob/a9f69f6433471e198e67a870e0fbd8eec69cb411/java/src/kr/ac/kopo/day04/%EA%B3%BC%EC%A0%9C.txt
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMarch11Q3 {

	public static void main(String[] args) {
		// 3번
		int snail = 0; // 달팽이가 올라간 높이
		int hour = 0; // 걸린 시간

		while (snail < 100) { // 100m를 모두 올라가기 전까지 계속 반복
			snail += 5; // 달팽이는 1시간에 5m를 올라가는데
			if (snail < 50) { // 올라간 높이가 50m 미만일 때는 1시간마다 1m씩 추락한다
				snail -= 1;
			} else if(snail>=50) { // 50m 이상 올라갔으 때는 1시간마다 2m씩 추락한다
				snail -= 2;
			}
			hour++;
			System.out.printf("[%d 시간 후] 달팽이의 현재 위치 : %dm \n", hour, snail);
		}
	}
}
