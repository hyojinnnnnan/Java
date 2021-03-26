package kr.ac.kopo.day15.inputOutputAPI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
목적 : iodata/testImage.jpg를 iodata.testImage2.jpg로 복사
입력장치 : testImage.jpg의 내용을 읽어와서
출력장치 : testImage2.jpg에 저장
입력장치의 내용을 읽어와서 램에 저장하고 -> 램에 저장된 내용을 가지고 파일로 복사 (file to file로 다이렉트 접근 불가 -> 스트림 필요(작업이 다 끝나면 스트림 제거)
이 경우 파일이 커질 수록 시간이 점점 오래걸려서 Buffer 단위로 움직이게 만든게 BufferedIn/OutputStream -> 매개값으로 In/OutputStream을 함께 써야 함 : FileIOMain03.java

[작업순서]
1. stream open = 읽기용, 쓰기용 객체 생성 (예. 채팅 접속)
2. read/write
3. stream close (예. 채팅 종료)
*/

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {	
			// 1. stream open : 스트림을 열면 fis와 fos만 접근할 수 있도록 잠금
			fis = new FileInputStream("iodata/testImage.jpg"); //읽기용
			fos = new FileOutputStream("iodata/testImage2.jpg"); //쓰기용
			//여기까지만 하고 실행하면 testImage2.jpg가 생기지만 -> 0 byte의 빈 파일이 생김
			
			// 2. read/write : 일기용에서 읽어와서 -> 쓰기용에 쓰기
			// 바이트씩 읽어오는 걸 몇 번 반복해야 하는지 알아야 함 
			// 바이트씩 읽어오다가 파일의 끝에 도달하면 종료해야 함 (파일은 끝에 ctrl+z 포함되어 하드디스트에 저장됨)
			while(true) { 
				int c = fis.read(); // fis에서 읽어와서
				if(c == -1) break; // fis에서 읽어오는 걸 -1일 때까지 반복
				fos.write(c); // fos에 쓰기
			}
			System.out.println(">>>복사 성공<<<");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(">>>복사 실패<<<");
		} finally { //자원해제 
			System.out.println(">>>복사프로그램 종료<<<");
			//3. stream close : 스트림이 닫히면서 잠금이 해제되고 외부에서 접근 가능 (잠금 해제 전까지 윈도우 탐색기에서 확인해보면 testImage2.jpg는 계속 0바이트)
			//파일 복사가 성공하던 실패하던 스트림은 무조건 닫아줘야 함 -> 그래서 에러 발생 유무에 상관없이 실행되는 finally 문에서 자원해제를 구문을 작성하게 되는 것 
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

} 
