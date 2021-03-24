package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		//FileReader fr=new FileReader("a.txt");
		//Unhandled exception type FileNotFoundException
		//무조건 예외처리를 해야 함(컴파일 시점의 예외처리, checked exception) -> try구문 안에 위치시킴
		
		try {
			FileReader fr=new FileReader("a.txt"); //컴파일 시점의 예외처리, checked exception
		} catch (FileNotFoundException fnfe) {
			try { 
				FileWriter fw=new FileWriter("error.log"); //컴파일 시점의 예외처리, checked exception
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}
