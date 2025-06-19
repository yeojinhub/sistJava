package day0203;

/**
 * 문제
 * method 에 parameter 로 이메일을 입력받아,
 * 이메일의 유효성 검증을 수행하고, 수행 결과를 반환하는 method 작성
 * 
 * 이메일은 7자 이상이어야하며, @과 .이 있어야한다.
 * 수행 결과는 7자보다 작은 경우에는 '이메일의 길이가 유효하지 않습니다.'를 반환
 * @이 없는 경우에는 '@ 기호가 없다.'를 반환
 * .이 없는 경우에는 '. 기호가 없다.'를 반환
 * 
 * 호출하여 사용해보자
 */
public class Exam0203 {
	public static String emailLength = null;

	public static String emailLength(String email) {
		
		if(email.length()>8) {
			if(email.contains("@")) {
				if(email.contains(".")) {
					emailLength="정상적인 이메일입니다.";
				} else {
					emailLength="이메일에 . 기호가 포함되어 있지 않습니다.";
				} //end if
			} else {
				emailLength="이메일에 @ 기호가 포함되어 있지 않습니다.";
			} //end if
		} else {
			emailLength ="이메일의 길이가 유효하지 않습니다.";
		} //end if
		
		return emailLength;
	} //emailLength
	
//	public static String atIndex{ dotIndex
	
	public static void main(String[] args) {
		String email=args[0];
		System.out.println("입력한 이메일의 값 : "+email);
		
		System.out.println(emailLength(email));

	} //main

} //class
