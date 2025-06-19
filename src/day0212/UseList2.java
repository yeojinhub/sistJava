package day0212;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseList2 {

	public UseList2() {
//		1. 리스트 생성
		List<String> nameList=new ArrayList<String>();

//		2. 값 할당
		nameList.add("JAVA");
		nameList.add("JDBC");
		nameList.add("HTML");
		nameList.add("CSS");
		
//		API 찾아서 'JAVA' 뒤 'Oracle'을 추가
		nameList.add(1, "Oracle");
		
		for(String subject : nameList) {	//리스트의 값을 하나의 코드에서 여러번 사용
			System.out.println(subject);
		} //end for
		
		System.out.println("---------------------");
		Iterator<String>ita=nameList.iterator();	
		while(ita.hasNext()) {				//리스트의 값을 하나의 코드에서 한번만 사용
			System.out.println(ita.next());
		} //end while
		
		System.out.println("---------------------");
		System.out.println(nameList);
		System.out.println("---------------------");
		
	} //UseList2
	
	public static void main(String[] args) {
		new UseList2();
		
		LocalDate ld=LocalDate.of(2024, 11, 26);
		System.out.println(ld.lengthOfMonth());
		
	} //main

} //class
