/*
지역 변수를 사용하기 위한  class
*/
package day0114;

class  LocalVariable {
	int dayOfMonth; //instance(member) variable : class field 영역
	/*
	Java Application을 생성하기 위한 method.(main method)
	*/
	public static void main(String[] args) { //local
		
		//1. 선언) 데이터형 변수명; //초기화 값이 들어가지 않는다.
		int nowYear;
		//현재월을 저장하는 변수를 선언하고
		int nowMonth;
		
		//하나의 영역에서는 같은 이름의 변수 선언을 하나만 할 수 있다.
		//int nowYear; //error
		
		/*영역이 다르면 같은 이름의 변수는 선언할 수 있다.
		(class field와 local은 영역이 다르므로 dayOfMonth 변수를 선언 할 수 있다.		
		*/
		int dayOfMonth;
		
		//2. 값 할당) 변수명=값;
		nowYear=2025;
		//현재월을 할당하고
		nowMonth=1;
		dayOfMonth=14;
		//3. 값 사용) 출력, 연산, 재할당
		/*
		지역변수는 자동초기화가 되지 않고, 개발자가 초기화를 수동으로 해주어야한다.
		초기화 값을 설정하지 않은 변수를 사용하면 에러가 발생
		*/
		System.out.print(nowYear+"년"); 
		//출력
		System.out.print(nowMonth+"월");
		System.out.println(dayOfMonth+"일");
		
		//내일을 출력하고 싶다. 14-> 15일 출력: 변수는 변하는 수(바뀜)
		//변수는 값할당을 여러번 할 수 있다.
		dayOfMonth=15;
		System.out.println(nowYear+"년"+nowMonth+"월"+dayOfMonth+"일"); //같은 이름의 변수지만 다른 값이 출력
		
		//변수명은 한글로도 가능하다(한글로 변수를 선언하지 않는다)
		int  내나이=29;
		System.out.println("나의 나이는 "+ 내나이+"살");
	} //main
} //class
