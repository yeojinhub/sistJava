package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class Exam0226Evt implements ActionListener {

	@SuppressWarnings("unused")
	private Exam0226Design ed;
	private JMenuItem jmiOpen;		//파일 > 열기
	private JMenuItem jmiFont;		//편집 > 글꼴
	
	public Exam0226Evt(Exam0226Design ed) {
		this.ed=ed;
		this.jmiFont=ed.getJmiFont();
	} //Exam0226Evt
	
	public void jmiOpenEvt() {
		JFileChooser jfcOpen=new JFileChooser();
		jfcOpen.showOpenDialog(null);
		
		File file=jfcOpen.getSelectedFile();

		if(file==null) {
			return;
		} //end if
	} //jmiOpenEvt
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jmiOpen) {
			System.out.println("열기 버튼 누름");
			jmiOpenEvt();
		} //end if
		
		if(ae.getSource()==jmiFont){
			System.out.println("글꼴 메뉴 누름");
		} //end if
	} //actionPerformed

} //class
