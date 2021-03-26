package kr.ac.kopo.day15.inputOutputAPI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {
	
	public static void write() {
		Dog d = new Dog("앙꼬", 4, "푸들");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("dogInfo.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(d.getName()+" : "+d.getAge()+" : "+d.getKind());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("io/dogInfo.txt");
			dis = new DataInputStream(fis);
			
			String data = dis.readUTF();
			System.out.println(data);
			
			String[] strArr = data.split(":");
			System.out.println(Arrays.toString(strArr));
			
			Dog d = new Dog(strArr[0], Integer.parseInt(strArr[1]), strArr[2]);
			System.out.println(d);
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
	
	public static void main(String[] args) {
		
	
	}
}
