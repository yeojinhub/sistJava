package day0205;

/**
 * 홍길동은 사람(Person 클래스에서 제공되는 자원을 사용)이고,
 * 다른 사람과의 차별점은 싸움을 잘한다
 * 사람의 평균 싸움레벨=2, 최대 싸움레벨=10
 * 홍길동 싸움레벨=6
 */
public class HongGilDong extends Person {
	
	private int level;

	/**
	 * 홍길동 싸움레벨=6 로 생성
	 */
	public HongGilDong() {
		super();
		level=6;
		System.out.println(level);
	} //HongGilDong

	public int getLevel() {
		return level;
	} //getLevel

	/**
	 * 싸우는 일을 하는 method
	 * @param yourLevel 상대방의 레벨
	 * @return result 싸움의 결과값 반환
	 */
	public String fight(int yourLevel) {
		String result="";
		
		if(level<yourLevel) {			//싸움에서 지는 경우 : 레벨 1 하향
			level--;
			if(level<1) {
				level=1;
			} //end if
			result="싸움 패배";
		} else if(level > yourLevel) {	//싸움에서 이기는 경우 : 레벨 1 상승
			level++;
			if(level>10) {
				level=10;
			} //end if
			result="싸움 승리";
		} else {						//싸움에서 비기는 경우
			result="싸움 무승부";
		} //end else
		return result;
		
		
	} //fight	

	@Override
	public String eat(String menu, int price) {
		return getName()+"이가 주막에서 "+menu+" 음식을 "+price+"전 내고 사먹는다.";
	}
	
	public Person getPerson() {
		return this;
	} //getPerson
	
} //class
