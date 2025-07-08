package day0117;

/**
 * Else if 예제문
 * 둘 중 하나의 코드를 실행해야할 때 사용 <br>
 * if( 조건식 ){
 *  조건이 참일 때 처리
 * }else
 *  조건이 거짓일 때 처리
 *  
 */
public class TestIfElse {

	public static void main(String[] args) {

		int num=21;
		
//		짝수, 홀수인지 판별
		System.out.print(num+"은 ");
		
		if (num%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		} //else if
		
//		음수인지 양수인지 판별
		
		System.out.print(num+"은 ");
		
		if(num>=0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");			
		} //else if
		
//		대중교통 : 버스, 지하철, 기차
//		main method의 첫번째 arguments에 (args[0]) 대중교통명을 입력받아
//		대중교통에 해당되면 "xx는 대중교통입니다." 그렇지 않으면 아니라는 출력
	
		if(args[0].equals("버스") || args[0].equals("지하철") || args[0].equals("기차")) {
			System.out.println(args[0]+"은(는) 대중교통입니다.");
		}
		else {
			System.out.println(args[0]+"은(는) 대중교통이 아닙니다.");			
		} //else if
		
	} //main

} //class
