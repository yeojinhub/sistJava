package day0114;
/**
자바에서 제공하는 primitive type의 사용
*/

class DataType {
	public static void main(String[] args) {
		System.out.println("정수 상수를 저장할 수 있는 데이터형");
		byte byteValue; //signed value : -128 ~ +127
		byteValue=-128;
		System.out.println("byte : " + byteValue);
		
		short shortValue=-32768;
		System.out.println("short : "+shortValue);
		
		int intValue=-2147483648;
		System.out.println("int : "+intValue);
		
		long longValue=14;
		System.out.println("long : "+longValue);
		//내 목표 자산액을 변수로 선언하고 출력
		long asset=5000000000l; //literal의 크기를 변경하여야 초과되는 값을 저장할 수 있다
		//long asset=2147483648; //error
		System.out.println("모으고 싶은 자산은:"+asset);
		
		byte num1=10; //demotion 동작
		byte num2=20; //demotion 동작
		//byte result=0;
		int result=0;
		
		result=num1+num2; //byte가 연산되면 결과가 int로 promotion되기때문에 int에 할당
		System.out.println(num1+"+"+num2+"="+result);
		
		System.out.println("문자 상수 값을 저장할 수 있는 데이터형");
		//char upperCase='A'; //'로 감싸진 영문자 한자 : 할당되는 값은 unicode가 저장된다.
		char upperCase=65; //unicode 코드값을 직접 할당
		char lowerCase='a';
		char number='0'; //'로 감싸진 숫자 한자
		char hangul;
		char temp='\uFFFF'; //0~65535 unsigned value
		
		System.out.println("char : "+upperCase+", "+lowerCase+", "+number
			+", ["+temp+"]");
		
		System.out.println("실수 상수 값을 저장할 수 있는 데이터형");
		float floatValue;
		//floatValue=1.14; //literal의 크기는 8byte이고 데이터형은 4byte이므로 error 발생	
		//형명시 필수! literal의 크기를 8byte에서 4byte로 변경하는 현명시가 필요
		floatValue=1.14F;
		System.out.println("float : "+floatValue);
		
		double doubleValue;
		//doubleValue=1.14; //형명사를 생략한다
		doubleValue=1.14D;
		
		System.out.println(Math.random()); //15~16가지의 출력값 길이가 매번 랜덤으로 다름
		
		System.out.println("불린 상수 값을 저장할 수 있는 데이터형");
		boolean flag=true;
		boolean flag2=false;
		System.out.println("boolean : "+flag+", "+flag2);
		
		byte b=10;
		byte b2=20;
		int c=b+b2;
		
	} //main
} //class
