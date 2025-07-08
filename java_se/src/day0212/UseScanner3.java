package day0212;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseScanner3 {

	/**
	 * 1. 이름을 계속 입력받아 (예시 :홍길동) List 에 넣고,
	 * Y나 y를 입력하면 종료,
	 * 이름을 가진 List 를 반환
	 * 2. 콘솔에 입력받은 모든 이름을 출력하는 코드 작성
	 */
	public UseScanner3() {

	} //UseScanner3
	
	public List<String> inputName(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		List<String> listArr=new ArrayList<String>();
		boolean exitFlag=false;
		String name="";
		String exitData="";
		
		do {
			System.out.println("List에 저장할 이름을 입력해주세요.");
			name=sc.nextLine();
			listArr.add(name);
			
			System.out.println("종료시 Y나 y값을 입력하세요.");
			exitFlag="Y".equals(exitData.toUpperCase());	//Y이면 true
		} while(!exitFlag);	//!true -> false 반복문을 빠져나간다.
		
		return listArr;
	}
	
	public void printName(List<String> list) {
		for(String name : list) {
			System.out.println(name);
		} //end for
	} //printName
	
	public static void main(String[] args) {
		UseScanner3 us3=new UseScanner3();
		List<String> list=us3.inputName();
		us3.printName(list);
	} //main

} //class
