package day0131;

/**
 * this 의 method 형식
 * 문법
 *  this(); //기본 생성자를 호출
 *  this(값); //매개변수 있는 생성자를 호출
 *  
 *  생성자 안에서 객체 생성 없이 다른 생성자를 호출할 때 사용
 *  생성자의 첫 줄에서만 this 기술 가능
 *  재귀호출이 될 가능성이 있다면 error 발생
 */
public class UseThis {
	int i; //instance variable : 객체가 생성되는 자동 초기화
	
	/**
	 * default constructor
	 */
	public UseThis() {
//		i=2025;
//		new UseThis(2025); //또 하나의 객체가 생성되고 그 객체가 가진 member variable 에 값을 할당
//		this(2025); //생성자의 첫 줄에서만 this 기술 가능
		System.out.println("UseThis의 기본 생성자 호출");
	} //UseThis 기본 생성자

	/**
	 * 매개변수 있는 생성자
	 * @param i
	 */
	public UseThis(int i) {
		this();
		this.i=i;
		System.out.println("UseThis의 매개변수 있는 생성자 호출");
	} //UseThis 매개변수 있는 생성자
	
	public static void main(String[] args) {
		UseThis ut=new UseThis(2025); //객체생성 : 객체화
		System.out.printf("ut객체(주소 : %s)가 가진 i값 %d\n", ut,ut.i);
	} //main

} //class
