//선언부에 올 수 잇는 것 : 문서주석(/**), 패키지, 임포트, 클래스 선언

package kr.ac.kopo.day01; //패키지
import java.util.Random; //임포트

//문서주석
/**
 * 로또와 관련된 기능을 제공하는 기능클래스
 * 
 * @author 안효진
 *
 */
public class LottoUtil { //LottoUtil : 참조클래스, 혼자 실행되는 클래스가 아님, LottoMain 클래스에서 사용
	
	// 내용부에 올 수 있는 것 : 멤버변수, 메소드, 내부클래스
	
	private int lottoNum; //멤버변수
	
	/**
	 * 오늘의 로또확률을 출력해주는 메소드
	 */
	public void todayLotto() { //메소드
		Random r = new Random(); //java.util.Random (line 4)
		System.out.println("오늘의 로또 확률 : " +r.nextInt(101)+"%입니다.");
		//nextInt(101) : 임의의 int 값을 101로 나누었을 때 나오는 나머지
	}
	
	/**
	 * 1~45 사이의 로또 번호를 알려주는 메소드
	 * @return 추출된 로또번호
	 */
	public int getNum() {
		Random r = new Random(); //java.util.Random (line 4)
		return r.nextInt(45)+1; //1~45 사이의 로또 번호 추출
	}
}

//선언부
