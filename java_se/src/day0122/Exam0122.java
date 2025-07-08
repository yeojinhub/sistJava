package day0122;

public class Exam0122 {

	/**
	 * 자신의 이름을 콘솔에 출력하는 method
	 */
	public void namePrint() {
		System.out.println("내 이름은 여진");
	} //namePrint
	
	/**
	 * 자신의 이름 중 "성을" 반환하는 method
	 * @param firstname
	 * @return charAt() method를 사용하여 이름의 첫번째(성) 값을 반환
	 */
	public char firstName(String firstname) {
		return firstname.charAt(0);
	} //firstName
	/**
	 * 점수를 입력받아 정수의 판정을 콘솔에 출력하는 method 생성
	 * 점수는 0~100 사이일때만 판정, 그렇지 않으면 "잘못된 점수" 출력
	 * 0~39점="과락" 출력, 40~59점="다른 과목 참조", 60~100점="합격"을 출력
	 * @param score 입력받은 점수 값
	 */
	public void scoreGrade(int score) {
		if(score>=0 && score<=100) {
			System.out.print("점수는 "+score+"점이고 ");
			switch (score/20) {
			case 0:
			case 1: System.out.println("성적은 과락"); break;
			case 2: System.out.println("성적은 다른 과목 점수를 참조"); break;
			default:System.out.println("성적은 합격"); break;
			} //end switch
		} else {
			System.out.println("잘못된 점수");
		} //end if else
	} //scoreGrade
	/**
	 * 문자를 입력받아 해당문자가 "대문자" 인지, "소문자"인지, "숫자"인지를 판단하여
	 * 콘솔에 출력하는 method 작성
	 * 'A'가 입력되면 "A-대문자" 의 형식으로 출력
	 * @param alpabet
	 */
	public void upperOrLower(char alpabet) {
		if(Character.isUpperCase(alpabet)) {
			System.out.println(alpabet+"-대문자");
		} else if(Character.isLowerCase(alpabet)) {
			System.out.println(alpabet+"-소문자");
		} else if(Character.isDigit(alpabet)){
			System.out.println(alpabet+"-숫자");
		} else {
		}
	}
	/**
	 * 태어난 해를 입력받아 나이를 반환하는 method
	 * @param birthYear 입력받은 태어난 해 값
	 * @return age 현재 나이를 계산한 값
	 */
	public int ageCalculate(int birthYear) {
		int age=2025-birthYear+1;
		return age;
	}
	/**
	 * 숫자 3개를 입력받아 가장 작은 수를 반환하는 method
	 * @param i
	 * @param j
	 * @param k
	 * @return number 세 개의 값중에서 가장 작은 값
	 */
	public int smallestNum(int i, int j, int k) {
		int number=0;
		number = (i>j)?(j>k)? k: j: i; 
		return number;
	}
	
	public static void main(String[] args) {
		Exam0122 ex0122 = new Exam0122();
		
		ex0122.namePrint();
		
		System.out.println("내 이름의 성은 "+ex0122.firstName("이여진"));
		
		ex0122.scoreGrade(39);
		
		ex0122.upperOrLower('1');
		
		int myAge = ex0122.ageCalculate(1997);
		System.out.println("내 현재 나이는 "+myAge+"살");
		
		int num = ex0122.smallestNum(3, 2, 1);
		System.out.println("가장 작은 값은 "+num);
		
	} //main

} //class
