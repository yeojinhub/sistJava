package day0228;

import java.util.Date;

/**
 * 추상 method 가 하나인 interface
 */
@FunctionalInterface
public interface LambdaTypeD {
//	현재는 1개의 method 가질 수 있음
	/**
	 * 반환형 있고, 매개변수 있는 형
	 */
	public String test(Date date);
//	public void test2(); interface 2개 method 가질수 있음, 대신 @ 주석처리해야함
	
} //interface
