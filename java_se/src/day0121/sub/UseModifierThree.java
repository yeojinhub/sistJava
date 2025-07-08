package day0121.sub;

import day0121.ModifierA;

/**
 * 다른 package 에 존재하는 클래스를 상속받은 자식 클래스
 * 자식 클래스에서는 부모 클래스의 자원(변수, method)을 사용가능 - 코드 재사용성
 */
public class UseModifierThree extends ModifierA{

	public static void main(String[] args) {
//		상속 관계에서는 자식 클래스를 생성하여 부모 클래스의 변수나 method 사용가능
		UseModifierThree um3 = new UseModifierThree();
		System.out.println("public 접근 지정자 : "+um3.a); //부모 클래스의 public 사용가능
		System.out.println("protected 접근 지정자 : "+um3.b); //부모 클래스의 protected 사용가능
//		System.out.println("default 접근 지정자 : "+um3.c); //부모 클래스의 default 사용불가
//		System.out.println("private 접근 지정자 : "+um3.d); //부모 클래스의 private 사용불가
	} //main

} //class
