package day0219;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * window event 처리
 */
@SuppressWarnings("serial")
//1.window Event 처리하기 위해 WindowListener 구현
public class TestWindowEvent extends Frame implements WindowListener{

	public TestWindowEvent() {
		super("윈도우 이벤트 처리");
		
//		발생된 Window Event 등록
		addWindowListener(this);
		setBounds(100,100,400,300);
		setVisible(true);
	} //TestWindowEvent
	
	public static void main(String[] args) {
		new TestWindowEvent();
	} //main

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	} //windowOpened

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	} //windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	} //windowClosed

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	} //windowIconified

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	} //windowDeiconified

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	} //windowActivated

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	} //windowDeactivated

} //class
