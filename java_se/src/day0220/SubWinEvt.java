package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * SubWin class 의 이벤트 처리하는 클래스
 */
public class SubWinEvt extends WindowAdapter implements ActionListener {

	private SubWin sw;
	
	public SubWinEvt(SubWin sw) {
		this.sw=sw;
	} //SubWinEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		sw.dispose();
	}  //windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		sw.dispose();
	} //actionPerformed

} //class
