package day0131;

/**
 * 사용자 정의 데이터 형 (값을 저장할 목적으로 생성)
 *  Java 에서 제공하는 데이터형을 모아 새로운 이름의 데이터 형을 만들어 사용
 *  학생의 정보를 저장할 목적의 데이터형 생성
 */
public class StudentInfo {
	private int num; //학생을 식별하기 위한 번호
	private String name; //학생 이름
	private String email; //학생 이메일
	private int age; //학생 나이
	private double height; //학생의 키
	private double weight; //학생의 몸무게
	
	/**
	 * 기본생성자를 사용하여 객체화:
	 * 학생번호=0, 학생명=null, 이메일=num, 나이=0; 키=0.0; 몸무게=0.0;
	 */
	public StudentInfo() {
	} //StudentInfo 기본 생성자
	
	/**
	 * @param num 학생의 번호
	 * @param name 학생의 이름
	 * @param email 학생의 이메일
	 * @param age 학생의 나이
	 * @param height 학생의 키
	 * @param weight 학생의 몸무게
	 */
	public StudentInfo(int num, String name, String email, int age, double height, double weight) {
		this.num=num;
		this.name=name;
		this.email=email;
		this.age=age;
		this.height=height;
		this.weight=weight;
	} //StudentInfo 매개변수 있는 생성자
	
	public void setNum(int num) {
		this.num=num;
	} //setNum
	
	public int getNum() {
		return num;
	} //getNum
	
	public void setName(String name) {
		this.name=name;
	} //setName
	
	public String getName() {
		return name;
	} //getName
	
	public void setEmail(String email) {
		this.email=email;
	} //setEmail
	
	public String getEmail() {
		return email;
	} //getEmail
	
	public void setAge(int age) {
		this.age=age;
	} //setAge
	
	public int getAge() {
		return age;
	} //getAge
	
	public void setHeight(double height) {
		this.height=height;
	} //setHeight
	
	public double getHeight() {
		return height;
	} //getHeight
	
	public void setWeight(double weight) {
		this.weight=weight;
	} //setWeight
	
	public double getWeight() {
		return weight;
	} //getWeight

} //class
