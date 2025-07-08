package day0224;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/** 
 * java.io.FileInputStream 사용하여 파일의 내용 읽기
 */
public class UseFileInputStream {

	public UseFileInputStream() throws IOException {
	
		JFileChooser jfc=new JFileChooser("c:/dev");
		jfc.showOpenDialog(null);
		
		File file=jfc.getSelectedFile();
		
//		파일이 존재하는지 확인
		if( !file.exists()) {
			JOptionPane.showMessageDialog(null, "파일이 존재하지 않습니다.");
			return;
		} //end if
		
//		Stream 생성
		FileInputStream fis=new FileInputStream(file);
		
		int readData=0;
		try {
			while((readData=fis.read()) != -1) {
				System.out.print((char)readData);
			} //end while
		} finally {
			if(fis != null) {
				fis.close();
			} //end if
		} //end try catch
		
	} //UseFileInputStream
	
	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	} //main

} //class
