package day0122;

/**
 * 특수문자
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		
		System.out.println(" \"안녕하세요?\" ");
		System.out.println("안녕\r\n하세요?");
		System.out.println("안녕\t하세요?");
		System.out.println("안녕\'하/' '세'요?");
		System.out.println("안녕\"하'세'\"요?");
		System.out.println("c:\\dev\\test\\temp.txt"); //자바에서 경로 표현 \\ 로 표현
		System.out.println("ABC\bDEF"); // \b > backspace
		
	} //main

} //class
