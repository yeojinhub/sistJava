package day0224;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class UseSystemIn {

	public static void main(String[] args) {
		System.out.println("아무 키 하나만 누르고 엔터");
		
		try {
//			int input=System.in.read();
//			System.out.println("입력 값 : "+input);
			int input=0;
			System.out.println(KeyEvent.VK_ENTER);
			
			while((input=System.in.read()) != 10) {
				System.out.println("입력 값 : "+(char)input);
			} //end while
			
		} catch(IOException ie) {
			ie.printStackTrace();
		} //end try catch
		
	} //main

} //class
