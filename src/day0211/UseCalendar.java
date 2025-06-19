package day0211;

import java.util.Calendar;

/**
 * Calendar 사용하여 다른 날짜 얻는 예제
 */
public class UseCalendar {
	
	public UseCalendar() {
		
//		1. 객체 생성 : 시스템의 날짜를 가진 객체 생성
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
//		2. method 호출
//		날짜 정보를 변경
//		년 2025->2024 변경
//		cal.set(Calendar.YEAR,2024);	//2024-11-11
//		월 2->11 변경
//		0 1 2 3 4 5 6 7 8 9 10 11 : ISO 8601 표준을 따르지 않음
//		사람이 생각하는 월보다 1 적게 설정
//		cal.set(Calendar.MONTH, 11);
		
		cal.set(2024, 11, 26);
		
		StringBuilder date=new StringBuilder();
		date.append(cal.get(Calendar.YEAR)).append("-")
		.append(cal.get(Calendar.MONTH) +1).append("-")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append(" 이번 달의 마지막 날 ")
		.append(cal.getActualMaximum(Calendar.DATE)).append("일 ")
		.append(",일,월,화,수,목,금,토".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1])
		.append("요일 ");
		
		System.out.println(date);
		
		String str=date.toString();
		System.out.println(str);
	} //UseCalendar

	public static void main(String[] args) {
		new UseCalendar();
		
	} //main

} //class
