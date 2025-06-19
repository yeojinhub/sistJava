package day0221;

/**
 * 담배와 관련된 클래스를 작성하여 예외처리
 * 업무명 + Exception 을 클래스명으로 설명
 * 기본생성자 : 예외발생시 고정적인 메세지를 설정할 때 사용
 * Overload 생성자 : 예외발생시 사용자가 설정한 메세지로 출력할 때 사용
 */
@SuppressWarnings("serial")
public class TabaccoException extends Exception{
	
	public TabaccoException() {
		this("지나친 흡연은 건강에 해롭습니다.");
	} //TabaccoException

	public TabaccoException(String msg) {
		super(msg);
	} //변수가 있는 메소드 TabaccoException
	
} //class
