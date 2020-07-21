package net.codejava.ProductOrder;

public class Practice2{

	
	Practice2() {
		System.out.println("Test2 Constructor");
	}
	
	Practice2(int x) {
		this(0,0);
		System.out.println("Hellow");
	}
	
	Practice2(int x, int y) {
		System.out.println("How r u");
	}
	
	
	public static void main(String args[]) {
		Practice2 p2 = new Practice2();
		
	}
	
}
