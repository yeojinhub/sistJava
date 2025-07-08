package day0221;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 출력할 구구단의 정수를 입력받고
 * 구구단을 출력하는 예제
 * 입력받는 값은 2~9 까지의 정수
 */
public class Gugudan {

	/**
	 * 출력할 구구단의 정수를 입력받는 method
	 * @return input 입력받은 정수 값
	 */
	public int multiplicationInput() {
		int input=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("출력할 구구단 입력");
		input=scan.nextInt();
		scan.close();
		
		return input;
	} //multiplicationInput
	
	/**
	 * 구구단 출력하는 method
	 * @param input 입력받은 정수 값
	 * @throws MultiplicationException
	 */
	public void printMultiplicationTable(int input) throws MultiplicationException{
		
		if(!(input > 1 && input < 10)) {
			throw new MultiplicationException();
		} //end if
		
		System.out.println(input+"단");
		
		for(int i=1; i<10; i++) {
			System.out.println(input+"x"+i+"="+input*i);
		} //end for
	} //printMultiplicationTable
	
	public static void main(String[] args) {
		Gugudan ex=new Gugudan();
		
		String msg="구구단 출력완료";
		try {
			ex.printMultiplicationTable(ex.multiplicationInput());
		} catch (MultiplicationException me) {
			msg=me.getMessage();
			me.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, msg);
		} //end try catch
		
	} //main

} //class
