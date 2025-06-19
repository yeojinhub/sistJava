package day0207;

/**
 * 중첩클래스 : 안쪽 클래스를 static 변수처럼 사용할 때
 */
public class Nested {
	int outI;// instance variable
	static int outJ;//static variable
	
	public Nested() {
		System.out.println("중첩클래스의 외부 클래스");
	}//Nested
	
	public void outMethodA() {
		System.out.println("외부클래스의  instance method");
	}//outMethodA
	
	public static void outMethodB() {
		System.out.println("외부클래스의 static method");
	}//outMethodB
	
	/////////////////////////////////중첩클래스 시작/////////////////////////
	static class Inner{
		static int inI;
		
		public static void inMethod() {
			//안쪽클래스에서 바깥클래스의 자원 사용.
//			outI=20;//static 영역은 클래스 실행시 가장 먼저 로딩되기 때문에 instance 영역을 사용할 수 업다. 
			outJ=20;
			outMethodB();
			
		}//inMethod
		
	}//class
	/////////////////////////////////중첩클래스 끝/////////////////////////
	

	public static void main(String[] args) {
		//중첩클래스는 static으로 구성되기 때문에 객체화없이 직접 호출 가능.
		Inner.inMethod();

	}//main

}//class
