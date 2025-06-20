package day0121;

/**
 * 같은 package 에서 다양한 접근지정자를 가진 클래스의 변수를 사용
 */
public class UseModifier {

	public static void main(String[] args) {
		ModifierA ma=new ModifierA(); //class 의 접근지정자 public
		ModifierB mb=new ModifierB(); //class 의 접근지정자 package

		System.out.println("ma 객체의 public "+ma.a);
		System.out.println("mb 객체의 public "+mb.a);

		System.out.println("ma 객체의 protected "+ma.b);
		System.out.println("mb 객체의 protected "+mb.b);

		System.out.println("ma 객체의 default "+ma.c);
		System.out.println("mb 객체의 default "+mb.c);

//		private 는 외부에서 사용할 수 없음
//		System.out.println("ma 객체의 private "+ma.d);
//		System.out.println("mb 객체의 private "+mb.d);
		
	} //main

} //class
