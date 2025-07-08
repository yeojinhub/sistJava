package day0206;

/**
 * 구현클래스가 구현해야하는 업무들의 목록만 제공
 */
public interface SuperInterface {
//	int i;						//인스턴스 변수 선언 불가능
//	public SuperInterface() {	//생성자 불가능 : 인터페이스는 직접 객체화 불가능
//	}
//	public void test() { }		//일반 method 도 불가능 : 직접 업무 구현 불가능
	
	public static final int MAX=10000;
	
//	interface 는 abstract 접근지정자를 기술하지 않아도 abstract method 가 된다
	public void methodA();
	public abstract String methodB();
	
	public default void methodC() {
		System.out.println("인터페이스에서 구현하여 제공하는 기능");
	} //methodC
	
} //interface
