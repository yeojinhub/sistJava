package day0225;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * java.io.FilterOutputStream
 */
public class UseFileOutputStream {

	public UseFileOutputStream() throws IOException {
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
		
//		File 이 있으면 true, 없으면 false 값 반환
		boolean writeFlag=file.exists();

//		writeFlag 변수를 사용한 분기 여부 설정
		if(writeFlag) {
//			File 이 존재하면 덮어씌울것인지를 confirmDialog() 를 사용하여 물어보고
			switch(JOptionPane.showConfirmDialog(null, file+"이 존재합니다. 파일을 덮어씌우시겠습니까?")) {
//				예가 눌리면 덮어쓰고, 아니오나 취소 눌리면 실행하지않고 나가기
			case JOptionPane.OK_OPTION:
				writeFlag=false;
				break;
			} //end switch
		} //end if
		
		if(writeFlag) {
			System.out.println("파일을 덮어씌우지 않았습니다.");
			return;
		} //end if
		
		FileOutputStream fos=null;
		try {
//			3. Stream 연결
			fos=new FileOutputStream(file);
			int data=66;
//			4. Stream 에 데이터를 기록
			fos.write(data);
//			5. Stream 에 기록된 데이터를 목적지로 분출
			fos.flush();	//참조형인 경우에만 실행
			System.out.println("파일에 기록이 완료되었습니다.");
		} finally {
//			fos 객체가 생성(생성되어 있지 않으면 null)되어있다면 실행
			if(fos!=null) {
//				6. Stream 연결종료 (Stream 에 남아있는 데이터가 목적지로 분출되고 연결이 끊어짐)
				fos.close();
			} //end if
		} //end try finally
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	} //UseFileOutputStream
	
	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException ie) {
			ie.printStackTrace();
		} //end try catch
	} //main

} //class
