package day0226;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * java.io.DataInputStream/FileInputStream
 * java.io.DataOutputStream
 * readInt method
 */
@SuppressWarnings("serial")
public class UseDataStream extends JFrame{
	
	public void useDataOutputStream(File file) {
		int age=25; 
				
//		Java 기본형 데이터형을 외부로 내보낼 수 있는 Stream 연결
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
//			Stream 에 데이터 기록
			dos.writeInt(age);
//			Stream 데이터를 외부로 분출
			dos.flush();
		} catch(IOException ie) {
			ie.printStackTrace();
		} //end try catch
	} //useDataOutputStream
	
	public void useDataInputStream(File file) {
//		Java 기본형 데이터형을 외부로 내보낼 수 있는 Stream 연결
		try(DataInputStream dis=new DataInputStream(new FileInputStream(file))){
//			Stream 에 데이터 기록
			int data=dis.readInt();
			System.out.println("읽어들인 데이터 : "+data);
		} catch(IOException ie) {
			ie.printStackTrace();
		} //end try catch
	} //useDataInputStream
	
	public static void main(String[] args) {

		UseDataStream uds=new UseDataStream();
		File file=new File("c:/dev/temp/data_output.txt");
		String msg="데이터를 JVM외부로 내보내시겠습니까?";
		
		switch(JOptionPane.showConfirmDialog(null, msg)) {
		case JOptionPane.OK_OPTION :
			uds.useDataInputStream(file);
			break;
		case JOptionPane.NO_OPTION :
			switch(JOptionPane.showConfirmDialog(null, "데이터를 JVM내부로 읽어 들이시겠습니까?")) {
			case JOptionPane.OK_OPTION :
				uds.useDataOutputStream(file);
				break;
			} //end 2nd switch
		} //end 1st switch
		
	} //main

} //class
