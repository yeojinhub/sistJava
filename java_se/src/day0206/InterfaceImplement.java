package day0206;

/**
 * interface 를 구현하는 클래스 (인터페이스 안에 추상메소드는 구현 강제성)
 */
public class InterfaceImplement implements SuperInterface{

	@Override
	public void methodA() {
		System.out.println("구현클래스에서 Ovrride 한 method");
	} //methodA

	@Override
	public String methodB() {
		return "눈오는 목요일";
	} //methodB
	
	public void methodD() {
		System.out.println("클래스의 일반 method");
	} //methodD

	public static void main(String[] args) {
//		인터페이스는 직접 객체화 불가능
//		SuperInterface si=new SuperInterface();
		System.out.println(SuperInterface.MAX);
		
//		구현 클래스를 생성하여 heap의 주소 저장 : is a 관계의 객체화
		SuperInterface si=new InterfaceImplement();
		System.out.println(si);
		
//		객체명으로 호출 가능한 것은 1.상수, 2.Override 한 method, 3.default method
//		2. Override 한 method
		si.methodA();
		System.out.println(si.methodB());
//		3. default method
		si.methodC();
		
//		구현 클래스가 가진 method 는 is a 관계의 객체화에는 호출 불가능
//		si.methodD();	//error

	} //main

} //class
