package day0212;

import java.util.Calendar;
import static java.lang.Integer.parseInt;

/**
 * 입력된 년과 월의 달력을 출력하는 예제
 */
public class Exam0211 {

	/**
	 * 달력을 생성하는 일
	 * @param paramyear
	 * @param parammonth
	 * @return
	 */
	public String createCalendar(String paramyear, String parammonth) {

		StringBuilder tempCal=new StringBuilder();
		
		Calendar cal=Calendar.getInstance();	//현재 년,월을 가진 Calendar 객체 생성
		int tempYear=0;
		int tempMonth=0;
		
//		값이 입력되지 않은 경우의 처리
		if(paramyear!=null && !paramyear.isEmpty()) {
//			매개변수가 참조형일 때는 객체가 생성되었는지 물어봐야하고 (!=null)
//			객체에 따라 연결하여(&&) 추가 작업을 수행해야할 수도 있다. ( isEmpty() )
			tempYear=parseInt(paramyear);
			cal.set(Calendar.YEAR, tempYear);	//값이 있는 경우에 년을 변경
		} //end if
		if(parammonth!=null && !parammonth.isEmpty()) {
			tempMonth=parseInt(parammonth);
			cal.set(Calendar.MONTH, tempMonth-1);	//값이 있는 경우에 월을 변경
		} //end if
		
		tempYear=cal.get(Calendar.YEAR);		//현재 년 혹은 입력받는 년으로 할당
		tempMonth=cal.get(Calendar.MONTH)+1;	//현재 월 혹은 입력받은 월로 할당
		
		cal.set(Calendar.DAY_OF_MONTH,1);		//달력을 1일로 설정
		
		tempCal.append("\t\t").append(tempYear).append("년")
		.append(tempMonth).append("월\n")
		.append("-------------------------------------------------\n")
		.append("일\t월\t화\t수\t목\t금\t토\n");
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);	//1일의 요일 얻기 1,2,3,4,5,6,7
//		1일 출력 전 공백 생성
		for(int blank=1; blank<dayOfWeek; blank++) {
			tempCal.append("\t");
		} //end for
		
		int lastDay=cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날
		for(int tempDay=1; tempDay<=lastDay; tempDay++) {
//			증가하는 가상의 일(tempDay)로 Calendar 객체 설정
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			tempCal.append(tempDay).append("\t");
			
//			가상의 날로 설정된 일자의 요일을 가져와서 줄바꿈
			switch (cal.get(Calendar.DAY_OF_WEEK)) {
//			case 7: {
//				tempCal.append("\n"); break;
//			}
			case Calendar.SATURDAY:{
				tempCal.append("\n"); break;
			}
			} //end switch
		} //end for
		
		return tempCal.toString();
	} //createCalendar
	
	public void printCalendar(String calendar) {
		System.out.println(calendar);
	} //printCalendar
	
	public static void main(String[] args) {
		Exam0211 ex=new Exam0211();
		String calendar = ex.createCalendar("2024","12");
		ex.printCalendar(calendar);
		
	} //main

} //class
