package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * "종료"버튼을 누르면 실행하는 이벤트 클래스
 */
public class Exam0220EvtExit extends WindowAdapter implements ActionListener {

	private Exam0220 ex;
	
	public Exam0220EvtExit(Exam0220 ex) {
		this.ex=ex;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
	} //windowClosing

	@Override
	public void actionPerformed(ActionEvent e) {
		ex.dispose();
	} //actionPerformed

} //Exam0220EvtExit
