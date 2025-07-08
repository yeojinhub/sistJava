package day0122;

/**
 * instance method 사용
 *  instance variable, static variable, local variable 을 사용하여 업무를 처리할 때 정의
 */
public class UseInstanceMethod {
	
	int dayOfMonth; //instance variable
	
	/**
	 * instance variable 를 사용하여 콘솔에 날짜를 출력
	 */
	public void printDay() {
		System.out.println(dayOfMonth+"일");
	} //printDay

	public static void main(String[] args) {
//		printDay(); //static 영역에서는 instance 영역의 자원을 직접 사용불가
		
//		2. 객체화 클래스명 객체명=new 클래스명();
		UseInstanceMethod uim =new UseInstanceMethod();
//		3. 호출
		uim.printDay(); //0일 출력
		uim.dayOfMonth=22;
		uim.printDay(); //22일 출력
//		instance variable 은 객체가 유지되는 동안 값이 유지
		uim.dayOfMonth++; //22->23    
		uim.dayOfMonth++; //23->24
		uim.printDay(); //24일 출력
		
//		instance variable 은 객체마다 같은 이름의 변수가 생성되고 사용(객체마다 따로 생성)
		UseInstanceMethod uim2=new UseInstanceMethod();
		uim2.dayOfMonth=31;
		
		uim.printDay(); //24
		uim2.printDay(); //31
		
	} //main

} //class
