package day0212;

import java.util.Scanner;

/**
 * Scanner 사용예제
 */
public class UseScanner {
	
	public UseScanner() {
//		콘솔에 입력되는 키보드값 받기
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력해주세요");
//		이벤트가 발생하기 전까지 멈추지 않고 계속 동작을 이어나감(공백은 인식X)
//		이벤트 발생하면 동작 멈춤 : blocking method
//		String temp=sc.next();
		
//		한 줄을 입력받음(공백 인식O), 이벤트 발생하면 멈춤
		String temp=sc.nextLine();

		System.out.println("입력 값 : "+temp);
		
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();
		System.out.println("당신의 나이 : "+age);
		
		System.out.println("태어난 년도를 입력하세요");
		int year=sc.nextInt();
		System.out.println("태어난 년도 : "+year);
		
//		정수나 실수를 입력받은 후 문자열 입력받을 수 없음, 한번더 입력받음
		sc.nextLine();

//		문자열 입력가능
		System.out.println("현재 거주지를 입력하세요");
		String address=sc.nextLine();
		System.out.println("현재 거주지 : "+address);
	}

	public static void main(String[] args) {
		new UseScanner();
	} //main

} //class
