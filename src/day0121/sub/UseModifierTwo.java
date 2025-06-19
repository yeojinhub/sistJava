package day0121.sub;

import day0121.ModifierA;
//import day0121.ModifierB;

/**
 * 다른 package 에 존재하는 클래스를 사용하는 클래스
 */
public class UseModifierTwo {

	public static void main(String[] args) {
		ModifierA ma=new ModifierA(); //public 접근지정자를 가진 클래스
//		ModifierB mb=new ModifierB(); //package 접근지정자는 같은 패키지안에서만 가능
		
		System.out.println("public 접근지정자 : "+ma.a);
//		System.out.println("protected 접근지정자 : "+ma.b); //protected 변수 접근불가
//		System.out.println("default 접근지정자 : "+ma.c); //default 변수 접근불가
//		System.out.println("private 접근지정자 : "+ma.d); //private 변수 접근불가
		
	} //main

} //class
