package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;

/**kr.ac.kopo.util 패키지 : 파일 입출력 객체 close 메소드들이 모여진 클래스입니다.*/
public class FileClose {
	
	public static void close(InputStream is) {
		if(is != null) {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream os) {
		if(os!=null) {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	}
	
	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	}
	
}
