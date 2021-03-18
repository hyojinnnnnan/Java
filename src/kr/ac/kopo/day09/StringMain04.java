package kr.ac.kopo.day09;

public class StringMain04 {

	public static void main(String[] args) {
		
		//변화하는 문자열에 StringBuffer를 써야하는 이유를 설명하는 예제들
		
		//////////////////////////////////////////////////////////////////
		
		long start=System.currentTimeMillis();
		int sum=0;
		for(int i=0; i<100000 ; i++) {
			sum+=i; 
		}
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000.00); //0.001
		
		//////////////////////////////////////////////////////////////////
		
		start=System.currentTimeMillis();
		String str="";
		for(int i=0; i<100000 ; i++) {
			str+=i; //요건 꼼수 -> StringMain03_5.java에도 나왔었음!
			//위 문장을 제대로 쓰면 str=str.concat(String.valueOf(i));
		}
		//"0"을 저장하는 공간을 생성하고 연결하고, "01"을 저장하는 공간을 생성하고 다시 연결하고를 10만번 복사 (변화하는 문자열은 String 클래스에 적합하지 않음을 알 수 있음)
		end=System.currentTimeMillis();
		System.out.println((end-start)/1000.00); //3.747 -> 그래서 시간이 더 오래걸림
		
		//////////////////////////////////////////////////////////////////
		
		//StringBuffer 클래스로 변화하는 문자열을 효율적으로 관리
		start=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer(); //StringBuffer 클래스의 객체생성
		for(int i=0; i<100000 ; i++) {
			sb.append(i);
		}
		end=System.currentTimeMillis();
		System.out.println((end-start)/1000.00); //0.003 -> String 클래스를 사용했을 때보다 시간이 훨씬 단축
		
	}

}
