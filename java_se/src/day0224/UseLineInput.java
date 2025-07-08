package day0224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드로 입력한 엔더가 쳐지기 전까지의 한줄을 읽어오는 예제
 * - 한글이 깨짐 : Stream 결합
 */
public class UseLineInput {

	public UseLineInput() throws IOException{
		System.out.println("당신의 이름을 넣고 엔터를 입력해주세요.");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String name=br.readLine();
			System.out.println("이름 : " +name);
		} finally {
//			반드시 실행되어야 하는 코드
			if(br != null) {
				br.close();
			} //end if
		} //end finally
		
	} //UseLineInput
	
	public static void main(String[] args) {
		try {
//			업무처리 코드
			new UseLineInput();
		} catch(IOException ie) {
//			문제가 발생했을 때 처리코드를 분리하여 작성할 수 있다.
			ie.printStackTrace();
		} //end try catch
	} //main

} //class
