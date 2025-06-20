package day0122;

/**
 * method 의 4가지 형태
 */
public class MethodType {

	/**
	 * 고정일 = 항상 같은 일을 수행
	 * 반환 값 없음, 매개 변수 형
	 */
	public void typeA() {
		System.out.println("고정일");
	} //typeA
	
	/**
	 * 가변일 = 입력되는 값에 따라 다른 일을 수행
	 * @param param 입력되는 값
	 */
	public void typeB(int param) {
		System.out.println("가변일 : "+param);
	} //typeB
	
	/**
	 * 고정 값 = 항상 같은 값을 반환
	 * @return 2025년
	 */
	public int typeC() {
		int year=2025;
		return year;
	} //typeC
	
	/**
	 * 가변 값 = 반환형 있고, 매개변수 있는 형
	 * @param d 입력값(실수)
	 * @return (int)d 반환값(정수로 변환)
	 */
	public int typeD(double d) {
		return (int)d;
	} //typeD
	
	public static void main(String[] args) {

//		객체화 : 클래스명 객체명 = new 클래스명();
		MethodType mt = new MethodType();
//		method 호출
		System.out.println("----------고정일 호출----------");
		mt.typeA();
		System.out.println("----------가변일 호출----------");
		mt.typeB(21);
		mt.typeB(22);
		System.out.println("----------고정 값 호출----------");
		mt.typeC();
//		반환형이 있는 method 는 값이므로 사용(출력, 연산, 재할당)해야한다
		System.out.println("출력 : "+mt.typeC());
		System.out.println("연산 : "+(mt.typeC()+1));
//		재할당
		int i=mt.typeC();
		System.out.println("재할당 : "+i);
		
		System.out.println("----------가변 값 호출----------");
		mt.typeD(2025.1);
//		반환형이 있는 method 는 값이므로 사용(출력, 연산, 재할당)해야한다
		System.out.println("출력 : "+mt.typeD(1.22));
		System.out.println("연산 : "+(mt.typeD(2025.01)+1));
//		재할당
		i=mt.typeD(3.16);
		System.out.println("재할당 : "+i);
		
	} //main

} //class
