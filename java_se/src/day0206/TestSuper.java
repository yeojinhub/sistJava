package day0206;

/**
 * 부모클래스
 */
public class TestSuper {
	
	int i;
	int j;
	
	public TestSuper() {
		i=21;
		System.out.println("부모 기본생성자 : "+i);
	}  //TestSuper

	public TestSuper(int i) {
		this();
		this.i=i;
		System.out.println("부모 매개생성자 : "+i);
	} //TestSuper 매개변수 있는 method

} //class
