package kr.ac.kopo.day07.homework;

public class IcecreamMain02 {
	public static void main(String[] args) {
		
		Icecream02 ice=new Icecream02();
		int num=ice.inputInt("구입할 아이스크림 개수 : ");
		ice.printAll(num);
		
	}
}
