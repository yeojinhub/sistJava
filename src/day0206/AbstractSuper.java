package day0206;

/**
 * 상속관계에서 부모클래스를 정의할 때 사용되는 추상클래스
 * 	접근지정자로 abstract 와 final 은 동시 사용 불가능
 */
public abstract class AbstractSuper {
	private int i;
	
	public AbstractSuper() {
		System.out.println("추상클래스의 기본 생성자");
	} //AbstractSuper
	
	public void printI() {
		System.out.println("인스턴스 변수 i : "+i);
	} //printI

	/**
	 * 인스턴스 변수 i 반환
	 * @return i 정수값 반환
	 */
	public abstract int getI();
	
	/**
	 * 메세지를 입력받아 출력
	 * @param msg 출력할 메세지
	 */
	public abstract void printMsg(String msg);
	
	/*
	public static void main(String args[]) {
//		추상 클래스는 직접 객체화 불가능
//		AbstractSuper as = new AbstractSuper();
	} //main
	*/
	
} //class
