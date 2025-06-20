package day0213;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashTable, HashMap 사용예제
 */
public class UseMap {

	public void useHashtable() {
//		1. 생성 : 11개의 행이 기본 생성되어서 제공
//		행은 전체 행에 약 75%가 채워져서 있을때 검색 효율이 가장 좋음
		Map<String, String> map=new Hashtable<String, String>();
		
//		2. 값 할당 : 순서대로 입력되지 않고, 중복키를 입력하면 이전 키에 덮어 씌움
		map.put("java", "완벽한 OOP 언어");
		map.put("Oracle", "대용량 DBMS");
		map.put("JDBC", "저수준 API");
//		중복값 입력
		map.put("java", "WORA");
		
//		3. 동일 키(중복값) 존재하는지?
		String key="java3";
		System.out.println(map.containsKey(key));	//존재하지 않는 값은 빈값 출력
		System.out.println("-----------------------------------------");
		
		if(map.containsKey(key)) {
//			4. 값 얻기
			String value=map.get(key);
			System.out.println(key+"에 대한 값 : "+value);
//			value=map.get("밸리곰");			//존재하지 않는 값은 null 출력
		} //end if
		
//		모든 키 얻기
		System.out.println("----------------Key 값 출력----------------");
		Set<String> set=map.keySet();
		System.out.println(set);
		for(String tempKey : set) {
			System.out.println(tempKey);
		} //end for
	
//		Map 모든 행의 값 출력해보세요
		System.out.println("--------------Value 값 출력----------------");
//		System.out.println(map.values());
		Iterator<String> ita=set.iterator();
		
		while(ita.hasNext()) {
			key=ita.next();
			System.out.println(key+"의 값은 "+map.get(key));
		} //end while
		
//		Map 의 값 삭제
		System.out.println("---------------Map 값 삭제-----------------");
		map.remove("java");
		map.clear();
		
//		5. 값 출력
		System.out.println(map+" / 크기 : "+map.size());
		
	} //useHashtable
	
	public void useHashMap() {
//		1. 생성 : 11개의 행이 기본 생성되어서 제공
//		행은 전체 행에 약 75%가 채워져서 있을때 검색 효율이 가장 좋음
		Map<String, String> map=new HashMap<String, String>();
		
//		2. 값 할당 : 순서대로 입력되지 않고, 중복키를 입력하면 이전 키에 덮어 씌움
		map.put("java", "완벽한 OOP 언어");
		map.put("Oracle", "대용량 DBMS");
		map.put("JDBC", "저수준 API");
//		중복값 입력
		map.put("java", "WORA");
		
//		3. 동일 키(중복값) 존재하는지?
		String key="java3";
		System.out.println(map.containsKey(key));	//존재하지 않는 값은 빈값 출력
		System.out.println("-----------------------------------------");
		
		if(map.containsKey(key)) {
//			4. 값 얻기
			String value=map.get(key);
			System.out.println(key+"에 대한 값 : "+value);
//			value=map.get("밸리곰");			//존재하지 않는 값은 null 출력
		} //end if
		
//		모든 키 얻기
		System.out.println("----------------Key 값 출력----------------");
		Set<String> set=map.keySet();
		System.out.println(set);
		for(String tempKey : set) {
			System.out.println(tempKey);
		} //end for
	
//		Map 모든 행의 값 출력해보세요
		System.out.println("--------------Value 값 출력----------------");
//		System.out.println(map.values());
		Iterator<String> ita=set.iterator();
		
		while(ita.hasNext()) {
			key=ita.next();
			System.out.println(key+"의 값은 "+map.get(key));
		} //end while
		
//		Map 의 값 삭제
		System.out.println("---------------Map 값 삭제-----------------");
		map.remove("java");
		map.clear();
		
//		5. 값 출력
		System.out.println(map+" / 크기 : "+map.size());
	} //useHashMap
	
	public static void main(String[] args) {
		UseMap um=new UseMap();
		System.out.println("----------------Hashtable----------------");
		um.useHashtable();
		System.out.println("----------------HashMap------------------");
		um.useHashMap();
	} //main

} //class
