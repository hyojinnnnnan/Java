package kr.ac.kopo.day07;

//import java.util.Scanner; //getDan 메소드를 사용하면 생략가능

public class GugudanMain {

	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in); //getDan 메소드를 사용하면 생략가능
		
		//메소드 호출방법 1단계. Gugudan 클래스의 인스턴스 객체 만들기
		Gugudan gu = new Gugudan();
		
		//System.out.print("2 - 9 사이의 정수 입력 : "); //구구단 내에 하나의 단을 입력받는 메소드를 만들면 line 14,25,28를 간단하게 만들 수 있지 않을까?
		//getDan 메소드를 사용하면 int dan=sc.nextInt(); 대신에 아래와 같이 변경가능
		int dan=gu.getDan("2 - 9 사이의 정수 입력 : ");
		//sc.nextLine(); //버퍼 비우기, getDan 메소드를 사용하면 생략가능
	
		//메소드 호출방법 2단계. 참조변수 gu를 통해서 메소드 호출
		gu.print(dan);
		gu.print();
		
		//System.out.print("시작단을 입력 : ");
		
		//getDan 메소드를 사용하면 int startDan=sc.nextInt(); 대신에 아래와 같이 변경가능
		int startDan=gu.getDan("시작단을 입력 : ");
		//sc.nextLine(); //버퍼 비우기, getDan 메소드를 사용하면 생략가능
		
		//System.out.print("종료단을 입력 : ");
		
		//getDan 메소드를 사용하면 int endDan=sc.nextInt(); 대신에 아래와 같이 변경가능
		int endDan=gu.getDan("종료단을 입력 : ");
		//sc.nextLine(); //버퍼 비우기, getDan 메소드를 사용하면 생략가능
		
		gu.print(startDan, endDan);
	}

}
