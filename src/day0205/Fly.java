package day0205;

/**
 * 날아다니는 생물의 목록 정의
 */
public interface Fly {
	
	/**
	 * 날기 위해서는 양력이 있어야한다
	 * @return 양력
	 */
	public abstract String lift();
	
	/**
	 * 날기 위해서는 추진력이 있어야한다.
	 * @return 추진력
	 */
	public String thrust();

}
