package day0225;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 
 */
public class FileCopy {

	public FileCopy() throws IOException {
		JFileChooser jfcOpen=new JFileChooser();
		jfcOpen.showOpenDialog(null);
		
		File file=jfcOpen.getSelectedFile();

		if(file==null) {
			return;
		} //end if
		
//		복사할 파일명 생성: 원본파일명_copy.확장자
		StringBuilder copyFileName=new StringBuilder(file.getAbsolutePath());
		copyFileName.insert(copyFileName.lastIndexOf("."), "_copy");
		
		File copyFile=new File(copyFileName.toString());
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
//			파일에서 데이터를 읽기위한 Stream 연결
			fis=new FileInputStream(file);	//원본 파일과 연결
			
//			파일에서 데이터를 쓰기위한 Stream 연결
			fos=new FileOutputStream(copyFile);
			
//			int fileData=0;
////			데이터를 읽어들여 EOF 아닐 경우 실행 : HDD 의 특성을 무시한 코드 -> 속도 느림
//			while((fileData=fis.read())!=-1) {
////				Stream 에 데이터를 한 byte 씩 쓰기
//				fos.write(fileData);
//			} //end while
			
//			Stream 에 기록된 데이터를 목적지로 분출
			fos.flush();
			
//			HDD의 head 는 한번에 제조사마다 다르긴 하지만 일반적으로 512byte씩 읽어들임
			byte[] readData=new byte[512];
			int readSize=0;
			int cnt=0;
//			while((readSize=fis.read(readData)) !=-1) {
			while((readSize=fis.read()) !=-1) {
//				읽어들인 배열의 0번째 방부터 배열의 크기까지를 Stream 에 쓴다
				fos.write(readData,0,readSize);
			} //end while
			fos.flush();
			System.out.println("총 "+cnt+"번 읽어들임");
			
		} finally {
//			Stream 연결종료
			if(fis!=null) {
				fis.close();
			} //end if
			if(fos!=null) {
				fos.close();
			} //end if
		} //end try finally
		
	} //FileCopy
	
	public static void main(String[] args) {
		try {
			new FileCopy();
			System.out.println("파일 복사 성공");
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(null, "파일 복사중 문제발생");
			ie.printStackTrace();
		} //end try catch
	} //main

} //class
