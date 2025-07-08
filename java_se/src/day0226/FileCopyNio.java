package day0226;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * java.nio.file.Paths
 */
public class FileCopyNio {

	public FileCopyNio() throws IOException {
		JFileChooser jfcOpen=new JFileChooser();
		jfcOpen.showOpenDialog(null);
		
		File originalfileName=jfcOpen.getSelectedFile();

		if(originalfileName==null) {
			return;
		} //end if
		
//		복사할 파일명 생성: 원본파일명_copy.확장자
		StringBuilder copyFileName=new StringBuilder(originalfileName.getAbsolutePath());
		copyFileName.insert(copyFileName.lastIndexOf("."), "_copy");
		
		File copyFile=new File(copyFileName.toString());
		
//		1. 원본파일 선택
//		Path originalPath=Paths.get(originalfileName.getAbsolutePath());
		
//		JDK11 에서부터는 Path.of()로 작업가능
		Path original=Path.of(originalfileName.getAbsolutePath());
		
//		2. 복사할 파일 설정
		Path copy=Path.of(copyFile.getAbsolutePath());
		
//		3. 복사 수행
		Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
		  
	} //FileCopyNio
	
	public static void main(String[] args) {
		try {
			new FileCopyNio();
			System.out.println("파일 복사 성공");
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(null, "파일 복사중 문제발생");
			ie.printStackTrace();
		} //end try catch
	} //main

} //class
