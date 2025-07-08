package day0225;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FilterOutputStream
 */
public class UseFileOutputStream2 {

	/**
	 * try~with~resources 사용
	 * Stream 연결을 제공하는 객체에서 try~with~resources 를 지원하면 자동으로 연결을 끊어줌
	 */
	public UseFileOutputStream2() {
//		1. 디렉토리를 생성
		File dir=new File("c:/dev/temp");
//		디렉토리가 없으면 생성
		if(!dir.exists()) {
			dir.mkdirs();
		} //end if
		
//		window 경로 구분 \, linux 경로구분 / -> 실행되는 OS 에 맞는 구분자 사용
//		File.separator
//		2. File 생성
		File file=new File(dir.getAbsoluteFile()+File.separator+"/test.txt");
		
//		try~with~resources 를 사용하면 해당 Stream 의 관련된 연결을 모두 자동으로 끊어줌
//		3. Stream 연결
		try(FileOutputStream fos=new FileOutputStream(file)) {
			int data=66;
//			4. Stream 에 데이터를 기록
			fos.write(data);
//			5. Stream 에 기록된 데이터를 목적지로 분출
			fos.flush();	//참조형인 경우에만 실행
			System.out.println("파일에 기록이 완료되었습니다.");
		} catch(IOException ie) {
			ie.printStackTrace();
		} //end try catch
		
	} //UseFileOutputStream
	
	public static void main(String[] args) {
			new UseFileOutputStream2();
	} //main

} //class
