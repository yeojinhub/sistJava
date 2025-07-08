package day0124;

/**
 * 생성자의 사용
 */
public class TestConstructor {

	public TestConstructor() {
		System.out.println("default constructor");
	} //TestConstructor

	public TestConstructor(int i) {
		System.out.println("오버로드된 매개변수 있는 생성자");
		test(); //객체명 생성하지 않고 method 직접 호출
	} //TestConstructor
	
	public void test() {
		System.out.println("test method");
//		TestConstructor(); //생성자는 method 호출하듯이 직접 호출 불가
		new TestConstructor();
	} //test
	
	public static void main(String[] args) {
		new TestConstructor();
		new TestConstructor(21);
		
	} //main

} //class
