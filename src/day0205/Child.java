package day0205;

import java.util.Date;
import java.util.StringTokenizer;

/**
 * 자식 클래스
 * extends 키워드로 부모클래스 선택
 * 자식클래스에서은 선택한 부모클래스의 자원을 자식의 객체명으로 사용가능 = 코드의 재사용성
 */
public class Child extends Parent{
	
	private String name;

	public String getName() {
		return name;
	} //getName

	public void setName(String name) {
		this.name = name;
	} //setName

	public static void main(String[] args) {
//		자식클래스로 생성
		Child c=new Child();
		c.setName("이여진");	//자식클래스의 method
		c.setAge(29);		//부모클래스의 method
		System.out.printf("이름 : %s, 나이 : %d\n",c.getName(),c.getAge());
		
		String str=new String("집가기 1시간 전");
		Date date=new Date();
		StringTokenizer stk=new StringTokenizer(str);
		
		System.out.println(c);		//객체를 출력하면 heap 의 주소가 출력
		System.out.println(c.toString());		//객체를 출력하면 heap 의 주소가 출력 : Object.toString()호출
		System.out.println(str.toString());	//객체를 출력하면 heap 의 주소가 출력
		System.out.println(date);	//입력된 객체의 toString() 을 호출하여 리턴값을 출력
		System.out.println(stk);	//객체를 출력하면 heap 의 주소가 출력
		
		c.toString();
		date.toString();
		stk.toString();
		
	} //main
	
//	@Override
//	public String toString() {
//		return "나는 주소가 싫어요!!";
//	} //toString

} //class
