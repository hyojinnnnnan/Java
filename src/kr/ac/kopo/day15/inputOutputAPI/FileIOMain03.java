package kr.ac.kopo.day15.inputOutputAPI;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {
	
	//iodata/testImage.jpg를 iodata.testImage3.jpg로 복사
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null; 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("iodata/testImage.jpg");  //바이트 단위
			fos = new FileOutputStream("iodata/testImage3.jpg");
					
			bis = new BufferedInputStream(fis); //바이트 단위에서 버퍼 단위로 
			bos = new BufferedOutputStream(fos); //바이트 단위에서 버퍼 단위로
			
			while(true) {
				int c = bis.read();
				if(c==-1) break;
				bos.write(c);
			}
			System.out.println(">>>복사 성공<<<");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(">>>복사 실패<<<");
		} finally {
			System.out.println(">>>복사프로그램 종료<<<");
			/*
			if(bis!=null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(bos!=null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			*/ 
			
			//kr.ac.kopo.util 패키지 : 파일 입출력 객체 close 메소드들을 만들어서 line 40~69를 단축
			/*
			FileClose.close(bis);
			FileClose.close(bos);
			FileClose.close(fis);
			FileClose.close(fos);
			*/
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
		}
		
	}
}
