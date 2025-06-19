package day0212;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * List 사용
 *  - 가변 길이형
 *  - 값은 순차적으로 입력, 순차적으로 출력
 *  - 검색의 기능이 있음
 *  - 값은 중복가능
 */
public class UseList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void notUsingGeneric() {
//		1. Generic 사용하지 않은 객체화
		List list=new ArrayList();
//		2. 값 할당
		list.add(2025);
		list.add("안녕하세요?");
		list.add(21);
//		3. 값 사용
		System.out.println("["+list.get(0)+"]["+list.get(1)+"]["+list.get(2)+"]");
//		System.out.println(list.get(0)*list.get(1));
	} //notUsingGeneric

	public void useArrayList() {
//		1. 생성
		List<String> list=new ArrayList<String>();
//		값 할당 : 값을 추가할 때마다 방의 개수가 증가 (가변 길이형)
		list.add("안녕하세요?");
//		list.add("안녕하세요?");//중복값 추가 가능 
		list.add("오늘은");
		list.add("수요일");
		list.add("입니다.");
//		Generic 해당하지 않는 데이터형을 추가하면 error 발생
//		list.add(2025);
		list.add("수요일");	//중복값 추가 가능
		list.add("눈그쳤음");
		
//		배열에 복사
		String[] strArr=new String[list.size()];
		list.toArray(strArr);
		
//		List<int> list2=new ArrayList<int>();			//Generic 기본형으로 설정 불가
		List<Integer> list2=new ArrayList<Integer>();	//Wrapper class 사용
		list2.add(2025);
//		list2.add(new Integer(2025));					//생성자는 JDK1.8까지 사용가능
		list2.add(Integer.valueOf(2025));				//Java SE 9부터는 valueOf 사용
		list2.add(21);
		list2.add(2026);
		list2.add(3000);
		
		Integer[] intArr=new Integer[list2.size()];
		list2.toArray(intArr);							//배열로 복사
		
//		값 얻기
		String temp=list.get(0);
		Integer i=list2.get(0);
		int iv=list2.get(0);
//		int iv=list2.get(3);							//존재하지 않는 index 는 오류
//		unboxing : Wrapper 가 반환되면 Wrapper class 의 method 를 호출하여
//		(intValue()) 기본형 데이터형에 할당
		
		System.out.println(temp);
		System.out.println(i);
		System.out.println(iv);
		
		System.out.println(list+" / 방의 개수 : "+list.size());
		System.out.println(list2+" / 방의 개수 : "+list2.size());
		
		System.out.println("-----------------------");
		temp="";
		for(int j=0; j<list.size(); j++) {
			temp=list.get(j);			//j 인덱스에 해당하는 리스트에서 값 할당
			System.out.println(temp);
		} //end for
		System.out.println("-----------------------");
		
		for(Integer j: list2) {			//unboxing
			System.out.println(j);
		} //향상된 for
		System.out.println("-----------------------");
		
//		인덱스 삭제
//		list.remove(1);					//"오늘은" 삭제
		
//		방의 내용과 일치하는 방 삭제
//		동일한 값이 있다면 왼쪽부터 오른쪽으로 가장 첫번째로 일치하는 값만 삭제
		list.remove("수요일");
		
//		모든 방의 값 삭제
		list.clear();
		System.out.println(list+" / 방의 개수 : "+list.size());
		
		System.out.println("배열의 방의 값 출력");
		System.out.println(Arrays.toString(strArr));	//주소가 출력
		System.out.println(Arrays.toString(intArr));	//주소가 출력
		
//		배열 오름차순 정렬
		System.out.println("---------배열 오름차순 정렬---------");
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
//		배열 내림차순 정렬
		System.out.println("---------배열 내림차순 정렬---------");
		Arrays.sort(intArr, Collections.reverseOrder());
		System.out.println(Arrays.toString(intArr));
		System.out.println("-----------------------");
		
		System.out.println("---------배열이 비었는지 확인---------");
		System.out.println("String 배열 빈 여부 : "+list.isEmpty());
		System.out.println("Integer 배열 빈 여부 : "+list2.isEmpty());
		
	} //useArrayList
	
	public void useVector() {
		List<String> list=new Vector<String>();
		list.add("안녕하세요?");
//		list.add("안녕하세요?");//중복값 추가 가능 
		list.add("오늘은");
		list.add("수요일");
		list.add("입니다.");
//		Generic 해당하지 않는 데이터형을 추가하면 error 발생
//		list.add(2025);
		list.add("수요일");	//중복값 추가 가능
		list.add("눈그쳤음");
		
//		배열에 복사
		String[] strArr=new String[list.size()];
		list.toArray(strArr);
		
//		List<int> list2=new ArrayList<int>();			//Generic 기본형으로 설정 불가
		List<Integer> list2=new ArrayList<Integer>();	//Wrapper class 사용
		list2.add(2025);
//		list2.add(new Integer(2025));					//생성자는 JDK1.8까지 사용가능
		list2.add(Integer.valueOf(2025));				//Java SE 9부터는 valueOf 사용
		list2.add(21);
		list2.add(2026);
		list2.add(3000);
		
		Integer[] intArr=new Integer[list2.size()];
		list2.toArray(intArr);							//배열로 복사
		
//		값 얻기
		String temp=list.get(0);
		Integer i=list2.get(0);
		int iv=list2.get(0);
//		int iv=list2.get(3);							//존재하지 않는 index 는 오류
//		unboxing : Wrapper 가 반환되면 Wrapper class 의 method 를 호출하여
//		(intValue()) 기본형 데이터형에 할당
		
		System.out.println(temp);
		System.out.println(i);
		System.out.println(iv);
		
		System.out.println(list+" / 방의 개수 : "+list.size());
		System.out.println(list2+" / 방의 개수 : "+list2.size());
		
		System.out.println("-----------------------");
		temp="";
		for(int j=0; j<list.size(); j++) {
			temp=list.get(j);			//j 인덱스에 해당하는 리스트에서 값 할당
			System.out.println(temp);
		} //end for
		System.out.println("-----------------------");
		
		for(Integer j: list2) {			//unboxing
			System.out.println(j);
		} //향상된 for
		System.out.println("-----------------------");
		
//		인덱스 삭제
//		list.remove(1);					//"오늘은" 삭제
		
//		방의 내용과 일치하는 방 삭제
//		동일한 값이 있다면 왼쪽부터 오른쪽으로 가장 첫번째로 일치하는 값만 삭제
		list.remove("수요일");
		
//		모든 방의 값 삭제
		list.clear();
		System.out.println(list+" / 방의 개수 : "+list.size());
		
		System.out.println("배열의 방의 값 출력");
		System.out.println(Arrays.toString(strArr));	//주소가 출력
		System.out.println(Arrays.toString(intArr));	//주소가 출력
		
//		배열 오름차순 정렬
		System.out.println("---------배열 오름차순 정렬---------");
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
//		배열 내림차순 정렬
		System.out.println("---------배열 내림차순 정렬---------");
		Arrays.sort(intArr, Collections.reverseOrder());
		System.out.println(Arrays.toString(intArr));
		System.out.println("-----------------------");
		
		System.out.println("---------배열이 비었는지 확인---------");
		System.out.println("String 배열 빈 여부 : "+list.isEmpty());
		System.out.println("Integer 배열 빈 여부 : "+list2.isEmpty());
	} //useVector
	
	public static void main(String[] args) {
		UseList us=new UseList();
		
		System.out.println("제네릭을 사용하지 않는 method");
		us.notUsingGeneric();
		
		System.out.println("ArrayList 사용 method");
		us.useArrayList();
		
		System.out.println("Vector 사용 method");
		us.useVector();
		
	} //main

} //class
