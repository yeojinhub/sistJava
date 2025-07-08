package day0123;

/**
 * 1/22 instance method 의 연습
 *  업무에 대한 정확한 method 형태 파악
 *  instance method 를 호출하기 위해 객체화를 할 수 있는가?
 */
public class Exam0122 {
	
	/**
	 * 1. 자신의 이름을 콘솔에 출력하는 method
	 */
	public void printName() {
		System.out.println("이여진");
		
	} //printName
	
	/**
	 * 2. 자신의 이름 중 "성"을 반환하는 method
	 * 반환 행이 존재하는 method 는 호출하는 곳에서
	 * 반환형과 일치하는 데이터 형으로 변수를 선언하고, 일처리한 결과를 받아사 사용
	 * @return 성
	 */
	public char getFamilyName() {
		char familyName='이';
		return familyName;
	} //getFamilyName
	
	/**
	 * 점수를 입력받아 점수의 판정을 콘솔에 출력하는 method
	 * - 가변일 : 반환형은 없고, 매개변수 있는 형
	 * @param score 판정을 내려야하는 점수
	 */
	public void printScoreEvaluation(int score) {
		System.out.print("입력된 "+score+"점은 ");
		if(score>=0 && score <=100) { //유효한 점수
			System.out.println("잘못된 점수");
//			Early Return :
//			반환형이 void 일 때 사용하는 return 구문
//			값을 반환하는 것이 아닌 코드의 실행을 막을때 사용하는 구문
			return;
		} //end if

		if(score<40){
			System.out.println("과락");
		} else if(score<60) {
			System.out.println("다른 과목의 점수 참조");
		} else {
			System.out.println("합격");
		} //end else if
	} //printScoreEvaluation

	/**
	 * 문자를 입력받아 해당문자가 "대문자"=65~90인지,
	 * "소문자"=97~122인지, "숫자"=48~57인지를 판단하여
	 * 콘솔에 출력하는 method 를 작성 -가변일
	 * @param paramChar
	 */
	public void printClassifyCharacter(char paramChar) {
//		if(paramChar>47 && paramChar<58) {
		if(Character.isDigit(paramChar)) {
			System.out.println(paramChar+" = 숫자");
		} //end if
		
//		if(paramChar>64 && paramChar<91) {
		if(Character.isUpperCase(paramChar)) {
			System.out.println(paramChar+" = 대문자");
		} //end if
		
//		if(paramChar>96 && paramChar<123) {
		if(Character.isLowerCase(paramChar)) {
			System.out.println(paramChar+" = 소문자");
		} //end if
		
	} //printClassifyCharacter
	
	/**
	 * 태어난 해를 입력받아 나이를 반환하는 method - 가변값
	 *  현재년도-태어난해+1
	 * @param birth 태어난 해
	 * @return 태어난 해를 사용하여 연산한 나이
	 */
	public int getAge(int birth) {
		int age=2025-birth+1;
		return age;
	} //getAge
	
	/**
	 * 정수 숫자 3개를 입력받아 가장 작은 수를 반환하는 method - 가변값
	 * @param number 숫자1
	 * @param number2 숫자2
	 * @param number3 숫자3
	 * @return 가장 작은 수
	 */
	public int findSmallestNumber(int number, int number2, int number3) {
		int smallestNumber=Math.min(Math.min(number, number2), number3);
		return smallestNumber;
	} //findSmallestNumber

	public static void main(String[] args) {
//		static 영역에서 instance 영역에 자원(instance variable, instance method)을
//		사용하기 위해 객체화를 수행. 클래스명 객체명=new 클래스명();
		Exam0122 exam=new Exam0122();
		
		System.out.println("고정일 호출");
		exam.printName();
		
		System.out.println("고정값 호출");
		char familyName=exam.getFamilyName();
		System.out.println("나의 성은 "+familyName);
		
		System.out.println("가변일 호출");
		int score=0;
		exam.printScoreEvaluation(score);
		
		System.out.println("가변일 호출");
		char paramChar='a';
		exam.printClassifyCharacter(paramChar);

		System.out.println("가변값 호출");
		int birth=1995;
		int age=exam.getAge(birth);
		System.out.println("태어난해 "+birth+"년의 나이는 "+age+"살");

		System.out.println("가변값 호출");
		int num=2025;
		int num2=1;
		int num3=21;
		
		int smallestNumber=exam.findSmallestNumber(num, num2, num3);
		System.out.println(num+","+num2+","+num3+" 중 가장 작은 수는 "+smallestNumber);
		System.out.printf("");
		
	} //main

} //class
