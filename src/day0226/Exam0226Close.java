package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenuItem;

public class Exam0226Close extends WindowAdapter implements ActionListener {

	private Exam0226Design ed;
	private JMenuItem jmiClose;		//파일 > 닫기
	
	public Exam0226Close(Exam0226Design ed) {
		this.ed=ed;
		this.jmiClose=ed.getJmiClose();
	} //Exam0226Close

	@Override
	public void windowClosing(WindowEvent we) {
		super.windowClosing(we);
	} //windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jmiClose) {
			ed.dispose();
		} //end if
	} //actionPerformed
	
} //Exam0226Close
