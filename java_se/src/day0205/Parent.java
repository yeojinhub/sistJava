package day0205;

/**
 * 부모클래스 : 자식클래스들에서 공통적으로 사용하는 값이나 업무를 구현
 */
public class Parent {
	private int age;

	/**
	 * 부모의 getter method
	 * @return age 부모가 가진 변수값
	 */
	public int getAge() {
		return age;
	} //getAge

	/**
	 * 부모의 setter method
	 * @param age 부모 변수에 설정값
	 */
	public void setAge(int age) {
		this.age = age;
	} //setAge

} //class
