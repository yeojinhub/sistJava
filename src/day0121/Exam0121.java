package day0121;

/**
 * 숙제
 * 1. for문을 사용하여 1월 달력 출력
 * (공백이 필요하면 \t 특수문자로 공백을 구분)
 * 2. 월, 해당 월의 시작요일, 마지막 일자을 입력받아 해당 월의 달력을 출력
 */
public class Exam0121 {

	public static void main(String[] args) {
		int year=2025;
		int lastYear=year-1;
		int dayOfWeek=0;
		
		dayOfWeek=(year+(lastYear/4)-(lastYear/100)+(lastYear/400))%7;
		
		int month=1;
		int lastDay=1;
		if(month==4 || month==6 || month==9 || month==11) {
			lastDay=30;
		} else if(month==2) {
			lastDay=28;
		} else {
			lastDay=31;
		} //end ifelse
		
		System.out.println("\t\t1월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0; i<dayOfWeek; i++) {
			System.out.print("\t");
		} //end for
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}//end for
		
		month=Integer.parseInt(args[0]);
		String startdayOfWeek=args[1];
		lastDay=Integer.parseInt(args[2]);
		
		System.out.println("\n\n\t\t"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		switch (startdayOfWeek) {
		case "일": dayOfWeek=0; break;
		case "월": dayOfWeek=1; break;
		case "화": dayOfWeek=2; break;
		case "수": dayOfWeek=3; break;
		case "목": dayOfWeek=4; break;
		case "금": dayOfWeek=5; break;
		default: dayOfWeek=6; break;
		}
		
		for(int i=0; i<dayOfWeek; i++) {
			System.out.print("\t");
		} //end for
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}//end for
		
	} //main

} //class
