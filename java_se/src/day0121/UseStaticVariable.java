package day0121;

/**
 * static 변수의 사용
 */
public class UseStaticVariable {

//	1. 선언 ) : 접근 지정자 static 데이터형 변수명;
	public static int i; 
	
//	기본값으로 변수는 자동 초기화
	public static int a; //정수형 변수는 default value=0
	public static char c; //문자형 변수 default value='\u0000'
	public static double d; //실수형 변수 default value=0.0
	public static boolean b; //불린형 변수 default value=false
	
	public static UseStaticVariable usv; //참조형 클래스 default value=null
	public static String str; //참조형 String default value=null
	public static int[] arr; //참조형 array default value=null
	
	public static void main(String[] args) {
//		2. 값 할당 ) 클래스명.변수명=값; 변수명=값;
		UseStaticVariable.i=21;
//		i=1;

//		3. 사용 ) 클래스명.변수명; 변수명;
		System.out.println(UseStaticVariable.i);
//		System.out.println(i);
		
//		객체화 : static 변수를 가진 클래스로 몇개의 객체를 생성하든 static 변수는 하나만 생성
//		UseStaticVariable usv = new UseStaticVariable();
//		UseStaticVariable usv2 = new UseStaticVariable();
//		
//		usv.i=100; //usv객체의 i 변수값 변경
//		System.out.println("usv객체명으로 사용하는 i "+usv.i); //static 변수는 특정 객체에 속해있는 변수가 아니므로
////		객체명.변수명(usv.i)의 형태로 접근가능하나 올바른 문법은 아님
//		System.out.println("usv2객체명으로 사용하는 i "+usv2.i); //usv2.i 값도 같이 변경됨
		
		//static variable, instance variable 의 default value 출력
		System.out.println("정수형 : "+a);
		System.out.println("문자형 : ["+c+"]");
		System.out.println("실수형 : "+d);
		System.out.println("불린형 : "+b);

		System.out.println("참조형 class : "+usv);
		System.out.println("참조형 String : "+str);
		System.out.println("참조형 int array : "+arr);
		
	} //main

} //class
