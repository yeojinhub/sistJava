package day0228;

/**
 * 추상 method 가 하나인 interface
 */
@FunctionalInterface
public interface LambdaTypeA {
//	현재는 1개의 method 가질 수 있음
	/**
	 * 반환형 없고, 매개변수 없는 형
	 */
	public void test();
//	public void test2(); interface 2개 method 가질수 있음, 대신 @ 주석처리해야함
	
} //interface
