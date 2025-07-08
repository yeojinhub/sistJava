package day0121;

/**
 * instance(member) variable 사용
 *  객체마다 생성되고 사용되는 변수
 *  객체화 후 객체명.변수명 으로 사용
 *  객체마다 같은 이름의 변수가 생성
 */
public class UseInstanceVariable {
//	1. 변수의 선언
	public int i;
	
	public void temp() {
		i=100;
	}
	
	public static void main(String[] args) {
		
//		2. static 영역에서 instance 변수를 사용하기 위해 객체화 선행
//		객체화의 문법 : 클래스명 객체명=new 클래스명();
		
		UseInstanceVariable uiv=new UseInstanceVariable(); //uiv 객체 생성
		UseInstanceVariable uiv2=new UseInstanceVariable(); //uiv2 객체 생성

//		3. 값 할당 객체명.변수명=값
		uiv.i=10; //uiv 객체마다 같은 이름의 변수 i가 존재
		uiv2.i=21; //객체마다의 변수 i에 다른 값 할당

//		4. 값 사용 객체명.변수명
		System.out.println("uiv 객체의 변수 i : "+uiv.i);
		System.out.println("uiv2 객체의 변수 i : "+uiv2.i);
	} //main

} //class
