package day0206;

/**
 * Override 가 필요한 자식 클래스
 * 부모클래스 : OverrideSuper.java
 */
public class OverrideSub extends OverrideSuper{
	
	int day; //부모클래스의 변수와 동일한 변수 선언
	
	@Override //Override 규칙에 맞게 제대로 작성되었는지 Complier 가 대신 확인
	public void helloMsg() {
		System.out.println("오늘은 목요일입니다.");	
	} //helloMsg
	
	@Override //부모클래스에 final method 는 Override 불가능
	public void helloMsg2() {
		System.out.println("안녕하세요.");
	} //helloMsg2
	
	public void useSuper() {
		System.out.println(this);	//this 는 출력 가능
//		System.out.println(super);	//super 는 출력 불가능
//		this 가 숨어있다.
		age=25; //부모와 자식간의 같은 이름의 변수가 없다면 부모의 변수사용
		System.out.println("부모의 변수 : "+age);
		day=6;	//부모와 자식간에 같은 이름의 변수가 있다면 자식의 변수를 사용
		System.out.println("자식의 변수 : "+day);
//		부모와 자식간에 같은 이름의 변수가 있을 때 부모의 변수를 사용.
		super.day=5;
		System.out.printf("자식의 변수 : %d, 부모의 변수 : %d\n",
				this.day,super.day);
	} //useSuper

	public static void main(String[] args) {
//		자식으로 객체화
		OverrideSub os=new OverrideSub();
		os.helloMsg();
		os.helloMsg2();
		
//		is a 관계의 객체화 : 부모클래스명 객체명=new 자식클래스의생성자();
//		Ovrriding : 자식의 method 가 최우선적으로 호출된다.
		OverrideSuper os2=new OverrideSuper();
		os2.helloMsg();
		os2.helloMsg2();
		
		System.out.println("===============================");
		os.useSuper();
	} //main

} //class
