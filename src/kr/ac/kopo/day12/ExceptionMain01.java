package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {

		System.out.println("main start...");

		Random r = new Random();
		int num = r.nextInt(3); // 0~2 사이 난수 발생
		System.out.println("num : " + num);
		
		String str=null;
		
		try {
			System.out.println(10/0);	
			//ArithmeticException 에러가 발생하는 구문 	
			
			System.out.println(str.charAt(0)); 
			//NullPointerException 에러가 발생하는 구문
			//catch로 해당 오류 안 잡아주면 위에서 ArithmeticException 에러가 발생해서 해당 catch구문으로 넘어가면서 이 구문은 수행 안됨
			
		}catch(ArithmeticException ae) { 
			System.out.println("===ArithmeticException 발생===");
			System.out.println("에러발생 이유 : "+ae.getMessage()); //에러의 이유를 알고 싶을 때
			ae.printStackTrace();//.getMessage()보다 더 구체적으로 알고 싶을 때, sysout 안에 쓰면 오류나네..? 단독으로 써야되나봐
			System.out.println("=============================");
		
		}catch(NullPointerException npe) { 
			System.out.println("===NullPointerException 발생===");	//NullPointerException은 발생 안하기 때문에 해당 구문 실행안됨	
			System.out.println("에러발생 이유 : "+npe.getMessage());
			npe.printStackTrace();
			System.out.println("=============================");
		
		} //line 25~37을 한 번에 받는 방법이 있음
		/*
		catch(Exception e){ //묵시적 형변환 : Exception 클래스는 예외들의 부모 클래스
			
		}
		해당 캐치문이 line 25, 31보다 앞에 오면
		Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
		*/
		
		System.out.println("main end...");		


	}

}
