package day0207;

/**
 * 객체화하지 않고, 제공되는 method 호출하여 일을 수행하는 클래스
 * Math 사용하는 예제
 */
public class UseMath {
	
//	private static String password=null;

	public static void main(String[] args) {
//		Math mt=new Math(); //생성자가 없어 error
		int i=7;
		double d=-2.7;
		
		int iResult=Math.abs(i);
		double dResult=Math.abs(d);
		
		System.out.println("i의 절대값 : "+iResult);
		System.out.println("d의 절대값 : "+dResult);
		
		d=2.4;
//		소숫점 이하 첫번째 자리에서만 반올림
		System.out.println("d의 절대값 : "+d);
		System.out.println("d의 반올림한 값 : "+Math.round(d));
		
//		무조건 올림
		d=2.000001;
		System.out.println("d의 올림한 값 : "+Math.ceil(d));
		
//		무조건 내림
		d=2.7;
		System.out.println("d의 내림한 값 : "+Math.floor(d));
		
//		정수형으로 변경
		System.out.println(d+"d의 실수부를 절사 "+(int)d);
		
//		난수
		d=Math.random();
		System.out.println("발생한 난수 : "+d);
		System.out.println("범위의 난수 : "+d*10);
		System.out.println("난수 정수만 얻기 : "+(int)(d*10));
		
//		객체생성
		UseMath um=new UseMath();
		
//		비밀번호 char[] 배열에 저장
//		char[] password=um.setPassWord();
		
//		콘솔에 출력
		um.printMsg(um.setPassWord());
	} //main
	
//	비밀번호 생성하고 반환 method
	public char[] setPassWord() {
//		비밀번호는 8자 : 대문자(65~90), 소문자(97~122), 숫자(48~57) 포함
		char[] tempPass=new char[8];
		int tempChar=0;
//		String temp="QWERqwer12346789";
		for(int i=0; i<tempPass.length; i++) {
//			tempPass[i]=temp.charAt((int)Math.random()*temp.length());
			tempChar=(int)(Math.random()*123);
			if((tempChar>47 && tempChar<58) || (tempChar>64 && tempChar<91)
					|| (tempChar>96 && tempChar<123)){
				tempPass[i]=(char)tempChar;
			} else {
				i--;
			} //end else

		} //end for
		
		return tempPass;
	} //setPassWord
	
//	비밀번호 출력 method
	public void printMsg(char[] tempPass) {
		System.out.println(tempPass);
	} //printMsg

} //class
