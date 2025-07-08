package day0122;

/**
 * JDK1.5 부터 지원되는 Variable Arguments 의 사용
 * 매개변수는 하나이지만 인수(입력값(argument))를 여러개 넣을 수 있는 기능
 */
public class UseVariableArguments {
	
	/**
	 * Variable Arguments 의 사용 
	 * @param va 정수값을 입력가능
	 */
	public void vaMethod(int ... va) {
//		Variable Arguments 는 배열로 처리
//		System.out.println(va);
		for(int i=0; i<va.length; i++) {
			System.out.println(va[i]);
		}
	} //vaMethod
	
//	Variable Arguments 는 단일형의 parameter 과 함께 정의하면 가장 마지막에 정의
	public void va2(int i, int ...j) {
		
	} //va2
	
	public void va3(int i, char c, int ...j) {
		
	} //va3
//	Variable Arguments 는 가장 마지막에만 정의해야함
//	public void va4(int ... i, int j) {
//	} //va4

	public static void main(String[] args) {
//		객체화 : 클래스명 객채명=new 클래스명();
		UseVariableArguments uva = new UseVariableArguments();
//		Variable Arguments 를 가지고 있는 method 를 호출
		uva.vaMethod();
		System.out.println("--------------------------");
		uva.vaMethod(1);
		System.out.println("--------------------------");
		uva.vaMethod(1,2,3,4,5,6,7);
		
	} //main

} //class
