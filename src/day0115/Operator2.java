package day0115;
/**
산술 연산자 : 이항연산(binary operator)
+, -, *, /, %

사용법

대상체 연산자 대상체
*/

class Operator2 { 
	public static void main(String[] args) {
		int year=2025;
		System.out.println(year+"는 0,1,2,3 숫자의 4가지 중 나머지가 "+year%4+"입니다.");
		
		int num=9;
		System.out.println(num+"는 0,1,2 숫자의 3가지 중 나머지가 "+num%2+"입니다.");
		
		int birthYear=1997;
		System.out.println(birthYear+"은 0~11 숫자 중 나머지가 "+birthYear%12+"입니다.");
		
		/*
		0=원숭이, 1=닭, 2=개, 3=돼지, 4=쥐, 5=소,
		6=호랑이, 7=토끼, 8=용, 9=뱀, 10=말, 11=양
		
		
		*/
	} //main
} //class
