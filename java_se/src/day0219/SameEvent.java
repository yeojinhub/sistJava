package day0219;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFileChooser;

public class SameEvent extends WindowAdapter implements ActionListener {

	private SameEventDesign sed;
	
	public SameEvent(SameEventDesign sed) {
		this.sed=sed;
	} //SameEvent
	
	@Override
	public void windowClosing(WindowEvent we) {
		sed.dispose();
	} //windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
//		String label=ae.getActionCommand();
//		if(label.equals("파일 다이얼로그 열기")) {
//			System.out.println("열기 버튼을 클릭");
//		} else if(label.equals("파일 다이얼로그 저장")) {
//			System.out.println("저장 버튼을 클릭");
//		} //end if
		
		Object obj=ae.getSource();	//이벤트를 발생시킨 객체의 주소 얻기
		if(obj==sed.getJbtnOpen()) {
			System.out.println("열기 클릭");
			FileDialog fdOpen=new FileDialog(sed,"몰래 열어보세요", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
//			선택한 파일의 경로를 얻기
			String dirOpen=fdOpen.getDirectory();
//			선택한 파일명 얻기
			String fileOpen=fdOpen.getFile();
			System.out.println(dirOpen+fileOpen);
//			titlebar 에 선택한 파일의 경로와 파일명을 추가
			if(dirOpen!=null) {
				sed.setTitle(dirOpen+fileOpen);
			} //end 2nd if
		} //end 1st if
		if(obj==sed.getJbtnSave()) {
//			System.out.println("저장 클릭");
//			FileDialog fdSave=new FileDialog(sed,"몰래 열어보세요", FileDialog.LOAD);
//			fdSave.setVisible(true);
			JFileChooser jfcSave=new JFileChooser();
//			파일 디렉토리와 파일명을 콘솔에 출력
			System.out.println( jfcSave);
		} //end if
	} //actionPerformed

} //class
