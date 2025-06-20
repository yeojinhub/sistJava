package day0131;

/**
 *  사용자 정의 자료형을 사용하는 클래스
 */
public class UseStudentInfo {
	
	public void printStudentInfo(StudentInfo stuInfo) {
		System.out.println("-----------------------");
		System.out.println("학생이름 : "+stuInfo.getName());
		System.out.printf("학번[%d]\t이메일[%s]\n나이[%d]\t키[%.1f]\t몸무게[%.1f]\n",
				stuInfo.getNum(),stuInfo.getEmail(),
				stuInfo.getAge(), stuInfo.getHeight(), stuInfo.getWeight());
		System.out.println("-----------------------");
	} //printStudentInfo

	public static void main(String[] args) {
//		1번, 유연수, yoo@test.com, 25살, 171.0, 55.0 인 정보를 저장
//		2번, 이여진, lee@test.com, 29살, 165.0, 44.0 인 정보를 저장
//		위의 정보를 Java 에서 제공하는 데이터형으로 저장
//		기본 생성자를 사용한 값 설정
		StudentInfo yooInfo=new StudentInfo();
		yooInfo.setNum(1);
		yooInfo.setName("유연수");
		yooInfo.setEmail("yoo@test.com");
		yooInfo.setAge(25);
		yooInfo.setHeight(171.0);
		yooInfo.setWeight(55.0);
		UseStudentInfo usi = new UseStudentInfo();
		usi.printStudentInfo(yooInfo);
		
//		매개변수 있는 생성자를 사용한 값 설정
		StudentInfo leeInfo=new StudentInfo(2, "이여진", "lee@test.com", 29, 165.0, 44.0);
		usi.printStudentInfo(leeInfo);
	} //main

} //class
