package day0120;

/**
 *  switch-case 일치하는 정수를 비교할 때 사용하는 조건문
 *  switch(변수){
 *   case 상수 : 변수값이 상수와 같을 때 실행할 문장
 *   case 상수 : 변수값이 상수와 같을 때 실행할 문장
 *   
 *   default : 변수값이 상수와 같지 않을 때 실행할 문장
 *  }
 */
public class TestSwitchCase {
	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;

	public static void main(String[] args) {
		String i="A"; //byte, short, int, char, String(JDK1.7에서 추가)
		
		switch (i) {
		case "0": System.out.println("0");
		case "1": System.out.println("1");
		case "A": System.out.println("A");
		case "2": System.out.println("2");
		case "3": System.out.println("3");
		default: System.out.println("변수와 일치하는 상수가 없습니다.");
		} //end switch
		
		System.out.println("-----------break 사용-----------");
		
		int j=0;
		switch (j) {
		case 0: System.out.println("0");
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3");
		default: System.out.println("변수와 일치하는 상수가 없습니다.");
		} //end switch
		
		System.out.println("-----------범위 비교-----------");
//		학점 구하기
		char grade='F';
		int score=200;
		
//		if(score>=0 && score<=100) { //조건 점수가 0~100
		if(score>-1 && score<101) { //조건 점수가 0~100
			switch (score/10) { //범위
			case TestSwitchCase.GRADE_A_PLUS:
			case TestSwitchCase.GRADE_A: grade='A'; break;
			case TestSwitchCase.GRADE_B: grade='B'; break;
			case TestSwitchCase.GRADE_C: grade='C'; break;
			case TestSwitchCase.GRADE_D: grade='D'; break;
			default: grade='F'; break;
			} //end switch

			System.out.println(score+"점의 학점은 "+grade);
		}else {
			System.out.println(score+"점은 잘못된 점수입니다.");			
		}//end else

		System.out.println("-----------break를 최소화한 코드-----------");

		grade=64;
		score=90;
		
		if(score>=0 && score<101) { //조건 점수가 0~100
			switch (score/10) { //범위
			case TestSwitchCase.GRADE_D: grade++; //65
			case TestSwitchCase.GRADE_C: grade++; //66
			case TestSwitchCase.GRADE_B: grade++; //67
			case TestSwitchCase.GRADE_A: 
			case TestSwitchCase.GRADE_A_PLUS: grade++; break; //68
			default: grade += 6; break;
			} //end switch
			
			System.out.println(score+"점의 학점은 "+grade);
		}else {
			System.out.println(score+"점은 잘못된 점수입니다.");			
		}//end else
	} //main

} //class
