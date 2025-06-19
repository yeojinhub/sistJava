package day0224;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import javax.swing.JFileChooser;

/**
 * java.io.File 사용예제
 * 파일에 대한 정보 얻기, 디렉토리 생성 작업, 파일명 변경, 파일 삭제
 */
public class UseFile {

	/**
	 * 파일 정보 얻는 method
	 */
	public void fileInfo(){
//		1. File 객체 생성
		File file=new File("C:/dev/temp/java_read.txt");
		System.out.println(file);
		
//		2. method 호출
		if(!file.exists()) {	//파일이 존재하는지 확인
			return;
		} //end if
		
		System.out.println("파일의 길이 : "+file.length()+"byte");	//byte
		System.out.println(file.isDirectory()?"디렉토리":"파일");
		System.out.println(file.isFile()?"파일":"디렉토리");
		System.out.println(file.canRead()?"읽기 가능":"읽기 불가능");
		System.out.println(file.canWrite()?"쓰기 가능":"쓰기 불가능");
		System.out.println(file.canExecute()?"실행 가능":"실행 불가능");
		
		System.out.println("절대 경로 : "+file.getAbsolutePath());
		try {
//			OS에서 파일에 접근하기 위한 단 하나의 경로
			System.out.println("규범 경로 : "+file.getCanonicalPath());
		} catch(IOException ie) {
			ie.getStackTrace();
		} //end try catch
		
		System.out.println("디렉토리 명 : "+file.getName());	//java_read.txt
		System.out.println("파일명 : "+file.getName());		//java_read.txt
		
//		JFileChooser jfc=new JFileChooser();
//		jfc.showOpenDialog(null);
//		
//		File selectedFile=jfc.getSelectedFile();
//		System.out.println("디렉토리 명 : "+selectedFile.getParent());
//		System.out.println("파일명 : "+selectedFile.getName());
		
		System.out.println(file.isHidden()?"숨김 파일":"일반 파일");
		
		long fileMs=file.lastModified();
		System.out.println("마지막으로 수정된 날짜 : "+fileMs);
		
		Date date=new Date(fileMs);
		System.out.println("마지막으로 수정된 날짜 : "+date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm:ss");
		System.out.println("마지막으로 수정된 날짜 : "+sdf.format(date));
	} //fileInfo();
	
	public void directoryWork() {
		
	} //directoryWork
	
	/**
	 * 파일명 변경 method
	 */
	public void fileRename() {
		
	} //fileRename
	
	/**
	 * 파일 삭제 method
	 */
	public void fileRemove() {
		
	} //fileRemove
	
	public static void main(String[] args) {
		UseFile uf=new UseFile();
		
		System.out.println("파일 정보 얻기");
		uf.fileInfo();
		
		System.out.println("디렉토리 관리");
		uf.directoryWork();
		
		System.out.println("파일명 변경");
		uf.fileRename();
		
		System.out.println("파일 삭제");
		uf.fileRemove();
	} //main

} //class
