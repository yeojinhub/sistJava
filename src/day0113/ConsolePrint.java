package day0113;

class ConsolePrint {
	public static void main(String[] args) 	{
		/*
		System.out.println("안녕 Java");
		System.out.println("오늘은 월요일입니다.");	
		
		System.out.print("안녕 Java");
		System.out.print("오늘은 월요일입니다.");
		*/
		//상수 출력
		System.out.println(2025); //정수상수
		System.out.println(1.13); //실수상수
		System.out.println('A'); //문자상수
		System.out.println("AB"); //문자열상수
		System.out.println(false); // boolean상수
		System.out.println(); //공백
//		System.out.print(); API에서 제공하지 않는 method는 사용할 수 없다.		
		//변수 출력
		int i=21;
		System.out.println(i); //기본형 데이터형은 변수의 값이 출력된다.
		
		ConsolePrint cp=new ConsolePrint();
		System.out.println(cp); //참조형 데이터형은 주소가 출력된다.
		
		//연산식 : 연산된 결과만 출력된다.
		System.out.println(1+13);
		//문자열의 +
		System.out.println("1+13="+(1+13));
		
		System.out.println("정수상수 :"+ 2025);
		System.out.println("변수:"+i);
		System.out.println("참조형 데이터형:"+cp);
		
	}//main
}//class
