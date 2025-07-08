package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * MainWindow class 의 이벤트를 처리하기위한 클래스
 * (has a 관계)
 */
public class MainWindowEvt extends WindowAdapter implements ActionListener {

	private MainWindow mw;
	
	public MainWindowEvt(MainWindow mw) {
		this.mw=mw;
	} //MainWindowEvt
	
	private void windowClosing() {
//		window 를 종료하기 전에 처리해야할 코드
		mw.dispose();
	} //windowClosing
	
	@Override
	public void windowClosing(WindowEvent we) {
		windowClosing();
	} //windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
//		Dialog 실행
		if(ae.getSource()==mw.getJmiSubWin()) {
			new SubWin(mw);
		} //end if
//		window 종료
		if(ae.getSource()==mw.getJmiClose()){
			windowClosing();
		} //end if
	} //actionPerformed

} //class
