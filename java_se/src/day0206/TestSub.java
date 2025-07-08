package day0206;

/**
 * TestSuper 의 자식클래스
 */
public class TestSub extends TestSuper{

	int i; //부모와 같은 이름의 변수
	
	public TestSub() {
//		this(100);
		System.out.println("자식의 기본생성자 : "+i);
	} //TestSub
	
	public TestSub(int i) {
//		super(21);
		this();
		this.i=i;
		System.out.println("자식의 매개 생성자 : "+i);
	} //TestSub 매개변수 있는 method
	
} //class
