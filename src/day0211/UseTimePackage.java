package day0211;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * java.time.LocalDate
 * JDK 1.8에서부터 제공되는 날짜 관련 클래스를 묶어놓은 package
 */
public class UseTimePackage {
	public UseTimePackage() {
//		날짜 사용
		LocalDate ld=LocalDate.now();
//		시간 사용
		LocalTime lt=LocalTime.now();
//		날짜, 시간 동시에 사용
		LocalDateTime ldt=LocalDateTime.now();
		
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		
		LocalDate ld2=LocalDate.of(2024,11,26);
		LocalTime lt2=LocalTime.of(15, 50);
		LocalDateTime ldt2=LocalDateTime.of(ld2, lt2);
		
		System.out.println(ld2);
		System.out.println(lt2);
		System.out.println(ldt2);
		
		System.out.println("----------method 호출-----------");
		System.out.println("LocalDate");
		StringBuilder ldOut=new StringBuilder();
		ldOut.append(ld.getYear()).append("년 ")
		.append(ld.getMonthValue()).append("월 ")
		.append(ld.getDayOfMonth()).append("일 ")
		.append(ld.getDayOfWeek()).append("요일 ")
		.append("일,월,화,수,목,금,토".split(",")[ld.getDayOfWeek().getValue()]).append("요일 ");
		
		System.out.println(ldOut);
		
		System.out.println("----------LocalTime------------");
		StringBuilder ltOut2=new StringBuilder();
		
		ltOut2.append(lt.getHour()).append(":")
		.append(lt.getMinute()).append(":")
		.append(lt.getSecond()).append(":")
		.append(lt.getNano()).append(".");
		
		System.out.println(ltOut2);
		
//		java.time.format
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern
				("yyyy/MM/dd a hh(kk,HH,KK):mm:ss EEEE");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern
				("yyyy/MM/dd a hh(kk,HH,KK):mm:ss EEEE", Locale.FRANCE);
		
		System.out.println(ldt.format(dtf));
		System.out.println(ldt.format(dtf2));
		
		System.out.println("----------년/월/일 변경-----------");
		System.out.println("변경 전 : "+ld);
//		년 변경
//		ld.withYear(2024);	//method 만 호출하면 변경된 날짜 정보가 적용되지 않음
//		날짜를 변경하고, 변경된 날짜를 자신객체에 재할당
		ld=ld.withYear(2024);
		ld=ld.withMonth(11);
		ld=ld.withDayOfMonth(26);
		
		System.out.println("변경 후 : "+ld);
		
		System.out.println("----------년/월/일 변경-----------");
		LocalDate ld3=LocalDate.now();
		System.out.println("변경 전 : "+ld3);

		ld3=ld3.plusYears(1);	//1년 후
		System.out.println("변경 후 : "+ld3);

		ld3=ld3.minusYears(2);	//2년 전
		System.out.println("변경 후 : "+ld3);
		
		System.out.println("----------두 날짜 간 비교-----------");
		LocalDate ld4=LocalDate.now();				//오늘
		LocalDate ld5=LocalDate.of(2025, 2, 12);	//내일
		System.out.println(ld4+" / "+ld5);

		System.out.println(ld4.isAfter(ld5));		//false
		System.out.println(ld4.isBefore(ld5));		//true
		System.out.println(ld4.isEqual(ld5));		//false
		
		System.out.println("----------두 날짜 간 연산-----------");
		LocalDate ld6=LocalDate.now();				//오늘
		LocalDate ld7=LocalDate.of(2026, 2, 14);	//오늘
		System.out.println("현재 날짜 : "+ld6+", 비교할 날짜 : "+ld7);
		
//		2. 날짜 연산하기 위해 객체를 얻기
		Period p=Period.between(ld6, ld7);
		
//		3. 날짜간의 연산(해당날짜끼리만 연산 수행)
		System.out.println("년도의 차이 : "+p.getYears());
		System.out.println("월의 차이 : "+p.getMonths());
		System.out.println("일의 차이 : "+p.getDays());
	} //UseTimePackage
	
	public static void main(String[] args) {
		new UseTimePackage();
	} //main

} //class
