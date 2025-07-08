package day0213;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Interface Set
 * Set : 검색의 기능이 없으며, 중복 값을 저장하지 않는 자료구조,
 * 		 입력값은 순차적으로 입력되지 않는다
 */
public class UseSet {

	public UseSet() {
//		1. 생성
		Set<String> set=new HashSet<String>();
		
//		2. 값할당 : 중복값 X, 순차적 입력 X
		set.add("Java 1");
		set.add("Oracle 2");
		set.add("JDBC 3");
		set.add("강태일");
		set.add("HTML 4");
		set.add("CSS 5");
		set.add("JavaScript 6");
		set.add("강태일");			//중복값으로 2개의 방이 생성되지 않음
		
//		요소를 배열로 복사
//		set 의 크기로 배열을 생성
		String[] arr=new String[set.size()];
//		set 의 값을 배열에 저장
		set.toArray(arr);
		
//		요소 삭제
		set.remove("CSS 5");
		
//		검색의 기능이 없음 : java.util.Iterator 사용하여 검색
		Iterator<String> ita=set.iterator();
		
//		요소가 몇개인지 모르겠으나 모든 방의 값을 얻어야 한다.
		while(ita.hasNext()) {				//최소 0번 수행 최대 조건까지 수행
			System.out.println(ita.next());	//요소의 값을 얻고, 포인터를 다음으로 이동
		} //end while
		System.out.println("---------------------");
		
//		한번 더 반복시키려면 제어권을 다시 얻어야한다
//		ita=set.iterator();
//		while(ita.hasNext()) {				//최소 0번 수행 최대 조건까지 수행
//			System.out.println(ita.next());	//요소의 값을 얻고, 포인터를 다음으로 이동
//		} //end while
		
//		출력
		System.out.println(set+" / "+set.size());
		System.out.println("---------------------");
		
//		배열에 복사하여 저장된 값을 출력
		for(String data : arr) {
			System.out.println(data);
		} //end for
	} //UseSet
	
	public static void main(String[] args) {
		new UseSet();
	} //main

} //class
