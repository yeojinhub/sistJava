package day0211;

import java.util.Calendar;

/**
 * -원하는 년도와 월을 매개변수로 입력 받아 해당 년,월의 달력을 String으로 반환하는 Method를 작성하세요.
 * Calendar 클래스를 사용하여 해당 년, 월의 달력을 StringBuilder에 넣고 반환합니다.
 * 만약 년,이나 월이 입력되지 않은 경우에는 현재 년과 월로 달력을 생성합니다.
 * 
 *  -위의 method 를 호출하여 반환되는 달력을 받아서 콘솔에 출력하는 method를 작성하세요.
 */
public class Exam0211 {
	
	public String makeCalendar(String year, String month) {
		int intYear=Integer.parseInt(year);
		int intMonth=Integer.parseInt(month);
//		1. 객체 생성 : 시스템의 날짜를 가진 객체 생성
		Calendar cal=Calendar.getInstance();
		
		if(year==null || year.isEmpty()) {
			intYear=cal.get(Calendar.YEAR);
		} else if(month==null || month.isEmpty()) {
			intMonth=cal.get(Calendar.DAY_OF_MONTH)+1;
		} //end if
		
		cal.set(Calendar.YEAR, intYear);
		cal.set(Calendar.MONTH, intMonth-1);
		cal.set(intYear,intMonth-1,1);

		StringBuilder sb=new StringBuilder();
		sb.append("\t\t").append(intYear).append("년").append(intMonth).append("월")
		.append("\n--------------------------------------------\n")
		.append("일\t월\t화\t수\t목\t금\t토\n");
		
		int startDay=cal.get(Calendar.DAY_OF_WEEK);
		for(int blank=1; blank<startDay; blank++){
			sb.append("\t"); //첫번째 주 공백 출력
		} //end for
		
		int lastDay=cal.getActualMaximum(Calendar.DATE);
		for(int i=1; i<=lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);
			sb.append(i).append("\t");
			if(cal.get(Calendar.DAY_OF_WEEK)% 7 == 0) {
				sb.append("\n");
			}
		} //end for

		return sb.toString();
	} //makeCalendar
	
	public void printCalendar(String calendar) {
		System.out.println(calendar);
	} //printCalendar

	public static void main(String[] args) {
		String year=args[0];
		String month=args[1];
		Exam0211 ext = new Exam0211();
		String calendar = ext.makeCalendar(year,month);
		ext.printCalendar(calendar);

	} //main

} //class
