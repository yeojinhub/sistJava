package day0207;

/**
 * 안쪽 클래스를 인스턴스 변수처럼 사용할 때. 
 */
public class Outer {
	int outI;
	
	public Outer() {
		System.out.println("바깥 클래스의 생성자");
	}//Outer
	
	public void outMethod() {
//		inI=10;//안쪽클래스의 자원은 직접 사용불가.
//		inMethod();
		//바깥클래스에서 안쪽클래스의 자원을 사용할려면 안쪽클래스를 객체화하여 사용.
		Inner in= new Inner();
		in.inI=10;
		in.inMethod();
	}//outMethod
	
	
	///////////////////////////Innerclass시작////////////////////////////////
	public class Inner{
		int inI;
		
		public Inner() {
			System.out.println("Inner class 생성자");
		}
		
		public void inMethod() {
			System.out.println("안쪽클래스의 method");
			//안쪽클래스에서는 바깥 클래스의 자원을 사용할 수 있다. 
			outI=2025;
			System.out.println("바깥클래스의 변수"+ outI);
		}
		
		
		
	}//class
	
	
	///////////////////////////Innerclass끝////////////////////////////////

	public static void main(String[] args) {
		//객체화
		//1.외부클래스를 객체화: 바깥클래스명 객체명= new 바깥클래스생성자();
		Outer out= new Outer();
		
		//2. 외부클래스의 객체를 사용하여 내부클래스의 객체를 생성한다.
//		Inner in=new Inner();//일반객체화할 수 없다. 
		//바깥클래스명.안쪽클래스명 객체명= 바깥클래스의 객체명.new 안쪽클래스생성자();
//		Outer.Inner in=out.new Inner();
//		in.inMethod();
		
		out.outMethod();
	}//main

}//class
