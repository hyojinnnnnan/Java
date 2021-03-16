package kr.ac.kopo.day07.homework;

public class IcecreamMain2 {
	public static void main(String[] args) {
		
		Icecream2 ice=new Icecream2();
		int num=ice.inputInt("구입할 아이스크림 개수 : ");
		ice.printAll(num);
		
	}
}
