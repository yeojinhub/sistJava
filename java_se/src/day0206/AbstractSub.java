package day0206;

/**
 * AbstractSuper 를 상속받는 자식클래스
 */
public class AbstractSub extends AbstractSuper{

	@Override
	public int getI() {
		 return 2025;
	} //getI
	
	public void printMsg(String msg) {
		System.out.println(msg);
//		super.printMsg(msg);				//추상 method 는 super 로 호출 불가능 : error
	} //printMsg
	
	@Override
	public String toString() {
		return "안녕 : "+ super.toString();	//일반 method 는 super 호출 가능
	}
	
	public static void main(String[] args) {
//		추상클래스는 상속관계의 자식클래스가 생성될 때에만 생성
		AbstractSub as=new AbstractSub();
		System.out.println(as.getI());
		as.printMsg("안녕하세요?");
		
//		is a 관계의 객체화를 하여 getI(), printMsg() method 호출
		AbstractSub as2=new AbstractSub();
		System.out.println(as2.getI());
		as2.printMsg("안녕하세요?");
		
//		System.out.println(); 에 as 객체를 넣었을 때, "안녕?" 메세지 뒤에 객체의 주소를 출력
		System.out.println(as);
	} //main

} //class
