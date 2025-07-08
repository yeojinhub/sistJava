package day0205;

import java.util.ArrayList;
import java.util.List;

/**
 * annotation 사용예제
 */
public class UseAnnotation {
	
	@Deprecated
	public void test() {
		System.out.println("제대로 일할줄 알았는데..");
	} //test
	
	@Override
	public String toString() {
		return "heap 주소 대신 메세지!";
	} //toString
	
	@SuppressWarnings({"unused","rawtypes"})	//한꺼번에 써버리기
	public void temp() {
//		@SuppressWarnings("unused")
		int i;
//		@SuppressWarnings("unused")
		int j;
		
//		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
	}

	public static void main(String[] args) {
		UseAnnotation ua=new UseAnnotation();
		ua.test();
		System.out.println(ua);
	} //main

} //class
