package day0122;

/**
 * 숙제
 * 1. for 문을 사용하여 1월 달력 출력
 * (공백이 필요하면 \t 특수문자로 공백을 구분)
 * 2. 월, 해당 월의 시작요일, 마지막 일자을 입력받아 해당 월의 달력을 출력
 */
public class Exam0121 {

	/**
	 * 줄 변경을 저장하고 있는 Constant
	 */
	public static final int NEW_LINE=0;
	
	public static void main(String[] args) {
		
		System.out.println("\t\t\t"+args[0]+"월"); //달력 출력을 희망하는 월
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int dayOfMonth=0; //요일을 저장하기 위한 변수
		
		switch(args[1]) {
		case "일" : dayOfMonth=0; break;
		case "월" : dayOfMonth=1; break;
		case "화" : dayOfMonth=2; break;
		case "수" : dayOfMonth=3; break;
		case "목" : dayOfMonth=4; break;
		case "금" : dayOfMonth=5; break;
		case "토" : dayOfMonth=6; break;
		} //end switch
		
		int lastDayOfMonth=Integer.parseInt(args[2]); //해당 월의 마지막 일자
		////////////////////달력 출력 시작////////////////////
		for(int i=0; i<dayOfMonth; i++){
			System.out.print("\t"); //첫번째 주 공백 출력
		} //end for
		
//		1월을 1일(시작) 부터 31(끝)일까지 존재
		for(int day=1; day<=lastDayOfMonth; day++) {
			
			System.out.print(day+"\t"); //요일을 출력
			//토요일이면 줄 변경
			dayOfMonth++;
			
			switch(dayOfMonth%7) { 
//			System.lineSeparator() Java 가 실행되는 운영체제에서 개행 문자
//			Windows(\r\n), Linux, Unix(\n)을 반환
			case NEW_LINE : System.out.print(System.lineSeparator());
			} // end switch
			
		} //end for

	} //main

} //class
