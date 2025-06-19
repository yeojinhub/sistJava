package day0117;

/*
 * 다중 if : 연관된 여러 조건을 비교
 * if( 조건식 ){
 *  조건이 참일 때 처리
 * } else if( 조건식 ){
 *  조건이 참일 때 처리
 * } else if( 조건식 ){
 *  조건이 참일 때 처리
 * }
 * else{
 *  모든 조건이 거짓일 때 처리
 *  }
 */
public class TestElseIf {

	public static void main(String[] args) {
//		점수 판별하는 코드
//		점수는 0보다 작을 수 없고, 100보다 클 수 없음
//		0보다 작은 경우 "0보다 작아서 실패"를 출력
//		100보다 크다면 "100보다 커서 실패"를 출력
//		그렇지 않다면 (0~100사이일 때) "정상 범위의 점수입니다" 출력
		int score=100;
		
		System.out.print(score+"점은 ");
		
		if (score<0) {
			System.out.println("0보다 작은 점수로 실패입니다.");
		} else if(score>100) {
			System.out.println("100보다 큰 점수로 실패입니다.");
		} else {
			System.out.println("정상 범위의 점수입니다.");
		}
		
		/** arguments 로 (args[0]) 나이를 입력받아
		 * 1~100살 사이일때 9세까지는 "어린이", 10대는 "청소년", 그외에는 "어른"을 출력
		 * 그외에는 "일반적인 나이가 아닙니다."를 출력하는 메소드 작성
		 * Flow chart도 그려보세요 */
		int age=Integer.parseInt(args[0]);
		System.out.print("현재 나이는 "+age+"살로 ");

		if(age<10) {
			System.out.println("어린이입니다.");
		} else if(age>=10 && age<20) {
			System.out.println("청소년입니다.");
		} else if(age>=20 && age<101) {
			System.out.println("어른입니다.");
		} else {
			System.out.println("일반적인 나이가 아닙니다.");
		} //다중 if else문
		
		/** main method의 두번째 arguments (args[1]) 태어난 해를 입력받아
		 *  나이와 띠를 출력하는 메소드 작성
		 *  0=원숭이, 1=닭, 2=개, 3=돼지, 4=쥐, 5=소, 6=호랑이, 7=토끼, 8=용, 9=뱀, 10=말, 11=양*/
		int birthYear = Integer.parseInt(args[1]);
		System.out.print("태어난 해는 "+birthYear+"년으로 ");
		
		if(birthYear %12 == 0) {
			System.out.println("원숭이 띠입니다.");
		} else if(birthYear %12 == 1) {
			System.out.println("닭 띠입니다.");
		} else if(birthYear %12 == 2) {
			System.out.println("개 띠입니다.");
		} else if(birthYear %12 == 3) {
		System.out.println("돼지 띠입니다.");
		} else if(birthYear %12 == 4) {
			System.out.println("쥐 띠입니다.");
		} else if(birthYear %12 == 5) {
			System.out.println("소 띠입니다.");
		} else if(birthYear %12 == 6) {
			System.out.println("호랑이 띠입니다.");
		} else if(birthYear %12 == 7) {
			System.out.println("토끼 띠입니다.");
		} else if(birthYear %12 == 8) {
			System.out.println("용 띠입니다.");
		} else if(birthYear %12 == 9) {
			System.out.println("뱀 띠입니다.");
		} else if(birthYear %12 == 10) {
			System.out.println("말 띠입니다.");
		} else {
			System.out.println("양 띠입니다.");
		}
	} //main

} //class
