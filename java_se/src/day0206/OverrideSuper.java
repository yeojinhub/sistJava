package day0206;

/**
 * Override 연습용 부모클래스
 */
public class OverrideSuper {
	
	int age;
	int day;

	/**
	 * 오늘 요일을 포함한 메세지를 출력하는 method
	 */
	public void helloMsg() {
		System.out.println("오늘은 목요일입니다.");
	} //helloMsg
	
	/**
	 * 제공되는 기능을 그대로만 사용해야할 때
	 */
	public void helloMsg2() {
		System.out.println("안녕하세요.");
	} //helloMsg2
	
} //class
