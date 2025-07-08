package day0212;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제
 * 1. 매개변수로 년, 월을 입력받아 해당 년, 월에 대한 마지막 일까지를
 * List<Integer> 에 할당하고 반환하는 일을 하는 method 작성
 * 2. List<Integer> 매개변수로 받아 출력하는 일 method 작성
 * 단, LocalDate 클래스를 사용하기
 * LocalDate 클래스의 해당 월의 마지막 일자를 구하는 method 를 API 에서 찾아 코드를 구현하세요. 
 */
public class Exam0212 {
	
	public List<Integer> makeArr(int year, int month){
		LocalDate ld=LocalDate.of(year,month,1);
//		LocalDate lastDate = ld.withDayOfMonth(ld.lengthOfMonth());
		List<Integer> listArr = new ArrayList<Integer>();
		for(int i=1; i<=ld.lengthOfMonth(); i++) {
			listArr.add(i);
		} //end for
		return listArr;
	} //makeArr
	
	public void printArr(List<Integer> listArr) {
		for(int temp : listArr) {
			System.out.print(temp+" ");
		} //end for
	} //printArr

	public static void main(String[] args) {
		System.out.println("출력을 원하는 년도와 월을 입력해주세요.");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		System.out.println("입력한 년도 : "+ year);
		System.out.println("입력한 월 : "+month);
		
		Exam0212 ex=new Exam0212();
		List<Integer> listArr=ex.makeArr(year, month);
		ex.printArr(listArr);
	} //main

} //class
