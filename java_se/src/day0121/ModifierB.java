package day0121;

/**
 * package 접근지정자를 가진 클래스
 */
class ModifierB {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main(String[] args) {
		ModifierB mb=new ModifierB();
		System.out.println("public 접근지정자 : "+mb.a);
		System.out.println("protected 접근지정자 : "+mb.b);
		System.out.println("default 접근지정자 : "+mb.c);
		System.out.println("private 접근지정자 : "+mb.d);
	} //class
  
} //main
