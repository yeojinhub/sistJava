package day0205;

/**
 * 프로그램에서 값(사용자 정의 데이터형)을 저장할 목적으로 생성하는 클래스
 * 다른 클래스와 차별화를 두기 위해 클래스명 뒤에 VO 를 붙여줌
 */
public class StudentScoreVO {

	private int num;
	private String name;
	private int java;
	private int oracle;
	private int jdbc;
	private int html;
	
	public StudentScoreVO() {
		System.out.println("안녕하세요?"); //method 호출
	} //StudentScoreVO
	
	public StudentScoreVO(int num, String name, int java, int oracle, int jdbc, int html) {
		super();
		this.num = num;
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.jdbc = jdbc;
		this.html = html;
	} //StudentScoreVO

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getJdbc() {
		return jdbc;
	}

	public void setJdbc(int jdbc) {
		this.jdbc = jdbc;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	
	
	

} //class
