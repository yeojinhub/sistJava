package day0122;

/**
 * 2개의 정수 값을 입력받아 더한 값을 출력하는 method 만들기
 */
public class Test {
//	1. plus method 정의
	public static void plus(int num, int num2) {
		int result=0;
		result=num+num2;
		System.out.println(num+"+"+num2+"="+result);
	} //plus

	public static void main(String[] args) {
//		2. 호출
		Test.plus(2,1);
		
	} //main

} //class
