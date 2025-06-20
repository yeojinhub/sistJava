package day0221;

@SuppressWarnings("serial")
public class MultiplicationException extends Exception{
	
	public MultiplicationException() {
		super("구구단은 2~9단까지 있음");
	} //MultiplicationException
	
	public MultiplicationException(String msg) {
		super(msg);
	} //변수가 있는 MultiplicationException
} //class
