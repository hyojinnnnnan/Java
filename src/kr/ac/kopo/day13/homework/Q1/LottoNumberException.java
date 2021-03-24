package kr.ac.kopo.day13.homework.Q1;

public class LottoNumberException extends Exception {

	public LottoNumberException() {
		super(); // Exception 클래스의 디폴트 생성자 호출
	}

	public LottoNumberException(String msg) {
		super(msg); //Excetion 클래스의 Exception(String message) 오버라이딩 생성자 호출
	}

}
