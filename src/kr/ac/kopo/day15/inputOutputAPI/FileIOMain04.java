package kr.ac.kopo.day15.inputOutputAPI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {
	
	public static void write() {
		char c = 'A';
		int i = 97;
		double d = 12.34;
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iodata/test.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeChar(c); //char가 2바이트라서 파일에 A 앞에 공백 1개 있음
			dos.writeInt(i); //int 4바이트 a 앞에 공백 3개 있음 (메모장은 텍스트로 보여주기 때문에 아스키코드 값이 텍스트로 바껴서 a라고 나오는 것)
			dos.writeDouble(d); //double 8바이트 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
	}
	
	public static void read() { 
		// 파일애 저장된 데이터들의 저장순서를 알고 있어야 함 (위에서는 문자, 정수, 실수 순서로 저장되어 있음)
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iodata/test.dat");
			dis = new DataInputStream(fis);
			
			// 저장 '순서대로' 읽어와야 함 
			char c = dis.readChar();
			int i = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println(c);
			System.out.println(i);
			System.out.println(d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);			
		}
	}

	public static void main(String[] args) {
		
		//write();
		read();
		
	}

}
