package day0226;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

/**
 * UseObjectStream : 객체를 JVM 외부로 내보내고, 읽어들이는 일을 하는 class
 * UserDataVO : 사용자의 데이터를 저장하고 값을 불러내는 class
 */
public class UseObjectStream {

	/**
	 * 객체 쓰는 method
	 * @param udVO
	 * @throws IOException 
	 */
	public void writeObject(File file, UserDataVO udVO) throws IOException {
		ObjectOutputStream oos=null;
		try {
//			1. 객체를 내보낼 수 있는 Stream 생성
			oos=new ObjectOutputStream(new FileOutputStream(file));
//			2. 객체를 잘라서 내보내기 (객체 직렬화)
			oos.writeObject(udVO);
//			3. Stream 데이터 분출
			oos.flush();
		} finally {
			if(oos!=null) {
//				Stream 연결 종료
				oos.close();
			} //end if
		} //end try finally
	} //writeObject
	
	/**
	 * 객체 읽는 method
	 * @return
	 * @throws IOException 
	 */
	public UserDataVO readObject(File file) throws IOException, ClassNotFoundException {
		UserDataVO udVO=null;
		
		ObjectInputStream ois=null;
		
		try {
//			Stream 연결
			ois=new ObjectInputStream(new FileInputStream(file));
//			객체 읽기
			udVO=(UserDataVO)ois.readObject();
		} finally {
			if(ois!=null) {
				ois.close();
			} //end if
		} //end try finally
		
		return udVO;
	} //readObject
	
	public static void main(String[] args) {
		String msg="아래의 번호를 입력하세요\n 1. 객체 쓰기, 2. 객체 읽기";
		String inputMenu=JOptionPane.showInputDialog(msg);
		File file = new File("c:/dev/temp/obj.txt");
		
		UseObjectStream uos=new UseObjectStream();
		
		if(inputMenu!=null) {
			if("1".equals(inputMenu)) {
				try {
					UserDataVO udVO=new UserDataVO("강태일", 185.7, 74.2);
					uos.writeObject(file, udVO);
					System.out.println("객체 쓰기 완료 : "+udVO);
				} catch (IOException ie) {
					ie.printStackTrace();
				} //end try catch
			} 
			if("2".equals(inputMenu)) {
				try {
					UserDataVO udVO=uos.readObject(file);
					System.out.println("객체의 값 읽기"+udVO);
				} catch (IOException ie) {
					ie.printStackTrace();
				} catch(ClassNotFoundException clfe) {
					clfe.printStackTrace();
				} //end try catch
			} //end else if
		} //end if
		
	} //main

} //class
