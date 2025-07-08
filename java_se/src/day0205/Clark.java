package day0205;

/**
 * 홍길동은 사람(Person 클래스에서 제공되는 자원을 사용)이고,
 * 다른 사람과의 차별점은 싸움을 잘한다
 * 사람의 평균 싸움레벨=2, 최대 싸움레벨=10
 */
public class Clark extends Person implements Fly{
	public int power;
	
	public Clark() {
		super();
		power=10;
	} //Clark
	
	/**
	 * 돌 종류에 따라 슈퍼맨의 힘이 달라진다
	 * @param stone 돌의 종류
	 * @return result 입력되는 돌에 대한 결과값
	 */
	public String power(String stone) {
		String result="";
		
		if(stone.equals("다이아몬드")) {
			result="감사합니다.";
			power=10;
		} else if(stone.equals("크립토나이트")) {
			result="대응할 힘이 없습니다.";
			power=0;
		} else {	//일반 돌
			result="";
			power=12;
		} //end else
		return result;
	} //power
	
	@Override
	public String eat() {
		return super.eat();
	} //eat

	@Override
	public String eat(String menu, int price) {
		return getName()+"이가 레스토랑에서 "+menu+" 음식을 "+price+"달러 내고 사먹는다.";
	} //eat 매개변수 있는 method
	
	public Person getPerson() {
		return this;
	} //getPerson

	@Override
	public String lift() {
		return "망토에서 얻기";
	} //lift

	@Override
	public String thrust() {
		return "무릎을 꿇어서 얻기";
	} //thrust
	
	
	
} //class
