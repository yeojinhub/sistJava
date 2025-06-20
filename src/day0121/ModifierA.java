package day0121;

/**
 * public 접근지정자를 가진 클래스 (외부 패키지에서 접근가능)
 */
public class ModifierA {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main(String[] args) {
		ModifierA ma=new ModifierA();
		System.out.println("public 접근지정자 : "+ma.a);
		System.out.println("protected 접근지정자 : "+ma.b);
		System.out.println("default 접근지정자 : "+ma.c);
		System.out.println("private 접근지정자 : "+ma.d);
	} //class
  
} //main
