package kr.ac.kopo.day15.inputOutputAPI;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 { //바이트 스트림에서 읽어올건지, 문자 스트림에서 읽어올건지
	
	//키보드는 바이트 기준이기 때문에 문자 스트림으로 바꾸는 필터 클래스 역할을 하는 InputStreamReader가 필요

	public static void main(String[] args){
		//콘솔 창의 copy con a.txt 기능을 만들고자 한다. ctrl+z 입력하기 전까지 계속 입력
		System.out.println("입력하세요. ctrl+z를 누르면 종료합니다.");
		
		//표준 입력장치 : System.in -> in은 InputStream 타입
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); //2바이트 단위로 인식해야 하는 한글은 1바이트 단위로 처리할시 오류 -> 1바이트 단위로 들어온 데이터로 문자 스트림의 데이터로 변환 -> InputStreamReader
		
		try {
			while(true) {
				int c = isr.read(); //램이 아닌 다른 입력장치를 통해 읽어오기 때문에 외부장치의 문제를 대비하기 위해 -> 예외처리 필요			
				if(c==-1) { //입력 버퍼에 저장하는 걸 종료하라는 의미이기 때문에 항상 라인의 맨 첫 열에서 ctrl+z를 입력해야 함
					System.out.println(">>입력 종료<<");
					break;	
				}
				System.out.print((char)c); //버퍼 단위로 동작하기 때문에 한글자씩 출력되지 않고 enter전의 버퍼 단위로 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//키보드가 아닌 하드디스크의 파일을 입출력 하려면? (컴퓨터 로그인 패스워드는 어디 저장될까? 램? 휘발성임 -> 파일임)
	}
}
