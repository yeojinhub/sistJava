package day0114;
/**
강제 형 변환 :
- 개발자가 필요한 데이터형으로 일시적인 변환을 하는 것
- 값 손실이 발생할 수 있다
*/

class Casting {
	public static void main(String[] args) 	{
		//실수 상수 앞에 casting
		float floatValue;
		floatValue=(float)1.14; //리터럴은 8byte이고 casting하여 값을 4byte로 변환
		System.out.println(floatValue);
		
		//변수 앞에 casting
		double doubleValue=1.14;
		//int i=doubleValue; //데이터 형과 크기가 다르므로 할당 되지 않음
		int i=(int)doubleValue; //값 중에 정수만 저장 (값 손실 발생) > 1 할당
		System.out.println(i);
		
		char c='A';
		//i=c;
		//System.out.println(i);
		System.out.println(c+" 문자의 unicode 값 : "+(int)c);
		c='\u0000';
		System.out.println("["+(int)c+"]");
		
		byte num=10;
		byte num2=20;
		byte result=(byte)(num+num2);
		
		System.out.println(num+"+"+num2+"="+result);
		
		//casting이 되지 않는 상황
		//boolean 형은 다른 데이터형으로 casting이 되지 않음
		boolean flag=true;
		boolean flag2=(boolean)flag; //boolean은 boolean으로만 casting가능
		
		//기본 형 데이터형이 참조된 데이터형으로 변환되지 않는다.( 그 반대도 불가 )
		String str="10"; //문자열의 10 > 연산되지 않음
		//i=10; //정수의 10 > 연산됨
		//i=str; //문자열(참조형)은 기본형에 할당되지 않음
		//i=(int)str; //casting 불가
		
		//str=i; //기본형(int)는 문자열(참조형)으로 할당 불가
		//str=(String)i; //casting 불가
	} //main
} //class
