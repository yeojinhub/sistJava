package day0206;

/**
 * 키보드 내용이 입력되어있는 클래스
 */
public abstract class Keyboard {
	
	
	public abstract String getName(String name);
	public abstract int getPrice(String name);
	public abstract String getType(String name);
	
	public abstract void printMsg();

} //class
