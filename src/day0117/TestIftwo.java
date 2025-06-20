package day0117;
//import java.util.Scanner;
/**
 * 단일 if연습
 */
public class TestIftwo {

	public static void main(String[] args) {
		int num=0;
		
		num=Integer.parseInt(args[0]);
//		Scanner sc=new Scanner(System.in);
		System.out.print(num+"은 ");
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}//end if
		
		if(num%2==1) {
			System.out.println("홀수입니다.");
		}//end if
		
	} //main

} //class
