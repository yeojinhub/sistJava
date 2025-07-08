package day0225;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * File 과 연결하는 작업
 */
public class UseFileStream {

	/**
	 * 8bit Stream + 16bit StreamBufferedReader 연결하여 사용하는 method
	 */
	public void useFileInputStream() throws IOException{
//		1. File 생성
		File file=new File("c:/dev/temp/java_read.txt");
//		File 이 존재하는지 확인
		if(!file.exists()) {
			System.out.println(file+"이(가) 존재하지 않습니다. 경로를 확인하세요.");
			return;
		} //end if
		
//		2. Stream 연결하여 생성
//		FileInputStream fis=new FileInputStream(file);
//		InputStreamReader isr=new InputStreamReader(fis);
//		BufferedReader br=new BufferedReader(isr);
//		BufferedReader br=new BufferedReader(
//				new InputStreamReader(new FileInputStream(file)));
		
		BufferedReader br=null;
		
//		3. File 안의 내용을 읽기(반복)
		String str="";
		try {
			br=new BufferedReader(
					new InputStreamReader(new FileInputStream(file)));
//			EOF 까지 읽고 반복
			while((str=br.readLine()) != null) {
				System.out.println(str);
			} //end while
		} finally {
//			4. Stream 연결 끊기(반드시 수행해야하는 작업)
//			fis.close();
//			isr.close();
//			br 객체가 null 을 포함할 수 있어 확인
			if(br != null) {
				br.close();
			} //end if
//			if 문이 try catch 보다 더 간결함
//			try {
//				br.close();
//			} catch(NullPointerException npe) {
//				npe.printStackTrace();
//			} //try catch
		} //end try finally
		
	} //useFileInputStream
	
	/**
	 * 16 bit Stream 으로만 구성된 method
	 */
	public void useFileReader() throws IOException{
//		1. File 생성
		File file=new File("c:/dev/temp/java_read.txt");
//		File 이 존재하는지 확인
		if(!file.exists()) {
			System.out.println(file+"이(가) 존재하지 않습니다. 경로를 확인하세요.");
			return;
		} //end if
		
//		2. Stream 연결하여 생성
//		FileReader fr=new FileReader(file);
//		InputStreamReader isr=new InputStreamReader(fis);
//		BufferedReader br=new BufferedReader(isr);
//		BufferedReader br=new BufferedReader(new FileReader(file));
		
		BufferedReader br=null;
		
//		3. File 안의 내용을 읽기(반복)
		String str="";
		try {
			br=new BufferedReader(new FileReader(file));
//			EOF 까지 읽고 반복
			while((str=br.readLine()) != null) {
				System.out.println(str);
			} //end while
		} finally {
//			4. Stream 연결 끊기(반드시 수행해야하는 작업)
//			fis.close();
//			isr.close();
//			br 객체가 null 을 포함할 수 있어 확인
			if(br != null) {
				br.close();
			} //end if
		} //end try finally
		
	} //useFileReader
	
	public static void main(String[] args) {
		UseFileStream ufs=new UseFileStream();
		System.out.println("-----------8bit + 16bit---------------");
		try {
			ufs.useFileInputStream();
		} catch (IOException ie) {
			ie.printStackTrace();
		} //end try catch
		System.out.println("-----------16bit---------------");
		try {
			ufs.useFileReader();
		} catch (IOException ie) {	//FileReader, readLine(), close()
			ie.printStackTrace();
		} //end try catch
	} //main

} //class
